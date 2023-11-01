package gamePlatform;

import gamePlatform.context.GameContext;

public class Main {
    public static void main(String[] args) {
        GameContext tarefa = new GameContext();

        tarefa.jogadorEsperando();
        tarefa.jogadorCorrendo();
        tarefa.jogadorPulando();
        tarefa.jogadorCorrendo();
        tarefa.jogadorCorrendo();
    }
}
