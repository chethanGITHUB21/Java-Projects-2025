
import java.util.Scanner;

class training {

    public static void main(String[] args) {
        profile chethan = new user(); // polymorphism

        do {
            chethan.create();
            chethan.fill();
            chethan.view();

            chethan.delete();
            chethan.view();

        } while (true);

    }
}

// ---------------- Abstract Class ----------------
abstract class profile {

    Scanner sc = new Scanner(System.in);

    abstract void create();

    abstract void fill();

    abstract void update();

    abstract void view();

    abstract void delete();
}

// ---------------- Subclass ----------------
class user extends profile {

    String name, department, course, qualification, location, email, phno;
    Integer age, regNo;

    @Override
    void create() {
        System.out.print("Enter your name: ");
        this.name = sc.nextLine();

        System.out.print("Enter your department: ");
        this.department = sc.nextLine();

        System.out.print("Enter your course: ");
        this.course = sc.nextLine();

        System.out.print("Enter your age: ");
        this.age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter your registration number: ");
        this.regNo = sc.nextInt();
        sc.nextLine();

        // sc.nextLine(); // consume newline character
        if (name.isEmpty() || department.isEmpty() || course.isEmpty() || age.equals(0) || regNo.equals(0)) {
            System.out.println("\n⚠️ Every details are mandatory and should be filled!");
            System.out.println("Enter the details again!");

        } else {
            System.out.printf("\n========= %s DETAILS =========\n", name);
            System.out.println("Name: " + name);
            System.out.println("Department: : " + department);
            System.out.println("Course: " + course);
            System.out.println("age: " + age);
            System.out.println("Registration number: " + regNo);
            System.out.println("\n================================");
            System.out.println("\n\n✅ Profile created successfully!");

        }

    }

    @Override
    void fill() {
        System.out.println("Enter your emial address: ");
        this.email = sc.nextLine();
        System.out.print("Enter your qualification: ");
        this.qualification = sc.nextLine();
        System.out.print("Enmter your location: ");
        this.location = sc.nextLine();
        System.out.print("Enter your phone number: ");
        this.phno = sc.nextLine();

    }

    @Override
    void update() {
        System.out.println("\n✅ Profile updated successfully!");
    }

    @Override
    void view() {
        System.out.printf("\n========= %s DETAILS =========\n", name);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println("Course: " + course);
        System.out.println("Registration No: " + regNo);
        System.out.println("\n================================");

        if (email.isEmpty() || phno.isEmpty() || qualification.isEmpty() || location.isEmpty()) {
            System.out.println("\n⚠️  Additional details are pending!");
            System.out.println("Enter the additional details again!");

        } else {
            System.out.printf("====== %s additional details =====\n", name);
            System.out.println("Email: " + email);
            System.out.println("Qualification: " + qualification);
            System.out.println("Location: " + location);
            System.out.println("Phone: " + phno);
            System.out.println("=================================\n");

        }
        System.out.println("Adittional Details added Successfully!");

    }

    @Override
    void delete() {
        this.name = "";
        this.department = "";
        this.course = "";
        this.age = 0;
        this.regNo = 0;
        this.email = "";
        this.qualification = "";
        this.location = "";
        this.phno = "";

        System.out.println("User details deleted Successfully!");

    }
}
// user CRUD 
