
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AuthSystem.Signin();
        String login = AuthSystem.Login();

        if (login instanceof String) {
            System.out.println("Task (1-5): \n"
                    + "1. Check Balance\n"
                    + "2. Add User\n"
                    + "3. Cash Withdrawal\n"
                    + "4. Pin Change\n"
                    + "5. Print Reciept");
            https://www.w3schools.com/java/java_syntax.asp
            System.out.println("Enter your Task Number (1-5): ");
            int tsk = sc.nextInt();

            Person user1 = new Person();

            int PassCode = 2120;

            switch (tsk) {

                case 1:
                    if (user1.accountBal == 0) {
                        System.out.println("You have zero Balance");
                    } else {
                        System.out.println(user1.accountBal);
                    }
                    break;
                case 2:
                    user1.write();
                    break;

                case 3:

                    System.out.println("Enter the password:");
                    Integer pass = sc.nextInt();

                    do {
                        if (pass == PassCode) {
                            System.out.println("Enter the Amount: ");
                            Integer amt = sc.nextInt();

                            user1.accountBal -= amt;
                            System.out.println("you have remaining balance: " + user1.accountBal);
                            break;

                        } else {
                            System.out.println("You entered the wrong Password: ");
                        }
                    } while (pass == PassCode);
                    break;
                case 4:
                    System.out.println("Enter your Current Password: ");
                    Integer userinput = sc.nextInt();

                    if (userinput == PassCode) {
                        int newpass, confirmpass;
                        do {
                            System.out.println("Enter your new Password: ");
                            newpass = sc.nextInt();

                            System.out.println("Re-enter your Password to confirm: ");
                            confirmpass = sc.nextInt();

                            if (newpass == confirmpass) {
                                PassCode = newpass;
                                System.out.println("Password changed successfully");
                                break;
                            } else {
                                System.out.println("Password Doesn't match\nEnter again");
                            }

                        } while (newpass == confirmpass);
                    } else {
                        System.out.println("Enter Password is in-correct");
                    }
                    break;
                case 5:
                    System.out.println("Enter Password: ");
                    int passc = sc.nextInt();

                    if (passc == PassCode) {
                        user1.profile();

                    }
                default:
                    sc.close();

            }

        }

    }
}

class AuthSystem {

    static String username;
    static String userpass;

    public static void Signin() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the username for sign-up: ");
        username = sc.nextLine();

        System.out.println("Enter your password for sign-up: ");
        userpass = sc.nextLine();

        System.out.println("Signup successful!\n");
    }

    public static String Login() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the username for login: ");
        String Lusername = sc.nextLine();

        System.out.println("Enter your password for login: ");
        String Luserpass = sc.nextLine();

        if (Lusername.equals(username) && Luserpass.equals(userpass)) {
            System.out.println("Login Success!");
            return username;
        } else {
            System.out.println("Login Failed");

        }
        return "null";
    }
}

class Person {

    Scanner sc = new Scanner(System.in);

    String name;
    int age;
    String bank;
    float accountBal;

    // Method to update name and age
    void write() {

        System.out.print("Enter your name: ");
        name = sc.nextLine();  // directly store in class variable

        System.out.print("Enter your Bank name: ");
        bank = sc.nextLine();

        System.out.print("Enter your age: ");
        age = sc.nextInt();

        System.out.print("Enter Amount you want to save: ");
        accountBal = sc.nextFloat();

        System.out.println("Your details changed successfully!\n");
    }

    // Method to display the profile
    void profile() {
        System.out.println("======================================");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Bank: " + bank);
        System.out.println("Account Balance: " + accountBal);
        System.out.println("======================================");
    }
}
