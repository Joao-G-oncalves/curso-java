package apps;
public class Telegram extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        // TODO Auto-generated method stub
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Telegram");
        
    }

    @Override
    public void receberMensagem() {
        // TODO Auto-generated method stub
        System.out.println("Recebendo mensagem pelo Telegram");
    }
    
}
