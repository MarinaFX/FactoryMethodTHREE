package Classes;

import java.io.*;

public class ArquivosLog extends Log {
    private static final String CAMINHO = "H:\\TerceiroSemestre\\Software-Dev-Fund\\Projetos\\CreationalDesignPatterns\\FactoryMethodTHREE\\src\\Arquivos\\log.txt";


    @Override
    public void gravaMensg(String mensagem) {
        int count = 0;
        try {
            FileWriter file = new FileWriter(CAMINHO, true);
            PrintWriter printer = new PrintWriter(file, false);

            printer.println(mensagem + "");
            printer.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
