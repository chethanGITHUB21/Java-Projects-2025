
import java.util.Scanner;

class Demo {

    public static void main(String[] args) {
        UserAcc user1 = new UserAcc();
        Scanner sc = new Scanner(System.in);
        AuthSystem auth = new AuthSystem();
        auth.Signin();
        auth.Login();
    }
}

class UserAcc {

    Scanner sc = new Scanner(System.in);
    public String Username;
    private Integer Password;
    public Integer Age;
    private String Bank;
    private float Balance;

    public String setUser(String name, Integer password, Integer age, String bank, float balance) {
        this.Username = name;
        this.Password = password;
        this.Age = age;
        this.Bank = bank;
        this.Balance = balance;
        System.out.println("username: " + Username + "\nage: " + Age + "\nbank: " + Bank + "\nbalance: " + Balance);
        return "User added successfully";
    }

    public void getUser() {
        System.out.println("username: " + this.Username + "\nage: " + this.Age + "\nbank: " + this.Bank + "\nbalance: " + this.Balance);
    }

    public void editUser(String authname, Integer authpass) {
        System.out.println("Enter the username to edit: ");
        String name = sc.nextLine();
        System.out.println("Enter the age to edit: ");
        Integer age = sc.nextInt();
        System.out.println("Enter the age to edit: ");
        String bank = sc.nextLine();
        if (authname.equals(this.Username) && authpass.equals(this.Password)) {
            this.Username = name;
            this.Age = age;
            this.Bank = bank;
            System.out.println("Successfully changed your account details.");
            System.out.println("Username: " + this.Username);
            System.out.println("Age: " + this.Age);
            System.out.println("Bank: " + this.Bank);
        } else {
            System.out.println("Sorry your Credentials doesnt matched");
        }
    }
}

class AuthSystem extends UserAcc {

    private String Susername;
    private Integer Spassword;
    public Integer Sage;
    public String Sbank;
    private float Sbalance;

    public void Signin() {
        System.out.println("Enter you Username for Signin: ");
        this.Susername = sc.nextLine();
        System.out.println("Enter you bank name for Signin: ");
        this.Sbank = sc.nextLine();
        System.out.println("Enter you balance for Signin: ");
        this.Sbalance = sc.nextFloat();
        System.out.println("Enter you password for Signin: ");
        this.Spassword = sc.nextInt();
        System.out.println("Enter you age for Signin: ");
        this.Sage = sc.nextInt();
        setUser(this.Susername, this.Spassword, this.Sage, this.Sbank, this.Sbalance);
    }

    public void Login() {
        System.out.println("Enter password for Login: ");
        Integer password = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter username for Login: ");
        String username = sc.nextLine();
        if (username.equals(this.Susername) && password.equals(this.Spassword)) {
            System.out.println("Successfull Login!");
            getUser();
        } else {
            System.out.println("Failed Login");
        }
    }

    private void profile() {
    }
}
