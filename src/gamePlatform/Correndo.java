package gamePlatform;

import gamePlatform.context.GameContext;

public class Correndo implements GameInterface {

    private final String acao = "Correndo";
    private GameContext tarefa;

    public Correndo(GameContext tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void correr() {
        System.out.println("ja estou correndo...");
    }

    @Override
    public void esperando() {
        System.out.println("não posso parar agora.....");
        // tarefa.setState(new Esperando(tarefa));
    }

    @Override
    public void pulando() {
        tarefa.setState(new Pulando(tarefa));

    }

    @Override
    public String toString() {
        return "Correr [acao=" + acao + "]";
    }

    

}
