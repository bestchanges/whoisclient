# whoisclient
Querying and parsing Java whois client

Adapted from python-whois (https://bitbucket.org/richardpenman/pywhois), Copyright Richard Penman, MIT license

# Rationale 

The existing Java whois clients, such as the one in Apache Commons Net, can query whois servers, which is simple. Parsing the completely non-standard records returned by the various TLDs is not simple. The python-whois library does a reasonably good job of this, so I ported it to Java.
