package lectures.basics

object Expressions extends App {
  val x = 1 + 2 // EXPRESSION
  println(x)

  println(2 + 3 * 4)
  // + - * / & | ^ << >> >>>  (right shift with zero extension)

  println(1 == x)
  // == != > >= < <=

  println(!(1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= ..... side effects
  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE)
  // Instructions are executed (think Java), expressions are evaluated (Scala)
  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)
  println(1 + 3)

  var i = 0
  while (i < 10) {
    println(i)
    i += 1
  }
  // NEVER WRITE THIS AGAIN.

  // EVERYTHING in Scala is an Expression!

  val aWeiredValue = (aVariable = 3)
  // Type annotation required for Unit definition
  // Unit === void
  println(aWeiredValue)

  // side effects: println(), whiles, reassigning

  // Code blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"
  }
  println(aCodeBlock)

  // 1. Difference between "hello world" vs println("hello world")?
  // -> "hello world" is string
  // -> "println("hello world") is side effect

  // 2. What value of someOtherValue?
  val someValue = {
    2 < 3
  }

  val someOtherValue = {
    if(someValue) 239 else 987
    42
  }

  println(someOtherValue)
}
