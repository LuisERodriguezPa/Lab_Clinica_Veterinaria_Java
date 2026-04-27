Luis Rodriguez<br>
Luis Salgado<br>
Julian Valderrama

<b>Pregunta de diseño: ¿Qué pasaría si alguien intenta hacer new Animal("Luna", 3,
"Carlos")? ¿Cuándo lo detecta Java — en compilación o en ejecución? ¿Por qué?</b><br>
Rta: lo detecta en compilacion porque es un error del programador intentar crear un objeto de una clase abstracta y java eso no lo permite y lo marca como un error.
es un error de sintaxis no de logica por eso el compilador lo detecta como error.

<b>¿Cómo llamas al constructor del padre desde la subclase?</b><br>
con la palabra reservada super

<b>¿Qué anotación indica que estás cumpliendo un contrato del padre?</b><br>
@override

<b>¿Por qué Java te obliga a implementar calcularCostoConsulta()?<b><br>
porque es un metodo abstracto y cuando heredo de una clase abstracta debo implementar todos sus metodos abstractos
