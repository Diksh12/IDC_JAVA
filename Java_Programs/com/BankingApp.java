
import java.util.*;

class BankDetails {

    private String accno1, accno2;
    private String name1, name2;
    private String acc_type, acc_type2;
    private long balance1, balance2;
    Scanner sc = new Scanner(System.in);
    //method to open new account
    public void openAccount() {

        accno1 = "1234";
        acc_type = "Saving";

        name1 = "Dikshita";

        balance1 = 40000;

    }

    public void openAccount2(){
        accno2 = "4567";
        acc_type2 = "Saving";
        name2 = "Unnati";
        balance2 = 50000;
    }
    //method to display account details
    public void showAccount() {
        System.out.println("Name of account holder: " + name1);
        System.out.println("Account no.: " + accno1);
        System.out.println("Account type: " + acc_type);
        System.out.println("Balance: " + balance1);
    }

    public void showAccount2() {
        System.out.println("Name of account holder: " + name2);
        System.out.println("Account no.: " + accno2);
        System.out.println("Account type: " + acc_type);
        System.out.println("Balance: " + balance2);
    }
    //method to deposit money
    public void deposit() {
        long amt;
        System.out.println("Enter the amount you want to deposit: ");
        amt = sc.nextLong();
        balance1 = balance1 + amt;
    }

    public void deposit2 () {
        long amt;
        System.out.println("Enter the amount you want to deposit: in 2 account ");
        amt = sc.nextLong();
        balance2 = balance2 + amt;


    }
    //method to withdraw money
    public void withdrawal() {
        long amt;
        System.out.println("Enter the amount you want to withdraw: ");
        amt = sc.nextLong();
        if (balance1 >= amt) {
            balance1 = balance1 - amt;
            System.out.println("Balance after withdrawal: " + balance1);
        } else {
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );
        }
    }

    public void withdrawal1() {
        long amt;
        System.out.println("Enter the amount you want to withdraw 2: ");
        amt = sc.nextLong();
        if (balance2 >= amt) {
            balance2 = balance2 - amt;
            System.out.println("Balance after withdrawal: " + balance2);
        } else {
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );
        }
    }
    //method to search an account number
    public boolean search(String ac_no) {
        if (accno1.equals(ac_no)) {
            showAccount();
            return (true);
        }
        else if (accno2.equals(ac_no)){
            showAccount2();
            return (true);
        }
        return (false);


    }
    }

public class BankingApp {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        //create initial accounts
        //System.out.print(" ");
        //int n = sc.nextInt();
        BankDetails C[] = new BankDetails[2];
        for (int i = 0; i < C.length; i++) {
            C[i] = new BankDetails();
            C[i].openAccount();
            C[i].openAccount2();
        }
        // loop runs until number 5 is not pressed to exit
        int ch;
        do {
            System.out.println("\n ***Banking System Application***");
            System.out.println("1. Display all account details \n 2. Search by Account number\n 3. Deposit the amount \n 4. Withdraw the amount \n 5.Exit ");
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    for (int i = 0; i < C.length; i++) {
                        C[0].showAccount();
                        C[1].showAccount2();
                    }
                    break;
                case 2:
                    System.out.print("Enter account no. you want to search: ");
                    String ac_no = sc.next();
                    boolean found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac_no);
                        if (found) {
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 3:
                    System.out.print("Enter Account no. : ");
                    ac_no = sc.next();
                    found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac_no);

                        if (found) {

                            C[i].deposit();
                            C[i].deposit2();
                        }
                    //}


                    break;

            }

                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }

                    break;
                case 4:
                    System.out.print("Enter Account No : ");
                    ac_no = sc.next();
                    found = false;
                    for (int i = 0; i < C.length; i++) {
                        found = C[i].search(ac_no);
                        if (found) {
                            C[i].withdrawal();
                            break;
                        } else if (found) {
                            C[i].withdrawal1();

                        }
                    }
                    if (!found) {
                        System.out.println("Search failed! Account doesn't exist..!!");
                    }
                    break;
                case 5:
                    System.out.println("See you soon...");
                    break;
            }
                  }

            while (ch != 5) ;
                }
    }

