
import java.util.Scanner;

class Demo {

    public static void main(String[] args) {
        Person std1 = new Person();

        AuthSystem.Signin();
        AuthSystem.Login();

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

class AuthSystem {

    static String username;
    static String userpass;

    public static void Signin() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the username: ");
        username = sc.nextLine();

        System.out.println("Enter your password: ");
        userpass = sc.nextLine();

        System.out.println("Signup successful!\n");
    }

    public static void Login() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the username: ");
        String Lusername = sc.nextLine();

        System.out.println("Enter your password: ");
        String Luserpass = sc.nextLine();

        if (Lusername.equals(username) && Luserpass.equals(userpass)) {
            System.out.println("Login Success!");
        } else {
            System.out.println("Login Failed");
        }
    }
}
