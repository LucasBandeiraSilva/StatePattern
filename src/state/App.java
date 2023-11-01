package state;
public class App {
    public static void main(String[] args) throws Exception {
        
        Context tarefa=new Context();
        tarefa.requisitarAtrasada();
        tarefa.requisitarConcluida();
        tarefa.requisitarPendente();
        tarefa.requisitarConcluida();
        tarefa.requisitarConcluida();

    }
}
