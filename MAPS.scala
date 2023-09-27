object MapDifferenceExample {
  def main(args: Array[String]): Unit = {
    // Create two maps
    val map1 = Map("key1" -> "value1", "key2" -> "value2", "key3" -> "value3")
    val map2 = Map("key2" -> "value2", "key4" -> "value4", "key5" -> "value5")
    
    // Retrieve the set of keys from map2
    val keysToRemove = map2.keySet
    
    // Use the -- operator to find the difference between map1 and map2
    val difference = map1 -- keysToRemove
    
    // Print the result
    println("Map1: " + map1)
    println("Map2: " + map2)
    println("Difference: " + difference)
  }
}
