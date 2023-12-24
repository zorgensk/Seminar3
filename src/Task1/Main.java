package Task1;

public class Main  {
    public static void main(String[] args) {
        MathOperation addition = (x, y) -> x + y;
        MathOperation multiplication = (a, b) -> a * b;

        System.out.println("Addition: " + addition.operate(5, 3));
        System.out.println("Multiplication: " + multiplication.operate(5, 3));
    }
}

