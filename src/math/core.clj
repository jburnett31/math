(ns math.core
  (:require [clojure.string :as string]))

(comment
  (defn read-expression [expr]
  (let [vars (re-seq #"[\+\-\*\/]?\s*\d*([A-Za-z]+)[\^]?\d*" expr)
        coeffs (re-seq #"[\+\*\/]?([\-]?)\s*(\d*)[A-Za-z]+[\^]?\d*" expr)
        expo (re-seq #"[\+\-\*\/]?\s*\d*[A-Za-z]+[\^]?(\d*)" expr)
        ops (re-seq #"([\+\-\*\/]?)\s*\d*[A-Za-z]+[\^]?\d*" expr)
        const (re-seq #"([\+\-]?)\s+(\d*\s+ | \d*$)" expr)]
    (println vars)
    (println coeffs)
    (println expo)
    (println ops)
    (println const)
    (map #(string/join (next %)) coeffs))))

(defn read-expression [expr]
  (let [tmp (string/split expr #"\s+")
        ops (filter #(re-matches #"[\+\-\*\/]" %) tmp)]
    ops))

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
