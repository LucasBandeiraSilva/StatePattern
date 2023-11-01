package state.stateStages;

import state.Context;
import state.StatePattern;

public class Concluida implements StatePattern {

    private String nome = "Concluída";
    private Context tarefa;

    public Concluida(Context tarefa) {
        this.tarefa = tarefa;
    }

    @Override
    public void atrasada() {
        System.out.println("Já está concluída");
    }

    @Override
    public void concluida() {
        System.out.println("Já está concluída");
    }

    @Override
    public void pendente() {
        tarefa.setState(new Pendente(tarefa));
    }

    @Override
    public String toString() {
        return "Novo estado da tarefa: " + nome;
    }


}
