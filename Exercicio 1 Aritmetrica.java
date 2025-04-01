import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print(" segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("terceiro número: ");
        double num3 = scanner.nextDouble();
        double maior = Math.max(num1, Math.max(num2, num3));
        double menor = Math.min(num1, Math.min(num2, num3));
        double media = (num1 + num2 + num3) / 3;

        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        System.out.printf("A média é: %.2f%n", media);
        
        scanner.close();
    }
}