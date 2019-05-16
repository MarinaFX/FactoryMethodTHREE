package Classes;

public class ConsoleLog extends Log {

    @Override
    public void gravaMensg(String mensagem) {
        System.out.println(mensagem);
    }
}
