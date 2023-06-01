public class Hello {

     public static void ques() { // method created outside main method
        int a = 10 , b = 100;
        int d = (a + b) * 5;
       if (d != 0){
           System.out.println(d);
       }
       else {
           System.out.println("Sum not found");
       }
    }
     public static void ques2() { // method created outside main method
        int x = 100, y = 1000;
        int m = (x + y) / 100;
        if (m >= 100) {
            System.out.println(m);
        }
        else {
            System.out.println("Error is found");
        }
    }
    public static void main(String[] args) {
        // Calling method in main method
        ques();
        ques2();

        }

}

