package edu.fatec.lp2.exercicio1.model;

public class MsgTexto extends Mensagem {
    private int numChar;

    public MsgTexto(Contatinho destinatario, String horaEnvio, String conteudo) {
        super(destinatario, horaEnvio, conteudo);
        this.numChar = conteudo.length();
    }

    public int getNumChar() { return numChar; }

    @Override
    public Mensagem sendMessage(String novoConteudo) {
        return new MsgTexto(getDestinatario(), getHoraEnvio(), novoConteudo);
    }
}
