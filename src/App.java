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
        
       
        String opcao;

        System.out.println("Bem vindo a lista de tarefas");
        System.out.println("OPÇÕES");
        System.out.println("Opção 1 - adicionar tarefa");
        System.out.println("Opção 2 - tarefa concluída");

        opcao = entrada.nextLine( );
        while (opcao.equals("1")||opcao.equals("2")) {
            
      
            opcao = entrada.nextLine( );

         
            switch (opcao) {
            case "1":
            if (tarefa.isEmpty()) {
                Tarefa novaTarefa = new Tarefa(null);
                novaTarefa.setTarefas(entrada.nextLine()); 
                        tarefa.add(novaTarefa);
                        System.out.println(tarefa);
            }else{
                
                Tarefa novaTarefa = new Tarefa(null);
                novaTarefa.setTarefas(entrada.nextLine()); 
                        tarefa.add(novaTarefa);
                        System.out.println(tarefa);
            }
            break;
              case "2":
        tarefa.remove(entrada.nextInt());
                break;
        
            default:
                break;
        } // fim switch case
       System.out.println("Qual a entrada "+ opcao);
       opcao= entrada.nextLine();
    }// fim while

    for (int i =0;i<=quantidadeDeTarefas;i++) {
        System.out.println(" -> "+tarefa);
    }
    

entrada.close();
    }
}//fechamento do código

/*Utilizando conhecimentos basicos de estrutura e Collections List para adicionar
 * tarefas.
 */