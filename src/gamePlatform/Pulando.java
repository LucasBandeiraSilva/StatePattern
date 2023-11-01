package gamePlatform;

import gamePlatform.context.GameContext;

public class Pulando implements GameInterface {

    private final String acao = "pulando";
    private GameContext tarefa;

    

    public Pulando(GameContext tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void correr() {
        tarefa.setState(new Correndo(tarefa)); 
        
    }

    @Override
    public void esperando() {
        System.out.println("não posso esperar....");     
    }

    @Override
    public void pulando() {
        System.out.println("ja stou pulando.....");        
    }

    @Override
    public String toString() {
        return "Pulando [acao=" + acao + "]";
    }
    
}
