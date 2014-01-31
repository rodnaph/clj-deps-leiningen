
(ns leiningen.clj-deps
  (:require [clj-http.client :as http]
            [boxuk.versions :refer [later-version? latest-version latest-stable]]))

(def url "http://clj-deps.herokuapp.com")

(def icon-ok "\u001B[0;36m✓\u001B[0m")
(def icon-bad "\u001B[0;31m✘\u001B[0m")

(defn clj-deps [project & args]
  (let [submit (str url "/submit")
        data {:body (pr-str project)}
        deps (-> (http/post submit data)
                 :body
                 (read-string)
                 :all-dependencies)]
    (println "")
    (println " Dependency Status")
    (println " -----------------")
    (println "")
    (doseq [[title current versions] deps]
      (let [latest (latest-version versions)
            upgrade? (later-version? current latest)]
        (println (format " %s  %s%s"
                         (if upgrade? icon-bad icon-ok)
                         title
                         (if upgrade? (str " ... " latest) "")))))
    (println "")
    (println " Via: " url)
    (println "")))

