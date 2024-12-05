import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Tarefas.Tarefa;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World! Bem vindo, a Lista de Tarefas");
        Scanner entrada = new Scanner(System.in);
        List <Tarefa> tarefa = new ArrayList<>();
        final int quantidadeDeTarefas=3;
        for(int i=0;i<quantidadeDeTarefas;i++){
        Tarefa novaTarefa = new Tarefa(null);
        novaTarefa.setTarefas(entrada.nextLine());
        tarefa.add(novaTarefa);

    }
    System.out.println(tarefa);



        

entrada.close();
    }
}
