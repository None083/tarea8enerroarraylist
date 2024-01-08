/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package dado;

/**
 *
 * @author noelia
 */
public class Main {

    public static void main(String[] args) {
        
        //Constructor por defecto
        CarasDado listaTiradas = new CarasDado();
        
        System.out.println(listaTiradas);
        
        //Constructor con parámetros
        CarasDado listaTiradas2 = new CarasDado(20);
        
        System.out.println(listaTiradas2);
        
        //Cuantas veces ha salido una cara
        int numAaparicionesCara = listaTiradas2.numAparicionesCara(2);
        System.out.println(numAaparicionesCara + "\n");
        
        //Borrar cara de la lista
        listaTiradas2.borrarCara(2);
        System.out.println(listaTiradas2);
        
    }
}
