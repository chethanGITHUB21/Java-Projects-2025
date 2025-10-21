
import java.util.Scanner;

class Demo {

    public static void main(String[] args) {

        try {
            int num1 = 5;
            int num2 = 6;
            int num3 = 0;

            float devide = num1 / num3;

            System.out.println(devide);

        } catch (Exception e) {
            System.out.println("ERROR: " + e);
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
