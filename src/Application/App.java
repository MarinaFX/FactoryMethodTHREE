package Application;

import ABSLogFactory.AbstractLogFactory;
import Classes.Log;
import ConcreteLogFactory.ConcreteLogFactory;

import java.util.Scanner;

public class App {

    private static void close(){
        System.out.println("===========FIM===========");
    }

    private static String coletaInformacoes(){
        Scanner in = new Scanner (System.in);
        String resposta = "";

        System.out.println("Qual o tipo de log que deseja visualizar? ");
        System.out.println("0 - Mensagem por console");
        System.out.println("1 - Mensagem gravada em arquivo");
        resposta = in.nextLine();

        return resposta;
    }

    private static void start(){
        System.out.println("==========Bem vindo!==========");
        System.out.println("Este é um sistema de registro de log");
    }

    private static String parseOpcoes(String opcao){
        String resposta = "";

        if (opcao.equalsIgnoreCase("0"))
            resposta = "console";

        if (opcao.equalsIgnoreCase("1"))
            resposta = "arquivo";

        return resposta;
    }

    public static void main(String[] args) {
        AbstractLogFactory factory = new ConcreteLogFactory();
        Log log;
        String resposta;

        App.start();
        resposta = App.coletaInformacoes();
        resposta = App.parseOpcoes(resposta);

        try {
            log = factory.logFactory(resposta);
            log.geraNumeros();
        } catch (IllegalArgumentException f){
            System.err.println(f.getMessage());
        }
    }
}
