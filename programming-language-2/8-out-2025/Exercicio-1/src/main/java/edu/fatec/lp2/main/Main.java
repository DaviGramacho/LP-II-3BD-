package main.java.edu.fatec.lp2.main;

import main.java.edu.fatec.lp2.exercicio1.*;

public class Main {

    public static void main(String[] args) {
        Contatinho c1 = new Contatinho("CMTE Sullenberger ", "12 98567-1586");
        Contatinho c2 = new Contatinho("CMTE Gramacho", "12 92897-3298");
        Contatinho c3 = new Contatinho("Davi", "11 96524-3686");

        Mensagem msgText = new MsgTexto(c1, "13:30", "Você já andou de avião?");
        Mensagem msgFoto = new MsgFoto(c2, "19:59", "Olha essa foto do Boeing 747!", 1500);
        Mensagem msgAudio = new MsgAudio(c3, "20:25", "O barulho do motor do avião é incrível!", 12);

        // Usando o sendMessage com conteúdo novo sobre aviões
        Mensagem msgTextEnv = msgText.sendMessage("Próxima viagem vamos de avião?");
        Mensagem msgFotoEnv = msgFoto.sendMessage("Foto do cockpit de um Airbus A320");
        Mensagem msgAudioEnv = msgAudio.sendMessage("Já viu a decolagem de um caça?");

        // Salvando os contatos e as mensagens
        Contatinho[] contatos = {c1, c2, c3};
        Mensagem[] mensagens = {msgText, msgAudio, msgFoto, msgTextEnv, msgFotoEnv, msgAudioEnv};

        Whatsapp zap = new Whatsapp(contatos, mensagens);

        zap.listarContatos();
        zap.listarMensagens();
    }
}
