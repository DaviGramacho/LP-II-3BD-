package main.java.edu.fatec.lp2.exercicio1;

public class MsgAudio extends Mensagem {
    private int duracao;

    public MsgAudio(Contatinho destinatario, String horaEnvio, String conteudo, int duracao) {
        super(destinatario, horaEnvio, conteudo);
        this.duracao = duracao;
    }

    public int getDuracao() { return duracao; }

    @Override
    public Mensagem sendMessage(String novoConteudo) {
        return new MsgAudio(getDestinatario(), getHoraEnvio(), novoConteudo, duracao);
    }
}
