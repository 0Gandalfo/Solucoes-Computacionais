import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int a = scanner.nextInt();

        System.out.println("Digite outro numero; ");
        int b = scanner.nextInt();

        scanner.close();
        int X = a + b;
        System.out.println("A soma de " + a + " e" + b + "é" + X);

    }

}