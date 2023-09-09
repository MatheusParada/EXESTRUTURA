package com.senha;

import java.util.LinkedList;
import java.util.Queue;

public class FilaAtendimento {

    public static void main(String[] args) {
        Queue<Integer> filaPrioridade = new LinkedList<>();
        Queue<Integer> filaRegular = new LinkedList<>();


        for (int i = 1; i <= 200; i++) {
            if (i % 2 == 1 && i <= 100) {
                filaPrioridade.offer(i);
            } else {
                filaRegular.offer(i);
            }
        }

        System.out.println("Fila de Prioridade (Senhas ímpares até 100):");
        while (!filaPrioridade.isEmpty()) {
            System.out.println("Senha: " + filaPrioridade.poll());
        }

        System.out.println("\nFila Regular (Senhas pares e acima de 100):");
        while (!filaRegular.isEmpty()) {
            System.out.println("Senha: " + filaRegular.poll());
        }
    }
}
