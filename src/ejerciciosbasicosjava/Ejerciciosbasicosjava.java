/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosbasicosjava;

/**
 *
 * @author pablomariagarciaberzal
 */
public class Ejerciciosbasicosjava {

    public boolean fiestaArdillas (int numbellotas,boolean findeSemana){
        if(numbellotas>=40 && numbellotas<=60){
            return true;
        }
        return false;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ejerciciosbasicosdejava ejercicios= new ejerciciosBasicosJava();
        System.aut.printin(ejercicios.fiestaArdillas(30,false) );
        System.aut.printin(ejercicios.fiestaArdillas(50,false) );
        System.aut.printin(ejercicios.fiestaArdillas(70,false) );
        
    
}
