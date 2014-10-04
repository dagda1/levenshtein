(ns levenshtein.core)

(defn levenshtein [newStr oldStr]
  "a Clojure levenshtein implementation using transient data structure"
  (let [n (count newStr) m (count oldStr)]
    (cond
     (= 0 n) m
     (= 0 m) n
     :else
     (let [prev-col (transient (vec (range (inc m)))) col (transient [])]
       (dotimes [i n]
         (assoc! col 0 (inc i))
         (dotimes [j m]
           (assoc! col (inc j)
                   (min (inc (get col j))
                        (inc (get prev-col (inc j)))
                        (+ (get prev-col j) (if (= (get newStr i) (get oldStr j)) 0 1)))))
         (dotimes [i (count prev-col)]
           (assoc! prev-col i (get col i))))
       (last (persistent! col))))))

;(levenshtein "gambol" "gumbo")

