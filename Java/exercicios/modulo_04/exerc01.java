import java.util.Locale;

public class exerc01 {
    public static void main(String[] args) {
        String product01 = "Computer";
        String product02 = "Office desk";

        int age = 30;
        int code = 5290;
        char gender = 'F';

        double price01 = 2100.0;
        double price02 = 650.50;
        double measure = 53.234567;

        System.out.println("\nProducts:");
        System.out.printf("%s, which price is $ %.2f%n", product01, price01);
        System.out.printf("%s, which price is $ %.2f%n%n", product02, price02);
        System.out.printf("Record: %d years old, code %d and gender: %c%n%n", age, code, gender);

        System.out.printf("Measure with eight decimal places: %.8f%n", measure);
        System.out.printf("Rounded (three decimal places): %.3f%n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f%n%n", measure);
    }
}