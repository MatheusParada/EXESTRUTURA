package com.senha;

import java.util.LinkedList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ListaDeConvidados {

    public static void main(String[] args) {
        LinkedList<String> listaNoiva = new LinkedList<>();
        LinkedList<String> listaNoivo = new LinkedList<>();


        listaNoiva.add("Ana");
        listaNoiva.add("Beatriz");



        listaNoivo.add("Carlos");
        listaNoivo.add("Daniel");



        LinkedList<String> listaDeCasamento = new LinkedList<>(listaNoiva);
        listaDeCasamento.addAll(listaNoivo);


        Collections.sort(listaDeCasamento);


        System.out.println("Lista de Convidados para o Casamento (em ordem alfabética):");
        ListIterator<String> iterator = listaDeCasamento.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
