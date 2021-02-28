//Main method
object main {
  def main(args: Array[String]): Unit = {
    val quick_sort = new sort
    println("Sorted List: " + quick_sort.sort(List(5, 9, 8, 1, 3))) //sort function is called to implement sorting operation
  }
}