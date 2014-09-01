package fpinscala


object Chapter2 {
  def fib(n: Int): Int = {
    @annotation.tailrec
    def go(acc: Int, prev: Int, count: Int): Int =
      if (count >= n) acc
      else go(acc + prev, acc, count + 1)
    go(0, 1, 1)
  }

  def isSorted[A](as: Array[A], ordered: (A, A) => Boolean): Boolean = {
    if (as.length > 1) {
      if (ordered(as(0), as(1))) isSorted(as.tail, ordered)
      else false
    } else true
  }
}