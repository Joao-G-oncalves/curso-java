import java.util.Scanner;
import java.util.Locale;


public class ResultadoEscolar {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Digite sua nota: ");
        int nota = scanner.nextInt();
        if (nota >= 7){
            System.out.println("Aprovado!");
        }
        else if(nota >= 5 && nota <7) {
            System.out.println("Prova de Recuperação!");
        }else{
            System.out.println("Reprovado!");
        }
    }
}
