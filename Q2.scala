object Q2 {

  def filterLongStrings(strings: List[String]): List[String] = {
    strings.filter(_.length > 5)
  }

  def main(args: Array[String]): Unit = {
    val inputList = List("hello","world","Scala","programming","fun","awesome")
    val filteredList = filterLongStrings(inputList)
    println(filteredList) 
  }
}

