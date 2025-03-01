package program;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Calculadora Simples\n");
        
        System.out.print("Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Digite o operador (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        System.out.print("Digite o segundo numero: ");
        double num2 = scanner.nextDouble();
        
        double result = 0.0;
        
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Não é possível dividir por zero.");
                    return;
                }
                break;
            default:
                System.out.println("Operador inválido.");
                return;
        }
        
        System.out.println("Resultado: " + result);
        
        scanner.close();
    }
}
