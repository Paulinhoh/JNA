package Java.exercicios.modulo_06;

public class exerc19 {
    public static void main(String[] args) {
        int senha = 2002;
        int n = 0;

        while (n != senha) {
            n = Integer.parseInt(System.console().readLine());
            if (n != senha) {
                System.out.println("Senha Invalida");
            } else {
                System.out.println("Acesso Permitido");
            }
        }
    }
}
