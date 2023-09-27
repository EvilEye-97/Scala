object MathUtils {
  def factorial(n: Int): Int = {
    if (n == 0 || n == 1) 1
    else n * factorial(n - 1)
  }
}

object Main {
  def main(args: Array[String]): Unit = {
    val factorialOfFour = MathUtils.factorial(4)
    val factorialOfTen = MathUtils.factorial(10)

    println(s"Factorial of 4 is $factorialOfFour")
    println(s"Factorial of 10 is $factorialOfTen")
  }
}