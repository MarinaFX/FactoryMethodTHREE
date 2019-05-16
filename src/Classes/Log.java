package Classes;

public abstract class Log {
    abstract void gravaMensg(String mensagem);

    public void geraNumeros(){
        for (int i = 1; i < 11;i++){
            String j = Integer.toString(i);
            gravaMensg(j);
        }

        System.out.println("Confira qual foi a saída. ");
    }
}
