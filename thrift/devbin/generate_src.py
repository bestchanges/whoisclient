import os.path
from shutil import copyfile
import sys

try:
    __import__('thryft')
    raise RuntimeError('thryft should not be on the PYTHONPATH already')
except ImportError:
    pass

MY_DIR_PATH = os.path.dirname(os.path.realpath(__file__))
ROOT_DIR_PATH = os.path.abspath(os.path.join(MY_DIR_PATH, '..', '..'))
THRYFT_ROOT_DIR_PATH = os.path.abspath(os.path.join(ROOT_DIR_PATH, '..', 'thryft'))
assert os.path.isdir(THRYFT_ROOT_DIR_PATH), THRYFT_ROOT_DIR_PATH
sys.path.insert(0, os.path.join(THRYFT_ROOT_DIR_PATH, 'compiler', 'src'))

from thryft.compiler import Compiler
from thryft.generators.java.java_generator import JavaGenerator
from thryft.generators.lint.lint_generator import LintGenerator
import thryft.main
from yutil import camelize


class Main(thryft.main.Main):
    def _clean(self):
        for dir_path in (
             os.path.join(ROOT_DIR_PATH, 'java', 'src', 'gen', 'java'),
        ):
            if os.path.isdir(dir_path):
                shutil.rmtree(dir_path)

    def _compile(self):
        thrift_src_dir_path = os.path.join(ROOT_DIR_PATH, 'thrift', 'src')
        assert os.path.isdir(thrift_src_dir_path)

        java_generator = \
            JavaGenerator(
                default_methods=True,
                function_overloads=True,
                namespace_prefix='io.github.minorg.'
            )
        lint_generator = LintGenerator()

        for pass_i in xrange(2):
            # Two passes: one to test-compile all .thrift files, the other to generate them
            # ASTs are cached in the compiler so this only costs us the file system traversal,
            # and avoids generating code when there's a compilation error
            for thrift_file_path in self._get_thrift_file_paths(thrift_src_dir_path):
                compile_kwds = {
                    'document_root_dir_path': thrift_src_dir_path,
                    'thrift_file_path': thrift_file_path
                }

                if pass_i == 0:
                    self._compile_thrift_file(
                        generator=lint_generator,
                        **compile_kwds
                    )

                    continue

                self._compile_thrift_file(
                    generator=java_generator,
                    out=os.path.join(ROOT_DIR_PATH, 'java', 'src', 'gen', 'java'),
                    **compile_kwds
                )

assert __name__ == '__main__'
Main.main()
