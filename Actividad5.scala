import scala.math._
import scala.io.StdIn._
import scala.io.Source
object Prueba{	
	def main(args: Array[String])={
    println("Lineas: "+obtenerCantidadLineas)
    println("Lineas en blanco: "+obtenerCantidadLineasEnBlanco)
    println("Parentesis Balanceados: "+obtenerParentesis)
    println("Llaves Balanceadas: "+obtenerLlaves)
    println("Corchetes Balanceados: "+obtenerCorchetes)
	}
  def obtenerCantidadLineas(): Int = {
    var lineas = scala.io.Source.fromFile("Test.java").getLines
    lineas.length
  }
  def obtenerCantidadLineasEnBlanco(): Int = {
    var lineas = scala.io.Source.fromFile("Test.java").getLines
    obtenerCantidadLineas - lineas.count(_.nonEmpty)
  }
  def obtenerParentesis(): Int = {
    var lineas = scala.io.Source.fromFile("Test.java")
    var pA = 0
    var pC = 0
    for(char<-lineas){
      if(char.compare('(')==0)
        pA += 1
      if(char.compare(')')==0)
        pC += 1
    }
    if(pA <= pC)
      pA
    else
      pC
  }
  def obtenerCorchetes(): Int = {
    var lineas = scala.io.Source.fromFile("Test.java")
    var cA = 0
    var cC = 0
    for(char<-lineas){
      if(char.compare('[')==0)
        cA += 1
      if(char.compare(']')==0)
        cC += 1
    }
    if(cA <= cC)
      cA
    else
      cC
  }
  def obtenerLlaves(): Int = {
    var lineas = scala.io.Source.fromFile("Test.java")
    var lA = 0
    var lC = 0
    for(char<-lineas){
      if(char.compare('{')==0)
        lA += 1
      if(char.compare('}')==0)
        lC += 1
    }
    if(lA <= lC)
      lA
    else
      lC
  }
}