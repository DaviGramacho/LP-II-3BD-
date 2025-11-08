package main.java.edu.fatec.lp2.exercicio1;

public class MsgFoto extends Mensagem {
    private int tamanho;

    public MsgFoto(Contatinho destinatario, String horaEnvio, String conteudo, int tamanho) {
        super(destinatario, horaEnvio, conteudo);
        this.tamanho = tamanho;
    }

    public int getTamanho() { return tamanho; }

    @Override
    public Mensagem sendMessage(String novoConteudo) {
        return new MsgFoto(getDestinatario(), getHoraEnvio(), novoConteudo, tamanho);
    }
}
