(def parent-version "6.8.0")
(def slf4j-version "2.0.12")
(def logback-version "1.5.3")

(defproject com.sixsq.nuvla/ring
  ; x-release-please-start-version
  "2.1.7"
  ; x-release-please-end

  :description "simple ring container for micro-services"

  :url "https://github.com/nuvla/server"

  :license {:name         "Apache 2.0"
            :url          "http://www.apache.org/licenses/LICENSE-2.0.txt"
            :distribution :repo}

  :plugins [[lein-parent "0.3.9"]
            [lein-libdir "0.1.1"]]

  :libdir-path "target/lib"

  :parent-project {:coords  [sixsq.nuvla/parent ~parent-version]
                   :inherit [:plugins
                             :repositories
                             :deploy-repositories]}

  :source-paths ["src"]

  :resource-paths ["resources"]

  :pom-location "target/"

  :aot [com.sixsq.nuvla.server.ring]

  :dependencies
  [[aleph "0.7.1"]
   [environ "1.2.0"]
   [ring/ring-core "1.12.1"]
   [org.clojure/clojure "1.11.2"]
   [org.clojure/tools.logging "1.3.0"]
   [org.slf4j/slf4j-api ~slf4j-version]
   [org.slf4j/log4j-over-slf4j ~slf4j-version]
   [org.slf4j/jul-to-slf4j ~slf4j-version]
   [org.slf4j/jcl-over-slf4j ~slf4j-version]
   [ch.qos.logback/logback-classic ~logback-version]
   [ch.qos.logback/logback-core ~logback-version]]

  :profiles
  {:test    {:source-paths          ["test"]
             :resource-paths        ["test-resources"]
             :plugins               [[lein-test-report-junit-xml "0.2.0"]]
             :test-report-junit-xml {:output-dir "test-reports"}}
   :dev     {:dependencies [[clj-kondo "RELEASE"]]}})
