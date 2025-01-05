import java.util.Scanner;

public class exerc07 {
    public static void main(String[] args) {
        int codigo1, codigo2, quantidade;
        double valor;

        Scanner sc = new Scanner(System.in);
        codigo1 = sc.nextInt();
        quantidade = sc.nextInt();
        valor = sc.nextDouble();
        double total1 = (double) quantidade * valor;

        codigo2 = sc.nextInt();
        quantidade = sc.nextInt();
        valor = sc.nextDouble();
        sc.close();
        double total2 = (double) quantidade * valor;

        double valorTotal = total1 + total2;
        System.out.println("Codigos das peças: " + codigo1 + " e " + codigo2);
        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorTotal);
    }
}
