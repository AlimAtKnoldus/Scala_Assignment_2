//Quick sort without mutation
class sort {
  //Method to implement quick sort
  def sort(inputList: List[Int]): List[Int] = {
    if(inputList.length <= 1) inputList
    else {
      val pivot = inputList(inputList.length / 2)     //to calculate the pivot

      List.concat(                              //the input is divided about the pivot element into two sub-lists and then merged together:
        sort(inputList filter (pivot >)),         //  => containing elements that are less than the pivot,
        inputList filter (pivot ==),              // =>and a third list which contains elements equal to pivot.
        sort(inputList filter (pivot <)))         // => respectively greater than the pivot elements greater than the pivot,
    }
  }
}