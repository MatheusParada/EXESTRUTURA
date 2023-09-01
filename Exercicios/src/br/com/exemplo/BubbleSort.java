package br.com.exemplo;

import java.util.Arrays;
import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        // Criar um vetor randômico de 50 posições
        int[] vetor = criarVetorAleatorio(50);
        System.out.println("Vetor não ordenado: " + Arrays.toString(vetor));

        // Ordenar o vetor usando o Bubble Sort
        bubbleSort(vetor);
        System.out.println("Vetor ordenado: " + Arrays.toString(vetor));

        // Realizar uma pesquisa binária por um elemento (por exemplo, 42)
        int elementoPesquisado = 42;
        int indice = pesquisaBinaria(vetor, elementoPesquisado);

        if (indice != -1) {
            System.out.println("O elemento " + elementoPesquisado + " foi encontrado no índice " + indice + ".");
        } else {
            System.out.println("O elemento " + elementoPesquisado + " não foi encontrado no vetor.");
        }
    }

    // Função para criar um vetor randômico de tamanho especificado
    public static int[] criarVetorAleatorio(int tamanho) {
        int[] vetor = new int[tamanho];
        Random rand = new Random();
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = rand.nextInt(100); // Gere números aleatórios de 0 a 99
        }
        return vetor;
    }

    // Função para ordenar o vetor usando o Bubble Sort
    public static void bubbleSort(int[] vetor) {
        int n = vetor.length;
        boolean trocou;
        do {
            trocou = false;
            for (int i = 1; i < n; i++) {
                if (vetor[i - 1] > vetor[i]) {
                    // Troca os elementos
                    int temp = vetor[i - 1];
                    vetor[i - 1] = vetor[i];
                    vetor[i] = temp;
                    trocou = true;
                }
            }
        } while (trocou);
    }

    // Função para realizar a pesquisa binária em um vetor ordenado
    public static int pesquisaBinaria(int[] vetor, int elemento) {
        int esquerda = 0;
        int direita = vetor.length - 1;

        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;

            if (vetor[meio] == elemento) {
                return meio;
            }

            if (vetor[meio] < elemento) {
                esquerda = meio + 1;
            } else {
                direita = meio - 1;
            }
        }

        return -1; // Elemento não encontrado
    }
}

