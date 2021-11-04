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
public class AnimalAereo extends Animal{
    private int numeroAlas;

    /**
     * Constructor vacío
     */
    public AnimalAereo() {
    }

    /**
     * Sobrecarga de constructor con atributos del animal
     * @param nombre nombre del animal aereo
     * @param lugarOrigen lugar de origen del animal aereo
     * @param color colo del animal aereo
     */
    public AnimalAereo(String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
    }
    
     /**
     * Sobrecarga de constructor con atributos del animal y animal aéreo
     * @param numeroAlas número de aletas del animal aéreo
     * @param nombre nombre del animal aéreo
     * @param lugarOrigen lugar de origen del animal aéreo
     * @param color color del animal aéreo
     */
    public AnimalAereo(int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numeroAlas = numeroAlas;
    }

    /**
     * Getter para consultar el valor de la variable número de alas
     * @return número de alas del animal aéreo
     */
    public int getNumeroAlas() {
        return numeroAlas;
    }

    /**
     * Setter para modificar el valor de la variable número de alas
     * @param numeroAlas número de alas del animal aereo
     */
    public void setNumeroAlas(int numeroAlas) {
        this.numeroAlas = numeroAlas;
    }

    /**
     * Método para indicar que el animal aéreo está volando
     */
    public void volar(){
        System.out.println("El animal aéreo está volando");
    }

    /**
     * Método para indicar que el animal aéreo está comiendo
     */
    public void comer(){
        System.out.println("El animal aéreo está comiendo alpiste");
    }

    /**
     * Override que permite imprimir en una línea todas las variables del objeto tipo Animal y tipo AnimalAereo
     * @return variables de Animal y AnimalAereo
     */
    @Override
    public String toString() {
        return super.toString() + "AnimalAereo{" + "numeroAlas=" + numeroAlas + '}';
    }
    
}
