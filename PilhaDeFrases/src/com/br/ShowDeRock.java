package com.br;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ShowDeRock {

    public static void main(String[] args) {
        // Crie uma fila para os ingressos vendidos
        Queue<String> filaIngressos = new LinkedList<>();

        // Leitura do arquivo de ingressos vendidos
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\12114376\\IdeaProjects\\ExemplosEstruturaDados\\PilhaDeFrases\\ingressos.txt"));
            String linha;
            while ((linha = br.readLine()) != null) {
                filaIngressos.offer(linha); // Adiciona o ingresso à fila
            }
            br.close();
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo de ingressos.");
            return;
        }

        // Exibe os 10 primeiros ingressos como entrada VIP
        System.out.println("Entrada VIP:");
        int contadorVIP = 0;
        while (contadorVIP < 10 && !filaIngressos.isEmpty()) {
            System.out.println(filaIngressos.poll());
            contadorVIP++;
        }

        // Sorteia aleatoriamente uma posição da fila para a pessoa sortuda
        Random random = new Random();
        int tamanhoFila = filaIngressos.size();
        int posicaoSorteada = random.nextInt(tamanhoFila);

        // Exibe o ingresso da pessoa sortuda
        System.out.println("\nPessoa sorteada para conhecer a banda:");
        for (int i = 0; i < tamanhoFila; i++) {
            String ingresso = filaIngressos.poll();
            if (i == posicaoSorteada) {
                System.out.println(ingresso + " (Pessoa sorteada para conhecer a banda)");
            }
            filaIngressos.offer(ingresso);
        }
    }
}
