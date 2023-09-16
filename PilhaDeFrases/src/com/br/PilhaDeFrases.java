package com.br;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class PilhaDeFrases {

    public static void main(String[] args) throws FileNotFoundException{
        Scanner scanner;
        Stack pilha = new Stack(); // Classe Pilha

        scanner = new Scanner(new File("C:\\Users\\12114376\\IdeaProjects\\ExemplosEstruturaDados\\PilhaDeFrases\\Frases.txt"));
        while (scanner.hasNextLine()){
            pilha.push(scanner.nextLine());
        }
        System.out.println("Tamanho da Pilha " + pilha.size());
        System.out.println("****Pilha de Nomes*****");
        while(!pilha.empty())
        {
            System.out.println(pilha.pop());
        }
    }

}
