/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectomanager;

/**
 *
 * @author Isaac
 * 
 */
public class Jugador {
    private String nombre; //nombre del jugador
    private String apellido1; // primer apellido
    private String apellido2; //segundo apellido
    private byte edad; //edad del jugador
    private byte forma; //estado de forma
    private byte dorsal; //dorsal que lleva en la camiseta
    private int  valor; //Valor del jugador en monedas "Coins"
    private byte velocidad; // estadistica de velocidad del jugador
    private byte tiro;// estadistica de tiro del jugador
    private byte pase;// estadistica de pase del jugador
    private byte regate;// estadistica de regate del jugador
    private byte defensa; // estadistica de defensa del jugador
    private byte fisico; // estadistica de fisico del jugador
    
    public Jugador(){
    nombre = dameNombre();
    apellido1 = dameApellido();
    apellido2 = dameApellido();
    edad = edadRand();
    dorsal = dorsalRand();
    valor = valorRand();
    velocidad = estRand();
    tiro = estRand();
    pase = estRand();
    regate = estRand();
    defensa = estRand();
    fisico = estRand();
    
    };

    public Jugador(String nombre,String apellido1,String apellido2, byte edad, byte forma, byte dorsal, int valor, byte velocidad, byte tiro, byte pase, byte regate, byte defensa, byte fisico) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.edad = edad;
        this.forma = forma;
        this.dorsal = dorsal;
        this.valor = valor;
        this.velocidad = velocidad;
        this.tiro = tiro;
        this.pase = pase;
        this.regate = regate;
        this.defensa = defensa;
        this.fisico = fisico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public byte getForma() {
        return forma;
    }

    public void setForma(byte forma) {
        this.forma = forma;
    }

    public byte getDorsal() {
        return dorsal;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public byte getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(byte velocidad) {
        this.velocidad = velocidad;
    }

    public byte getTiro() {
        return tiro;
    }

    public void setTiro(byte tiro) {
        this.tiro = tiro;
    }

    public byte getPase() {
        return pase;
    }

    public void setPase(byte pase) {
        this.pase = pase;
    }

    public byte getRegate() {
        return regate;
    }

    public void setRegate(byte regate) {
        this.regate = regate;
    }

    public byte getDefensa() {
        return defensa;
    }

    public void setDefensa(byte defensa) {
        this.defensa = defensa;
    }

    public byte getFisico() {
        return fisico;
    }

    public void setFisico(byte fisico) {
        this.fisico = fisico;
    }
    
    /**
     * Genera un numero aleatorio para determinar la posicion en un array de nombres.
     * @return devuelve un nombre aleatorio de un array
     */
    public final String dameNombre() {   
        byte rand = (byte) (Math.random() *29);
        String[] arrayNombres = new String [30];
        arrayNombres [0] ="Dario";
        arrayNombres [1] ="Fernando";
        arrayNombres [2] ="Jose Gabriel";
        arrayNombres [3] ="Carlos";
        arrayNombres [4] ="Ian";
        arrayNombres [5] ="Cipriano";
        arrayNombres [6] ="Luis";
        arrayNombres [7] ="Francisco";
        arrayNombres [8] ="Jose";
        arrayNombres [9] ="Ignacio";
        arrayNombres [10] ="Unai";
        arrayNombres [11] ="Fermin";
        arrayNombres [12] ="Marcial";
        arrayNombres [13] ="Juan Antonio";
        arrayNombres [14] ="Miguel";
        arrayNombres [15] ="Isaac";
        arrayNombres [16] ="Yeray";
        arrayNombres [17] ="Damian";
        arrayNombres [18] ="Roberto";
        arrayNombres [19] ="Marcelo";
        arrayNombres [20] ="Leopoldo";
        arrayNombres [21] ="Marcos";
        arrayNombres [22] ="Antonio";
        arrayNombres [23] ="Joaquin ";
        arrayNombres [24] ="Jordi";
        arrayNombres [25] ="Gabriel";
        arrayNombres [26] ="Vicente";
        arrayNombres [27] ="David";
        arrayNombres [28] ="Samuel";
        arrayNombres [29] = "Lionel";
        return arrayNombres [rand];
}
    /**
     * Genera un numero aleatorio para determinar la posicion en un array de apellidos.
     * @return devuelve un apellido aleatorio de un array.
     */
    public String dameApellido() {   
        byte rand = (byte) (Math.random() *29);
        String[] arrayNombres = new String [30];
        arrayNombres [0] ="Lobato";
        arrayNombres [1] ="Velazquez";
        arrayNombres [2] ="Arias";
        arrayNombres [3] ="Capdevila";
        arrayNombres [4] ="Castello";
        arrayNombres [5] ="Maroto";
        arrayNombres [6] ="Domingo";
        arrayNombres [7] ="de Leon";
        arrayNombres [8] ="Ortuño";
        arrayNombres [9] ="Montilla";
        arrayNombres [10] ="Plasencia";
        arrayNombres [11] ="del Olmo";
        arrayNombres [12] ="Quiros";
        arrayNombres [13] ="Ronaldo";
        arrayNombres [14] ="Messi";
        arrayNombres [15] ="Carrasco";
        arrayNombres [16] ="Ibarra";
        arrayNombres [17] ="Cano";
        arrayNombres [18] ="Llanos";
        arrayNombres [19] ="Rosell";
        arrayNombres [20] ="Oliva";
        arrayNombres [21] ="Vera";
        arrayNombres [22] ="Lara";
        arrayNombres [23] ="Montoro ";
        arrayNombres [24] ="Caballero";
        arrayNombres [25] ="Ballester";
        arrayNombres [26] ="Bellido";
        arrayNombres [27] ="Catalan";
        arrayNombres [28] ="Galvan";
        arrayNombres [29] = "Palazon";
        return arrayNombres [rand];
}
    public byte edadRand(){
   return (byte) (18 + Math.random()*40);
        
    }
    
     public byte dorsalRand(){
   return (byte) (1+ Math.random()*25);
        
    }
     
    public int valorRand(){
   return (int) (50 + Math.random()*1000);
 }
    
    /**
     * Se utiliza para establecer un num aleatorio entre 20-99, la función sera utilizada para estableces alguna estadística del jugador
     * @return num aleatorio 
     */
    public byte estRand(){
   return (byte) (20 + Math.random()*99);
        
    }
    
}
