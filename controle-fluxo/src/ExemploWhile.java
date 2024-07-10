import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while (mesada > 0) {
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada){
                valorDoce = mesada;
            }
            System.out.println("Doce do valor " + valorDoce + "Adicionado no carrinho");
            mesada -= valorDoce;
            System.out.println("Voce ainda tem: R$" + mesada);
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joaozinho gastou toda a sua mesada em doces!");
    }
    public static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 20);
    }

}
