object scala_basic {
 def test(x:Int, y:Int) : Int =
 {
 if (x == y) (x + y) * 3 else x + y
 }
 
 def main(args: Array[String]): Unit = {
 println("Result: " + test(5, 6));
 println("Result: " + test(6, 6));
 }
}