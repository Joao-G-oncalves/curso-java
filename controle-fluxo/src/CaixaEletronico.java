public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25;
        double valorSolicitado = 24;

        if (valorSolicitado < saldo){
            saldo -= valorSolicitado;      
        }
        System.out.println(saldo);
    }
}
