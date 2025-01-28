import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número do Funcionário: ");
        int numero = sc.nextInt();
        System.out.print("Horas Trabalhadas: ");
        double horas = sc.nextDouble();
        System.out.print("Valor: ");
        double valor = sc.nextDouble();
        sc.close();

        double salario = horas * valor;
        System.out.println("Number: " + numero);
        System.out.printf("Salary: %.2f%n", salario);
    }
}
