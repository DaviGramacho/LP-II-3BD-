package edu.fatec.lp2.exercicio1.model;

public class MsgAudio extends Mensagem {
    private int duracao; // duração em segundos

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
