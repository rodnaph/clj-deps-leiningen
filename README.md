
# Clojure Dependency Checker via Leiningen

This is a Leiningen plugin to allow checking the status of your dependencies
from the shell.

## Usage

```
lein clj-deps
```

## Installation

Add this to your _~/.lein/profiles.clj_ file, for example...

```clojure
{:user {:plugins [[rodnaph/clj-deps-leiningen "0.1.0"]]}}
```

Latest version can be found on [Clojars](https://clojars.org/
