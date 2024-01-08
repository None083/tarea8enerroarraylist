/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaletras;

import java.util.ArrayList;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author noelia
 * 
 * 
 * En un programa nuevo, crea dos listas de tamaño aleatorio de letras entre 
 * la 'a' y la 'z'. Estas listas deben tener entre 10 y 20 elementos. 
 * Una vez creadas las listas, imprime por pantalla sus elementos usando un foreach. 
 * Crea una tercera lista con los elementos de la primera que no están en la segunda. 
 * Imprime el resultado usando API Stream y lambdas.
 * 
 * 
 * 
 */
public class ListasLetras {

    public static void main(String[] args) {
        
        ArrayList<String> listaLetras1 = generadorListaLetras();
        ArrayList<String> listaLetras2 = generadorListaLetras();
        
        System.out.println("Lista 1: ");
        for (String s : listaLetras1) {
            System.out.println(s);
        }
        
        System.out.println("Lista 2: ");
        for (String s : listaLetras2) {
            System.out.println(s);
        }
        
        ArrayList<String> listaLetras3 = listaDiferencias(listaLetras1, listaLetras2);
        System.out.println("Lista diferencias: ");
        listaLetras3.stream().forEach(e -> System.out.println(e));
        
    }
    
    public static ArrayList<String> generadorListaLetras(){
        final int NUM_MIN = 10;
        final int NUM_MAX = 20;
        
        ArrayList<String> lista = new ArrayList<>();
        
        Random random = new Random();

        for (int i = 0; i < random.nextInt(NUM_MIN, NUM_MAX+1); i++) {
            lista.add(RandomStringUtils.randomAlphabetic(1).toLowerCase());
        }
        
        return lista;
    }
    
    public static ArrayList<String> listaDiferencias(ArrayList<String> lista1, ArrayList<String> lista2){
        ArrayList<String> nuevaLista = new ArrayList<>();
        for (int i = 0; i < lista1.size(); i++) {
            if (lista2.contains(lista1.get(i))) {
                if(!nuevaLista.contains(lista1.get(i))){
                    nuevaLista.add(lista1.get(i));
                }
            }
        }
        return nuevaLista;
    }
    
}
