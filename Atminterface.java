import java.util.*;

public class Atminterface {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Balance = 50000;
        while (true) {
            System.out.println("1 whithdrawl");
            System.out.println("2 deposite");
            System.out.println("3 check balance");
            System.out.println("4 exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enter your amount");
                    int withdrawl = sc.nextInt();
                    if (withdrawl <= Balance) {

                        Balance = Balance - withdrawl;
                        System.out.println("your amount is" + Balance);
                    } else {
                        System.out.println("insufficient amount");
                    }
                    break;
                case 2:
                    System.out.println("Enter your amount");

                    int deposite = sc.nextInt();
                    deposite = Balance + deposite;
                    System.out.println("your amount is");
                    break;
                case 3:
                    System.out.println("your balance is" + Balance);
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("invalid output");
            }

        }
    }
}
