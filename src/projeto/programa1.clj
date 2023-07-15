(ns projeto.programa1)

(println "Hello World")

;;(defn fibonacci
;;  "Funcao de fibonacci extremamente ineficiente e recursica"
;;  [valor]
;;  (if (= valor 0)
;;    0
;;    (if (= valor 1)
;;      1
;;      (+ (fibonacci (dec valor))(fibonacci (- valor 2))))))
(defn fibonacci-implement
  [lista, atual, final]
  (if (<= final 0N)
    (get lista 0)
    (if (== final 1N)
      (get lista 1)
      (if (== atual final)
        (+ (get lista (- atual 1))(get lista (- atual 2)))
        (fibonacci-implement (
          conj lista (+ (lista(- atual 1))(lista(- atual 2))))
          (inc atual)
          final)))))
  
(defn fibonacci
  [valor]
  (fibonacci-implement [0N,1N] 2 valor))



(println (fibonacci 12N))
