import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o código da operação (1, 2 ou 3): ");
        int operacao = scanner.nextInt();
        System.out.print("Digite o valor do raio: ");
        double raio = scanner.nextDouble();
        double pi = 3.141592;
        switch (operacao) {
            case 1:
                double perimetro = 2 * pi * raio;
                System.out.printf("O perímetro do círculo é: %.6f%n", perimetro);
                break;
            case 2:
                double area = pi * Math.pow(raio, 2);
                System.out.printf("A área do círculo é: %.6f%n", area);
                break;
            case 3:
                double volume = (4.0 / 3.0) * pi * Math.pow(raio, 3);
                System.out.printf("O volume da esfera é: %.6f%n", volume);
                break;
            default:
                System.out.println("Código da operação inválido.");
        }

        scanner.close();
    }
}