package com.br;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;

public class PilhaDeFrases {
    public static void main(String[] args) {
        String arquivo = "frases_de_busca.txt"; // Altere o nome do arquivo conforme necessário

        Stack<String> pilha = new Stack<>();

        try (BufferedReader br = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                pilha.push(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        Stack<String> top10Frases = new Stack<>();
        int count = 0;

        while (!pilha.isEmpty() && count < 10) {
            top10Frases.push(pilha.pop());
            count++;
        }

        System.out.println("Top 10 frases mais buscadas por último:");
        while (!top10Frases.isEmpty()) {
            System.out.println(top10Frases.pop());
        }

        // Desempilhar o restante dos dados depois da 10ª frase
        while (!pilha.isEmpty()) {
            pilha.pop();
        }
    }
}
