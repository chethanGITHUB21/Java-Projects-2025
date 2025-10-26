
// public class array {
//     public static void main(String[] args) {
//         int arrNum[] = {1, 2, 3, 4, 5, 6};
//         int index = arrNum[0] + arrNum[1]+ arrNum[2] + arrNum[3] + arrNum[4] + arrNum[5];
//         int 
//         System.out.println();
//     }
// }
import java.util.Scanner;

class array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        outer factorial = new outer();

        System.out.println("enter number for factorial: ");

        factorial.fact(sc.nextInt());

    }
}

class outer {

    void fact(int num) {
        Integer i;
        Integer j = 1;
        if (num != 0) {
            for (i = 1; i < num; i++) {
                j *= i;

            }
            System.out.printf("factorial of %d! is %d", num, j);
        }

    }
}
