(def parent-version "6.7.6")

(defproject sixsq.nuvla.ring/code "2.0.5-SNAPSHOT"

  :description "simple ring container for micro-services"

  :url "https://github.com/nuvla/server"

  :license {:name "Apache 2.0"
            :url "http://www.apache.org/licenses/LICENSE-2.0.txt"
            :distribution :repo}

  :plugins [[lein-parent "0.3.5"]]

  :parent-project {:coords  [sixsq.nuvla/parent ~parent-version]
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
  [[aleph]
   [environ]
   [log4j]
   [org.clojure/clojure]
   [org.clojure/tools.logging]
   [org.slf4j/slf4j-api]
   [org.slf4j/slf4j-log4j12]
   [ring/ring-core]                                         ;; added to force version
   ]

  :profiles
  {:test     {:source-paths   ["test"]
              :resource-paths ["test-resources"]
              :plugins [[org.clojars.konstan/lein-test-report-sonar "0.0.4"]]
              :test-report-sonar {:output-dir "test-reports"
                                  :emit-junit-xml true}}
   :dev {:dependencies [[clj-kondo "RELEASE"]]}})
