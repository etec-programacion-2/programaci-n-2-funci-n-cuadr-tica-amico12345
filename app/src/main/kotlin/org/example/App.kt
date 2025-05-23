/*
 * This source file was generated by the Gradle 'init' task
 */
package org.example

import kotlin.system.exitProcess

// Creamos la funcion para calcular el valor de la funcion con una tabla de valores
fun calcularRaices(a: Int, b: Int,c: Int) {
        for (x in -5..5) {
        val funcion = a*x*x + b*x + c
        println("El resultado cuando x es igual a $x: $funcion")
    }
}

//Funcion para calcular la discriminante
fun discriminante(a: Int, b: Int,c: Int): Int{
    val disc= b*b-4*a*c
    println("El valor de la discriminante es $disc")
    if (disc > 0) {
        println("La raíz es RRD")  // Raíces Reales y Distintas
    } else if (disc == 0) {      // Comparación con Int (no Double)
        println("La raíz es RRU")  // Raíz Real Única (doble)
    } else {
        println("La raíz es RCC")  // Raíces Complejas Conjugadas
    }
    return disc
}

//Creamos la funcion para calcular las raices
fun raices(disc: Int,b: Int,a: Int){
    val raizDisc=Math.sqrt(disc.toDouble())
    val r1 : Double =(-b+raizDisc)/(2*a)
    println("La primera raíz es: ${"%.2f".format(r1)}") //${"%.2f".format(r1)} nos da el valor con 2 decimales
    val r2 : Double =(-b-raizDisc)/(2*a)
    println("La segunda raíz es: ${"%.2f".format(r2)}") //${"%.2f".format(r2)} nos da el valor con 2 decimales
}

//Arranca el codigo
fun main() {
    // Paso 1 crear funcion cuadratica
   val a=4
   val b=6
   val c=1 

   if(a<=0) {
        println ("a debe ser mayor a 0")
        exitProcess(0) //Sirve para que finalize ahi el codigo
    }
    println("La función es $a x²+$b x+$c")

    // Paso 2 calcular funcion cuadratica
    calcularRaices(a,b,c) //Llama a la funcion para la tabla de valores

    //Paso 3 calcular raices
    //Llama a la funcion que calcula la discriminiante.
    //Le puse una variable para poder usarla en la siguiente funcion
    var valorDisc=discriminante(a,b,c) 
    raices(valorDisc,b,a) //Calcula las raices
}
