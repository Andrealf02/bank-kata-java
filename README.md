# Comportamiento deseado
Esta es la especificación para una prueba de aceptación que expresa el comportamiento deseado:

Si un cliente hace un depósito de 1000 el 10-01-2012
Y un depósito de 2000 el 13-01-2012
Y retira 500 el 14-01-2012
Al imprimir su extracto bancario vería lo siguiente:

Date       || Amount || Balance
14/01/2012 || -500   || 2500
13/01/2012 || 2000   || 3000
10/01/2012 || 1000   || 1000

# Observaciones
Estamos utilizando ints para las cantidades de dinero y para mantener los auxiliares lo más simple posible. En un sistema real, utilizaríamos un tipo de dato con precisión arbitraria garantizada, pero en este caso nos distraería del objetivo principal del ejercicio.
No te preocupes por el espaciado y la sangría en el output statement. (Si quieres, puedes indicarle a tu prueba de aceptación que ignore los espacios en blanco).
Utiliza la prueba de aceptación para guiar tu progreso hacia la solución. Sandro aplica esto al hacer que todos los métodos no implementados lancen una excepción. De este modo, puede ver inmediatamente lo que queda por implementar cuando ejecuta la prueba de aceptación.
Siempre que tengas una duda, ¡opta por la solución más sencilla!
