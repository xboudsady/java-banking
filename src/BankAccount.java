public class BankAccount {

  // Private Variables
  private int account_number;
  private int account_balance;

  // Constructor Function
  public BankAccount(int account_number, int account_balance) {
    this.account_number = account_number;
    this.account_balance = account_balance;

    // Print out the current balance of this new account.
    System.out.println("You created account " + this.account_number + ".");
  }

  // To Deposit 
  public void deposit(int addMoney) {
    // Check to ensure it's a valid int.
    if (addMoney < 0) {
      System.out.println("You cannot deposit a negative amount.");
    } else {
      this.account_balance = this.account_balance + addMoney;
      System.out.println("$" + addMoney + " " + "deposited into account " + this.account_number + ".");
    }
  }

  // To Withdraw
  public void withdraw(int removeMoney) {
    // Check to ensure withdraw ammount is not greater than current balance.
    if (removeMoney > this.account_balance) {
      System.out.println("You cannot remove more than what is in your account.");
    } else {
      this.account_balance = this.account_balance - removeMoney;
      System.out.println("$" + removeMoney + " " + "has been whidrawn from account " + this.account_number + ".");
    }
  }

}