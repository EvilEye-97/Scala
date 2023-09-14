object scala_basic {
 def test(x:Int) : Int =
 {
 val abs_Diff = Math.abs(x - 51)
if (x > 51) 3 * abs_Diff else abs_Diff
 }
 
 def main(args: Array[String]): Unit = {
 println("Result: " + test(60));
 println("Result: " + test(40));
 }
}