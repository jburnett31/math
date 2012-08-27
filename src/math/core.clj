(ns math.core)

(defn read-expression [expr]
  (let [vars (re-seq #"[+-*/]?\d*(\w+)[\^]?\d*" expr)]))

(defn solve [expr]
  (read-expression expr)
  )

(defn differentiate [expr]
  (read-expression expr)
  )

(defn -main
  "I don't do a whole lot."
  [& args]
  (println "Hello, World!"))
