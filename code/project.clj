(def +version+ "0.0.1-SNAPSHOT")

(defproject sixsq.nuvla.ring/code "0.0.1-SNAPSHOT"

  :description "simple ring container for micro-services"

  :url "https://github.com/nuvla/server"

  :license {:name "Apache 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0.txt"
            :distribution :repo}

  :plugins [[lein-parent "0.3.2"]]

  :parent-project {:coords  [sixsq.nuvla/parent "6.1.0"]
                   :inherit [:plugins
                             :min-lein-version
                             :managed-dependencies
                             :repositories
                             :deploy-repositories]}

  :source-paths ["src"]

  :resource-paths ["resources"]

  :pom-location "target/"

  :aot [sixsq.nuvla.server.ring]

  :dependencies
  [[org.clojure/clojure]
   [org.clojure/tools.logging]
   [aleph]
   [environ]
   [log4j]
   [org.slf4j/slf4j-log4j12]]

  :profiles
  {:test     {:source-paths   ["test"]
              :resource-paths ["test-resources"]}})
