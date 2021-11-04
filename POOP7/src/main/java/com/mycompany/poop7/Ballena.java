/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop7;

/**
 *
 * @author CeciliaTorres, CeciliaZurita, JacielHernández, MarioTerán, MiguelCamacho
 */
public class Ballena extends AnimalAcuatico{
    private int largo;

    /**
     * Constructor vacío
     */
    public Ballena() {
    }

    /**
     * Sobrecarga de constructor con atributos del animal y animal acuático
     * @param numAletas número de aletas del animal acuático
     * @param nombre nombre del animal acuático
     * @param lugarOrigen lugar de origen del animal acuático
     * @param color color del animal acuático
     */
    public Ballena(int numAletas, String nombre, String lugarOrigen, String color) {
        super(numAletas, nombre, lugarOrigen, color);
    }

    /**
     * Sobrecarga de constructor con atributos del animal, animal acuático y ballena
     * @param largo largo de la ballena
     * @param numAletas número de aletas de la ballena
     * @param nombre nombre de la ballena
     * @param lugarOrigen lugar de origen de la ballena
     * @param color color de la ballena
     */
    public Ballena(int largo, int numAletas, String nombre, String lugarOrigen, String color) {
        super(numAletas, nombre, lugarOrigen, color);
        this.largo = largo;
    }

    /**
     * Getter para consultar el valor de la variable largo
     * @return largo de la ballena
     */
    public int getLargo() {
        return largo;
    }

    /**
     *  Setter para modificar el valor de la variable largo
     * @param largo largo de la ballean
     */
    public void setLargo(int largo) {
        this.largo = largo;
    }
    
    /**
     * Método para indicar que la ballena está peleando con Pinocho
     */
    public void pelearConPinocho() {
        System.out.println("La ballena se comió a Gepetto y por ello está peleando con Pinocho");
    }

    /**
     * Override que permite imprimir en una línea todas las variables del objeto tipo Animal, AnimalAcuatico y Ballena
     * @return variables de Animal, AnimalAcuatico y Ballena
     */
    @Override
    public String toString() {
        return super.toString() + "Ballena{" + "largo=" + largo + '}';
    }
    
}
