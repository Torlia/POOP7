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
public class AnimalTerrestre extends Animal{
    int numPatas;

    /**
     * Constructor vacío
     */
    public AnimalTerrestre() {
    }

    /**
     * Sobrecarga de constructor con atributos del animal y animal terrestre
     * @param numPatas número de patas del animal terrestre
     * @param nombre nombre del animal terrestre
     * @param lugarOrigen lugar de origen del animal terrestre
     * @param color color del animal terrestre
     */
    public AnimalTerrestre(int numPatas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numPatas = numPatas;
    }

    /**
     * Getter para consultar el valor de la variable número de patas
     * @return número de patas del animal terrestre
     */
    public int getNumPatas() {
        return numPatas;
    }

    /**
     * Setter para modificar el valor de la variable número de patas
     * @param numPatas número de patas del animal terrestre
     */
    public void setNumPatas(int numPatas) {
        this.numPatas = numPatas;
    }
    
    /**
     * Método para indicar que el animal terrestre estña corriendo
     */
    public void correr(){
        System.out.println("El canino corre vloz OwO");
    }
    
    /**
     * Método para indicar que el animal terrestre está comiendo
     */
    public void comer(){
        System.out.println("El perrito come ¡guaf guaf!");
    }

    /**
     * Override que permite imprimir en una línea todas las variables del objeto tipo Animal y AnimalTerrestre
     * @return variables de Animal y AnimaTerrestre
     */
    @Override
    public String toString() {
        return super.toString() + "AnimalTerrestre{" + "numPatas=" + numPatas + '}';
    }
    
}
