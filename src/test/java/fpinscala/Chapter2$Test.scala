package fpinscala

import Chapter2._
import org.scalatest.{FreeSpec, Matchers}

class Chapter2$Test extends FreeSpec with Matchers {
  "Chapter 2" - {

    "Fibonacci" in {
      fib(6) should be(5)
    }

    "isSorted" in {
      isSorted(Array(1, 5, 4), (a: Int, b: Int) => a < b) should be(false)
      isSorted(Array(1, 2, 3, 4), (a: Int, b: Int) => a < b) should be(true)

      isSorted(Array(4, 5, 1), (a: Int, b: Int) => a > b) should be(false)
      isSorted(Array(4, 3, 2, 1), (a: Int, b: Int) => a > b) should be(true)
    }

    "curry should compile" in {
      def curry[A, B, C](f: (A, B) => C): A => B => C =
        (a: A) => (b: B) => f(a, b)

    }

    "uncurry should compile" in {
      def uncurry[A, B, C](f: A => B => C): (A, B) => C =
        (a, b) => f(a)(b)
    }

    "compose should compile" in {
      def compose[A, B, C](f: B => C, g: A => B): A => C =
        (a: A) => f(g(a))

    }
  }
}
