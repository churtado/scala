package examples

object mapping {
  def main(args: Array[String]): Unit = {

    // how to use a map
    var capital = Map("US" -> "Washington", "France" -> "Paris")
    capital += ("Japan" -> "Tokyo")
    println(capital("France"))
  }
}
