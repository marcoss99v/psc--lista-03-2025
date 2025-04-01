import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Segundo número: ");
        double num2 = scanner.nextDouble();
        System.out.print("Símbolo da operação (+, -, *, /, ^): ");
        char operacao = scanner.next().charAt(0);
        switch (operacao) {
            case '+':
                System.out.printf("Resultado: %.2f%n", num1 + num2);
                break;
            case '-':
                System.out.printf("Resultado: %.2f%n", num1 - num2);
                break;
            case '*':
                System.out.printf("Resultado: %.2f%n", num1 * num2);
                break;
            case '/':
                if (num2 != 0) {
                    System.out.printf("Resultado: %.2f%n", num1 / num2);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                }
                break;
            case '^':
                System.out.printf("Resultado: %.2f%n", Math.pow(num1, num2));
                break;
            default:
                System.out.println("Erro: Símbolo da operação inválido.");
        }
        scanner.close();
    }
}
