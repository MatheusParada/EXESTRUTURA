package br.com.exercicio4;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Iterator;


// Classe para representar uma pessoa com nome, telefone e e-mail
class Pessoa {
    private String nome;
    private String telefone;
    private String email;

    public Pessoa(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nTelefone: " + telefone + "\nE-mail: " + email;
    }
}

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Pessoa> deque = new ArrayDeque<>();


        // Solicita os dados de 10 pessoas
        for (int i = 0; i < 2; i++) {
            System.out.print("Digite o nome da pessoa:");
            String nome = scanner.nextLine();
            System.out.print("Digite o telefone da pessoa:");
            String telefone = scanner.nextLine();
            System.out.print("Digite o e-mail da pessoa:");
            String email = scanner.nextLine();

            Pessoa pessoa = new Pessoa(nome, telefone, email);
            deque.add(pessoa);
        }
        System.out.println("Lista em ordem convencional");

        // Imprime a lista na ordem convencional
        for(Iterator itr = deque.iterator();itr.hasNext();){
            System.out.println(itr.next().toString());

        }
        System.out.println();
        System.out.println("Lista em ordem inversa");

        // Imprime a lista na ordem inversa
        for(Iterator itr = deque.descendingIterator(); itr.hasNext();){
            System.out.println(itr.next().toString());
        }
    }
}
