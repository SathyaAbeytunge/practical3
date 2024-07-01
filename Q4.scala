import scala.io.StdIn.readLine

object Q4 {
  def sumOfEvenNumbers(numbers: List[Int]): Int = {
    numbers.filter(_ % 2 == 0).sum
  }

  def main(args: Array[String]): Unit = {
    val inputList = List(16,25,4,21,7,12)
    val result = sumOfEvenNumbers(inputList)
    println(result) 
  }
}