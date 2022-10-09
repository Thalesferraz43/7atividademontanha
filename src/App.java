import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        double lado, result;
        Scanner sc = new Scanner(System.in); 
        System.out.print("Digite o valor do lado do quadrado: ");
        lado = sc.nextDouble();
        result = (lado*lado)*2;
        System.out.printf("A área do quadrado multiplicado por 2 é: %.2f", result);
    }
}