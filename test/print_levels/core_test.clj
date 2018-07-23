(ns print-levels.core-test
  (:require [clojure.test :refer :all]
            [print-levels.core :refer :all]))

(deftest print-levels-test
  (is (= nil
         (print-levels nil)))

  (is (= [1 2 3 4]
         (print-levels (->Node 1 (->Node 2 (->Node 4 nil nil) nil) (->Node 3 nil nil))))))
