import java.util.Scanner;
import java.util.ArrayList;

class BankingSystem {
  // Store records
  static ArrayList<Account> accounts = new ArrayList<Account>();

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
    System.out.println("Enter your account number: ");
    Scanner _accountNumber = new Scanner(System.in);
    int accountNumber = _accountNumber.nextInt();

    System.out.println("Enter your first name: ");
    Scanner _firstName = new Scanner(System.in);
    String firstName = _firstName.nextLine();

    System.out.println("Enter your last name: ");
    Scanner _lastName = new Scanner(System.in);
    String lastName = _lastName.nextLine();

    System.out.println("Enter your balance: ");
    Scanner _balance = new Scanner(System.in);
    double balance = _balance.nextDouble();

    Account newAccount = new Account(accountNumber, firstName, lastName, balance);
    accounts.add(newAccount);
    System.out.println("This is your new account: ");
    System.out.println(newAccount.accountNumber);
    System.out.println(newAccount.firstName);
    System.out.println(newAccount.lastName);
    System.out.println(newAccount.balance);
    System.out.println("");
  }

  public static void showRecords() {
    for (Account i : accounts) {
      System.out.println(i.accountNumber + "/" + i.firstName + " " + i.lastName + "/" + i.balance);
      System.out.println("");
    }
  }

  public static void decide() {
    System.out.println("What do you want to do?");
    System.out.println("1> Add a record");
    System.out.println("2> Show records");
    System.out.println("3> Edit records");
    System.out.println("4> Close program");
    System.out.println("");

    Scanner myObj = new Scanner(System.in);
    int ans = myObj.nextInt();

    System.out.println("");

    if (ans == 1) {
      addRecord();
    } else if (ans == 2) {
      showRecords();
    } else if (ans == 3) {
      // Edit records
    } else {

    }

    decide();
  }
}
