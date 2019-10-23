import java.util.Scanner;

class BankingSystem {
  public static void main(String[] args) {
    decide();
  }

  public static class Account {
    int accountNumber;
    String firstName;
    String lastName;
    double balance;

    public Account(int _accountNumber, String _firstName, String _lastName, double _balance) {
      accountNumber = _accountNumber;
      firstName = _firstName;
      lastName = _lastName;
      balance = _balance;
    }
  }

  public static void addRecord() {
    Account newAccount = new Account(1234, "Toni", "Bui", 900.00);
    System.out.println(newAccount.balance);
  }

  public static void decide() {
    System.out.println("What do you want to do?");
    System.out.println("1> Add a record");
    System.out.println("2> Show records");
    System.out.println("3> Edit records");
    System.out.println("4> Close program");

    Scanner myObj = new Scanner(System.in);
    int ans = myObj.nextInt();
    if (ans == 1) {
      addRecord();
    } else if (ans == 2) {
      // Show records
    } else if (ans == 3) {
      // Edit records
    } else {

    }
  }
}
