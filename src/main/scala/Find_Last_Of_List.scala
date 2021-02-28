object Find_Last_Of_List {

  def last(list: List[Any]):Any={
    list(list.length - 1)
  }
  def main(args: Array[String]): Unit = {
    val list:List[Int] = List(1,2,3,4,5,6,7)
    println(last(list))
    val list1:List[String] = List("Yash","Gupta","knoldus")
    println(last(list1))
    val list2:List[Char] = List('a','b','c','d','e')
    println(last(list2))
    val list3:List[Double] = List(1.0,2.5,3.5,4.6,5.9,6.4,7.8)
    println(last(list3))

  }

}
