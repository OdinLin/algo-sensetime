package com.sensetime.ad.dm.scalatest

/**
  * Created by yuanpingzhou on 1/13/17.
  */
object OrientedObject {
  case class Person(var name: String,var age: Int)

  object Person {
    def apply() = new Person("<no name>", 0)
    def apply(name: String) = new Person(name, 0)
  }

  class Brain private {
    override def toString = "this is brain"
    //def toWhat = "what"
  }

  object Brain{
    def getInstance = new Brain
  }

  abstract class Animal {
    val greeting = { println("Animal"); "Hello" }
  }

  class Dog extends Animal {
    override val greeting = { println("Dog"); "Woof" }
  }

  def main(args: Array[String]) = {
    // customer-defined constructor for case class
    val p0 = Person()
    println(s"${p0.name} ${p0.age}")

    val ret = Brain.getInstance
    println(ret)
  }
}
