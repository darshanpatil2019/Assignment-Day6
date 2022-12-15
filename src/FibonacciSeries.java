public class FibonacciSeries {
    public static void main(String[] args) {

        int a = 0, b = 1, c; //Instance Variables
        System.out.println(a + " " + b);
        for (int i = 1; i <= 10; i++) {
            c = a + b; //3rd number is addition no of first two numbers
            System.out.println(" " + c);
            a = b; //swap element
            b = c; //swap element
        }

    }
}
