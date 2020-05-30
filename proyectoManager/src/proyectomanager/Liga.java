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
public class Liga {
    //La liga contendrá un array de tipo Equipo, contiene los equipos con sus estadisticas
    private Equipo[] clasificacion;

    public Liga(Equipo[] clasificacion) {
        this.clasificacion = clasificacion;
    }

    public Equipo[] getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(Equipo[] clasificacion) {
        this.clasificacion = clasificacion;
    }
    
    
    public void mostrarClasificacion(){
        for (int i = 0; i < clasificacion.length; i++) {
            System.out.println(i+"º "+clasificacion);   
        }
    }
}