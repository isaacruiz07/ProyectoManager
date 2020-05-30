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
public class Portero extends Jugador{

    private byte reflejos;
    private byte parada;
    private byte saque;
    private byte colocacion;

    
    public Portero(){
    reflejos = estRand();
    parada = estRand();
    saque = estRand();
    colocacion = estRand();
    };
    public Portero(String nombre, String apellido1, String apellido2, byte edad, byte forma, byte dorsal, int valor, byte velocidad, byte tiro, byte pase, byte regate, byte defensa, byte fisico) {
        super(nombre, apellido1, apellido2, edad, forma, dorsal, valor, velocidad, tiro, pase, regate, defensa, fisico);
    }

    public byte getReflejos() {
        return reflejos;
    }

    public void setReflejos(byte reflejos) {
        this.reflejos = reflejos;
    }

    public byte getParada() {
        return parada;
    }

    public void setParada(byte parada) {
        this.parada = parada;
    }

    public byte getSaque() {
        return saque;
    }

    public void setSaque(byte saque) {
        this.saque = saque;
    }

    public byte getColocacion() {
        return colocacion;
    }

    public void setColocacion(byte colocacion) {
        this.colocacion = colocacion;
    }

    
    
    
}
