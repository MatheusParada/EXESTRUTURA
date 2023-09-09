package com.senha;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class ListaDeConvidados {

    public static void main(String[] args) throws FileNotFoundException {

        List<String> list1 = new LinkedList<>();
        List<String> list2 = new LinkedList<>();

        try {
            Scanner listaNoiva = new Scanner(new File("C:\\Users\\12114376\\IdeaProjects\\Ex89\\casamento\\ListaNoiva.txt"));
            Scanner listaNoivo = new Scanner(new File("C:\\Users\\12114376\\IdeaProjects\\Ex89\\casamento\\ListaNoivo.txt"));

            while (listaNoiva.hasNextLine()) {
                list1.add(listaNoiva.nextLine());
            }

            while (listaNoivo.hasNextLine()) {
                list2.add(listaNoivo.nextLine());
            }


            LinkedList<String> listaDeCasamento = new LinkedList<>(list1);
            listaDeCasamento.addAll(list2);

            Collections.sort(listaDeCasamento);

            System.out.println("Lista de Convidados para o Casamento (em ordem alfabética):");
            ListIterator<String> iterator = listaDeCasamento.listIterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        } finally {
            
        }
    }
}

