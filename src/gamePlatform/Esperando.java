package gamePlatform;

import gamePlatform.context.GameContext;

public class Esperando implements GameInterface {

    private final String acao = "Esperando";
    private GameContext tarefa;

    


    public Esperando(GameContext tarefa) {
        this.tarefa = tarefa;
    }

  

    @Override
    public void correr() {
        tarefa.setState(new Correndo(tarefa));        
    }

    @Override
    public void esperando() {
        System.out.println("ja está esperando....");
        
    }

    @Override
    public void pulando() {
        tarefa.setState(new Pulando(tarefa));
        
    }



    @Override
    public String toString() {
        return "Esperando [acao=" + acao + "]";
    }
    
}
