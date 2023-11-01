package gamePlatform.context;

import gamePlatform.Esperando;
import gamePlatform.GameInterface;

public class GameContext {
    private GameInterface state = new Esperando(this);

    public void jogadorEsperando(){
        state.esperando();
    }

    public void jogadorCorrendo(){
        state.correr();
    }
    public void jogadorPulando(){
        state.pulando();
    }

    public GameInterface getState() {
        return state;
    }

    public void setState(GameInterface state) {
        this.state = state;
        System.out.println(getState());

    }

    
}
