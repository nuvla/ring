(ns sixsq.nuvla.server.error-test
  (:require
    [clojure.test :refer :all]
    [sixsq.nuvla.server.example :as e]))

(deftest error
  (is (= 500 (:status (e/handler nil)))))

(deftest success
  (is (= 200 (:status (e/handler nil)))))
