import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        int x = 0;
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        Scanner sc = new Scanner(System.in);
        
        while (x != 4) {
            x = sc.nextInt();
            if (x == 1) {
                alcool+=1;
            } else if (x == 2) {
                gasolina+=1;
            } else if (x == 3) {
                diesel+=1;
            }
        } 

        sc.close();
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
    }
}
