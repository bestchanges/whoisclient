# whoisclient
Querying and parsing Java whois client

# Rationale 
Based on whoisclient by (https://github.com/minorg/whoisclient) but totally rewritten.

# Features and changes
* support whois servers for the most of modern domains
* support hierarchic lookup in parent whois servers
* uses simple key-value map for data access. Supports multiple values for key
* search value by several keys in single call
* get rid of huge regexps, and reflections

# TODO
* use predefined list of whois servers in order to stop abusing whois.iana.org each time


