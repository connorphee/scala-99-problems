def last(list: List[Int]): Option[Int] = {
  // In a functional approach I prefer None to an exception
  if(list.length == 0) None
  else if(list.length == 1) Some(list.head)
  else last(list.tail)
}

val happyPathResult = last(List(1, 1, 2, 3, 5, 8))
assert(happyPathResult == Some(8))

val emptyListResult = last(List())
assert(emptyListResult == None)

val nilListResult = last(Nil)
assert(nilListResult == None)
