public class Fibonacci {
    public static void main(String[] args) {
        int cantidad = 10;
        int a = 0, b = 1;

        System.out.println("Los primeros " + cantidad + " números de la serie Fibonacci son:");

        for (int i = 1; i <= cantidad; i++) {
            System.out.print(a + " ");
            int siguiente = a + b; 
            a = b; 
            b = siguiente; 
        }
    }
}

