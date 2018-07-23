(ns print-levels.core)

(defrecord Node [val left right])

(defn print-levels [tree]
  (if tree
    (loop [queue [tree] output [tree]]
      (if (seq queue)
        (let [{:keys [left right]} (first queue)]
          (recur (cond-> (rest queue)
                         (some? left) (conj left)
                         (some? right) (conj right))
                 (cond-> output
                         (some? left) (conj left)
                         (some? right) (conj right))))
        (map :val output)))))
