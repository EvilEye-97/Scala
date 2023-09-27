// Define a sealed trait Color
sealed trait Color

// Define case objects Red, Green, and Blue that extend the Color trait
case object Red extends Color
case object Green extends Color
case object Blue extends Color

// Define a ColorApp object with a main() method
object ColorApp {
  def main(args: Array[String]): Unit = {
    // Assign the Red color to the myColor variable
    val myColor: Color = Red
    
    // Call the printColor() method to print the color name
    printColor(myColor)
  }
  
  // Define the printColor() method using pattern matching
  def printColor(color: Color): Unit = color match {
    case Red   => println("The color is Red")
    case Green => println("The color is Green")
    case Blue  => println("The color is Blue")
    // Handle any other possible colors here
    case _     => println("Unknown color")
  }
}
