package chap4;

public class Account {

	 private int balance;
	   private static final int MIN_BALANCE = 0;
	   private static final int MAX_BALANCE = 1000000;

	   public Account() { }

	   public Account(int balance) { this.balance = balance; }

	   public int getBalance() {return balance;}

	   public void setBalance(int balance) {
	      if (MIN_BALANCE <= balance && balance <= MAX_BALANCE) {
	         this.balance = balance;
	      }
	   }

	   public static void main(String[] args) {
	      Account account = new Account();

	      account.setBalance(10000);
	      System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());

	      account.setBalance(-100);
	      System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());

	      account.setBalance(2000000);
	      System.out.println("ÇöÀç ÀÜ°í: " + account.getBalance());
	   }



}
