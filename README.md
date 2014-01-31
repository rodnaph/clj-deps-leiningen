
# Clojure Dependencies Plugin

This is a Leiningen plugin to allow checking the status of your dependencies
from the shell.

## Usage

```
%> lein clj-deps

 Dependency Status
 -----------------

 ✘  org.clojure/clojure ... 1.6.0-alpha3
 ✘  compojure/compojure ... 1.2.0-SNAPSHOT
 ✓  salesforce/salesforce
 ✘  cheshire/cheshire ... 5.3.1
 ✘  ring-mock/ring-mock ... 0.1.5
 ✘  ring/ring-devel ... 1.2.1

```

## Installation

Add this to your _~/.lein/profiles.clj_ file, for example...

```clojure
{:user {:plugins [[rodnaph/clj-deps-leiningen "0.1.0"]]}}
```

Latest version can be found on
[Clojars](https://clojars.org/rodnaph/clj-deps-leiningen)

