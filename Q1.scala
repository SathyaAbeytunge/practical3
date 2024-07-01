object Q1 {
  def reverse(s: String): String = {
  if (s.isEmpty) ""  
  else reverse(s.tail) + s.head 
  }

  def main(args: Array[String]): Unit = {
    val string = "Hello World"
    println(reverse(string))
  }
}
