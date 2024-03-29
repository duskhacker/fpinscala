package fpinscala

import org.scalatest.{Matchers, FreeSpec}
import Chapter3._

class Chapter3$Test extends FreeSpec with Matchers {

  "Exercise 3.1 - What will be the result of the following match expression?" in {
    val x = List(1, 2, 3, 4, 5) match {
      case Cons(x, Cons(2, Cons(4, _))) => x
      case Nil => 42
      case Cons(x, Cons(y, Cons(3, Cons(4, _)))) => x + y
//      case Cons(h, t) => h + sum(t)
      case _ => 101
    }

    x should be(3)
  }

}
