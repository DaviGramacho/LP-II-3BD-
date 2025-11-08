package main.java.edu.fatec.lp2.exercicio1;

import java.util.Arrays;

public class Whatsapp {
    private Contatinho[] contatos;
    private Mensagem[] mensagens;

    public Whatsapp(Contatinho[] contatos, Mensagem[] mensagens) {
        this.contatos = contatos;
        this.mensagens = mensagens;
    }

    public void listarContatos() {
        Arrays.stream(contatos).forEach(c ->
                System.out.println(c.getNome() + " - " + c.getCelular())
        );
    }

    public void listarMensagens() {
        Arrays.stream(mensagens).forEach(m -> System.out.println(m));
    }
}
