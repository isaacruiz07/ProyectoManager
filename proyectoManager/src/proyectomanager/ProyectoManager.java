/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomanager;

/**
 *
 * @author Isaac
 */
public class ProyectoManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador[] equipo1 = new Jugador[14];
        for (int i = 0; i < equipo1.length; i++) {
            equipo1[i] = new Jugador();
        }
       Jugador[] equipo2 = new Jugador[14];
        for (int i = 0; i < equipo1.length; i++) {
            equipo2[i] = new Jugador();
        }
        Jugador[] equipo3 = new Jugador[14];
        for (int i = 0; i < equipo1.length; i++) {
            equipo3[i] = new Jugador();
        }
        Jugador[] equipo4 = new Jugador[14];
        for (int i = 0; i < equipo1.length; i++) {
            equipo4[i] = new Jugador();
        }
        Jugador[] equipo5 = new Jugador[14];
        for (int i = 0; i < equipo1.length; i++) {
            equipo5[i] = new Jugador();
        }
        Jugador[] equipo6 = new Jugador[14];
        for (int i = 0; i < equipo1.length; i++) {
            equipo6[i] = new Jugador();
        }
        Jugador[] equipo7 = new Jugador[14];
        for (int i = 0; i < equipo1.length; i++) {
            equipo7[i] = new Jugador();
        }
        Jugador[] equipo8 = new Jugador[14];
        for (int i = 0; i < equipo1.length; i++) {
            equipo8[i] = new Jugador();
        }
        
        Portero por1 = new Portero();
        Portero por2 = new Portero();
        Portero por3 = new Portero();
        Portero por4 = new Portero();
        Portero por5 = new Portero();
        Portero por6 = new Portero();
        Portero por7 = new Portero();
        Portero por8 = new Portero();
        
    
    Equipo pasaYvete = new Equipo("Pasa y vete","Romualdo Rodriguez",3500,equipo1,por1);
    Equipo notoco = new Equipo("No toco bola","Anselmo Luque",3500,equipo2,por2);
    Equipo vJuniors = new Equipo("Vodka Juniors","Zinedine Zidan",3500,equipo3,por3);
    Equipo rayoV = new Equipo("Rayo Vayacaño","Gil Gil",3500,equipo4,por4);
    Equipo csk = new Equipo("CSKA Cenfria","Juanito Juanin",3500,equipo5,por5);
    Equipo aston = new Equipo("Aston Birra","Gregorio MCGregor",3500,equipo6,por6);
    Equipo macabi = new Equipo("Maccabi de levantar","Alberto Vago",3500,equipo7,por7);
    Equipo real = new Equipo("Real Suciedad","Antonio Trapillo",3500,equipo8,por8);


    
    }
}
