/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dado;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author noelia
 *
 *
 * Clase LanzarDado, con un atributo lista de enteros.
 *
 * EL constructor del objeto rellena una lista simulando 1000 lanzamientos del
 * dado
 *
 * constructor parametrizado con el número de tiradas a generar
 *
 * toString que devuelva de cada elemento de la lista su posición y su valor
 *
 * método para saber el número de veces que ha salido una cara
 * 
 * método para borrar todas las caras indicadas como parámetro
 *
 *
 *
 */
public class CarasDado {

    private final static int NUM_CARAS = 6;

    private ArrayList<Integer> listaEnteros;

    public CarasDado() {

        final int NUM_TIRADAS = 1000;

        this.listaEnteros = new ArrayList<>();

        Random tirada = new Random();

        for (int i = 0; i < NUM_TIRADAS; i++) {
            this.listaEnteros.add(tirada.nextInt(1, (NUM_CARAS + 1)));
        }

    }

    public CarasDado(int numTiradas) {

        this.listaEnteros = new ArrayList<>();

        Random tirada = new Random();

        for (int i = 0; i < numTiradas; i++) {
            this.listaEnteros.add(tirada.nextInt(1, (NUM_CARAS + 1)));
        }

    }

    public ArrayList<Integer> getListaEnteros() {
        return listaEnteros;
    }

    @Override
    public String toString() {
        String str = "";

        for (int i = 0; i < this.listaEnteros.size(); i++) {
            str += i + " " + this.listaEnteros.get(i) + "\n";
        }

        return str;
    }

    public int numAparicionesCara(int cara) {
        int contadorCara = 0;

        if (cara > 1 && cara < NUM_CARAS) {
            for (int i = 0; i < this.listaEnteros.size(); i++) {
                if (this.listaEnteros.get(i) == cara) {
                    contadorCara++;
                }
            }
        } else{
            return 0;
        }

        return contadorCara;
    }
    
    public void borrarCara(int cara) {
        
        if (cara > 1 && cara < NUM_CARAS) {
            for (int i = 0; i < this.listaEnteros.size(); i++) {
                if (this.listaEnteros.get(i) == cara) {
                    this.listaEnteros.remove(i);
                }
            }
        } else{
            System.out.println("Esa cara no existe");
        }
    }

}
