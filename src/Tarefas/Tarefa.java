package Tarefas;

public class Tarefa {
    private String tarefas;
    int pontos;

    public void pontosTarefaConcluidas(){
        // criar um metodo para calcular pontos por tarefa concluída
    }

    @Override
    public String toString() {
        return "Tarefa [tarefas=" + tarefas + "]";
    }

    public Tarefa(String tarefas) {
        this.tarefas = tarefas;
    }

    public String getTarefas() {
        return tarefas;
    }

    public void setTarefas(String tarefas) {
        this.tarefas = tarefas;
    }

}
