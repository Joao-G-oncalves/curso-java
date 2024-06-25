import java.util.Scanner;
import java.util.Locale;

public class SistemaMedida {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite a Sigla: ");
        String sigla = scanner.next();
        switch (sigla.toUpperCase()) {
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MEDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:{
                System.out.println("INDEFINIDO");
            }
        }
    }
}
