(ns levenshtein.core-test
  (:require [clojure.test :refer :all]
            [levenshtein.core :refer :all]))

(deftest test-levenshtein
  (is (= 1 (levenshtein "abc" "abb"))))

;; (deftest test-levenshtein
;;   (is (= 0 (levenshtein "abc" "abc")))
;;   (is (= 1 (levenshtein "abc" "abb")))
;;   (is (= 3 (levenshtein "Saturday" "Sunday")))
;;   (is (= 3 (levenshtein "Sunday" "Saturday")))
;;   (is (= 3 (levenshtein "kitten" "sitting"))))

;; (deftest levenshtein-distance-test
;;   (are [a b d] (= (levenshtein-distance a b) d)
;;        "aba" "aba" 0
;;        "aba" "ada" 1
;;        "abca" "aca" 1
;;        "abma" "aca" 2
;;        "kitten" "sitting" 3
;;        "Saturday" "Sunday" 3
;;        "gumbo" "gambol" 2
;;        "nBP8GaFHVls2dI8h9aK1FWdRgevf43" "925BCPcYhT5hs8L9T3K2T5C7U3Lz5v" 28
;;        [1 2 4] [1 2 4 3] 1))
