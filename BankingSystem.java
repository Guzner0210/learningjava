import java.util.Scanner;

class BankingSystem {
  public static void main(String[] args) {
    decide();
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
      System.out.println("Ok");
    }
  }
}
