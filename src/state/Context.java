package state;

import state.stateStages.Pendente;

public class Context {
    private StatePattern state = new Pendente(this);

    public StatePattern getState() {
        return state;
    }

    public void setState(StatePattern state) {
        this.state = state;
        System.out.println(getState());
    }

    public void requisitarConcluida(){
      state.concluida();
    } 
    
    public void requisitarAtrasada(){
     state.atrasada();
    }
    
    public void requisitarPendente(){
      state.pendente();
    }

    
}
