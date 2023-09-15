package com.br;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class ShowDeRock {

    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        int ingressosVIPExibidos = 0;
        String pessoaSorteada = null;

        // Carregar os ingressos vendidos a partir de um arquivo
        try (BufferedReader br = new BufferedReader(new FileReader("ingressos_vendidos.txt"))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                fila.add(linha);
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo de ingressos vendidos.");
            e.printStackTrace();
            return;
        }

        // Exibir os 10 primeiros ingressos como entrada VIP
        System.out.println("Entrada VIP:");
        for (int i = 0; i < 10; i++) {
            if (!fila.isEmpty()) {
                String ingresso = fila.poll();
                System.out.println("Ingresso VIP: " + ingresso);
                ingressosVIPExibidos++;
            }
        }

        // Sortear uma pessoa para conhecer a banda
        if (!fila.isEmpty()) {
            Random random = new Random();
            int indiceSorteado = random.nextInt(fila.size());
            for (int i = 0; i < indiceSorteado; i++) {
                pessoaSorteada = fila.poll();
            }
        }

        if (pessoaSorteada != null) {
            System.out.println("\nPessoa sorteada para conhecer a banda: " + pessoaSorteada);
        } else {
            System.out.println("\nNinguém sorteado para conhecer a banda.");
        }

        // Exibir o restante da fila (após entrada VIP e sorteio)
        System.out.println("\nFila restante:");
        while (!fila.isEmpty()) {
            System.out.println(fila.poll());
        }
    }
}

