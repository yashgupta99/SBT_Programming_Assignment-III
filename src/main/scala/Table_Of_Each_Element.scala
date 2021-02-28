object Table_Of_Each_Element {

  def table_Of_Each_Element(list: List[Int]):Unit={
    for(element <- list){
      println("The table of '"+element+"'")
      for(multiplier <- 1 to 10){
        println(element+"*"+multiplier+"="+element*multiplier)
      }
      println()
    }

  }

  def main(args: Array[String]): Unit = {
    val list:List[Int] = List(6,5)
    table_Of_Each_Element(list)
  }

}
