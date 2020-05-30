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
public class Equipo {
    private String nombre;
    private String entrenador;
    private int presupuesto;    
    private Jugador[] listaEquipo;
    private Portero portero;
    
    public Equipo(String nombre, String entrenador, int presupuesto,Jugador[] listaEquipo,Portero portero) {
        this.nombre = nombre;
        this.entrenador = entrenador;
        this.presupuesto = presupuesto;
        this.listaEquipo =  listaEquipo;
        this.portero = portero;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(String entrenador) {
        this.entrenador = entrenador;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public Jugador[] getListaEquipo() {
        return listaEquipo;
    }

    public void setListaEquipo(Jugador[] listaEquipo) {
        this.listaEquipo = listaEquipo;
    }

    public Portero getPortero() {
        return portero;
    }

    public void setPortero(Portero portero) {
        this.portero = portero;
    }
    
    
    
}
