package lectures.basics

object ValuesObjectsTypes extends App {
  val x: Int = 42
  println(x)

  // VALs are immutable
  // x = 5

  // COMPILER can infer types
  // val x = 5

  val aString: String = "hello"
  val anotherString = "goodbye"

  val aBoolean: Boolean = true
  val aChar: Char = 'a'
  val anInt: Int = x
  val aShort: Short = 3450
  val aLong: Long = 2342343320038383L
  // To create a Long literal you must add L to the end of it.
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  // Variables
  // VARs are mutable
  var aVariable: Int = 4

  aVariable = 5 // side effects
}
