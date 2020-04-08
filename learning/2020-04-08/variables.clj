; `def` is used to declare "variables".
; In line 4, for example, the value `1` is associated to the `x` symbol.

(def x 1)
(def y 2)
(def x+y (+ x y))
(def out (str "The sum of " x " and " y " is " x+y "."))

(println out)
