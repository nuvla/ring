(ns sixsq.nuvla.server.error-test
  (:require
    [clojure.test :refer :all]
    [sixsq.nuvla.server.error :as e]))

(deftest test-sum
  (is (= 2 (e/sum 1 1))))
