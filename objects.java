// Program to print an array using condition by taking uer input


import java.util.Scanner;
class Employee {
    public static void Horn() {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter number : ");
        int x = a.nextInt();

        if (x<=10) {
            int cars[] = {12, 23, 545, 674, 33, 523, 35};
            for (int i = 0; i < cars.length; i++) {
                System.out.println(cars[i]);
            }

        } else {
            System.out.println("Error is found");
        }
    }
}
public class objects {
    public static void main(String[] args) {
        Employee Horn = new Employee();         // Creating an object
        Employee.Horn();                        // calling the method
    }
}
