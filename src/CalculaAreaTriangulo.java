import java.util.Scanner;

public class CalculaAreaTriangulo {
    public static void main(String[] args) {
        // Solicita a entrada da base e altura do triângulo
        try (Scanner scanner = new Scanner(System.in)) {
            // Solicita a entrada da base e altura do triângulo
            System.out.print("Digite a base do tria ngulo: ");
            double base = scanner.nextDouble(); //Base
            
            System.out.print("Digite a altura do triangulo: ");
            double altura = scanner.nextDouble(); //Altura
            
            // Calcula a área do triângulo
            double area = (base * altura) / 2; //O que calcula
            
            // Exibe a área do triângulo
            System.out.println("A aaea do triangulo e: " + area);
        }
    }
}
