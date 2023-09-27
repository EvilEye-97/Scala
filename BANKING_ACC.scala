class BankAccount(private val accountNumber: String, private var balance: Double) {
  
  def getAccountNumber: String = accountNumber
  
  def getBalance: Double = balance
  
  def deposit(amount: Double): Unit = {
    if (amount > 0) {
      balance += amount
      println(s"Deposited $amount. New balance: $balance")
    } else {
      println("Invalid deposit amount. Amount must be greater than zero.")
    }
  }
  
  def withdraw(amount: Double): Unit = {
    if (amount > 0 && amount <= balance) {
      balance -= amount
      println(s"Withdrew $amount. New balance: $balance")
    } else if (amount <= 0) {
      println("Invalid withdrawal amount. Amount must be greater than zero.")
    } else {
      println("Insufficient balance for withdrawal.")
    }
  }
}

object BankAccountExample {
  def main(args: Array[String]): Unit = {
    val account = new BankAccount("1234567890", 1000.0)
    
    println(s"Account Number: ${account.getAccountNumber}")
    println(s"Initial Balance: ${account.getBalance}")
    
    account.deposit(500.0)
    account.withdraw(200.0)
    account.withdraw(1500.0)
    account.deposit(-100.0)
  }
}
