def penultimate(list: List[Int]): Option[Int] = list match {
  // Case one: empty list
  case Nil => None
  // Case two: we're at the second to last item
  case x :: y :: Nil => Some(x)
  // Case three: we need to keep going
  case _ => penultimate(list.tail)
}

val happyPathResult: Option[Int] = penultimate(List(1, 1, 2, 3, 5, 8))
assert(Some(5) == happyPathResult)

val emptyListResult: Option[Int] = penultimate(List.empty)
assert(None == emptyListResult)

val nilResult: Option[Int] = penultimate(Nil)
assert(None == nilResult)
