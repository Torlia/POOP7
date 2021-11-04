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
public class AnimalAcuatico extends Animal{
    private int numAletas;

    /**
     * Constructo vacío
     */
    public AnimalAcuatico() {
    }
    
    /**
     * Sobrecarga de constructor con atributos del animal
     * @param nombre nombre del animal acuático
     * @param lugarOrigen lugar de origen del animal acuático
     * @param color colo del animal acuático
     */
    public AnimalAcuatico(String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
    }

    /**
     * Sobrecarga de constructor con atributos del animal y animal acuático
     * @param numAletas número de aletas del animal acuático
     * @param nombre nombre del animal acuático
     * @param lugarOrigen lugar de origen del animal acuático
     * @param color color del animal acuático
     */
    public AnimalAcuatico(int numAletas, String nombre, String lugarOrigen, String color) {
        super(nombre, lugarOrigen, color);
        this.numAletas = numAletas;
    }

    /**
     * Getter para consultar el valor de la variable número de aletas
     * @return número de aletas del animal acuático
     */
    public int getNumAletas() {
        return numAletas;
    }

    /**
     * Setter para modificar el valor de la variable número de aletas
     * @param numAletas número de aletas del animal acuático
     */
    public void setNumAletas(int numAletas) {
        this.numAletas = numAletas;
    }
    
    /**
     * Método para indicar que el animal acúatico está nadando
     */
    public void nadar(){
        System.out.println("El animal acuático está nadando");
    }
    
    /**
     * Método para indicar que el animal acuático está comiendo
     */
    public void comer(){
        System.out.println("El animal acuático está comiendo plancton y peces");
    }

    /**
     * Override que permite imprimir en una línea todas las variables del objeto tipo Animal y tipo AnimalAcuatico
     * @return variables de Animal y AnimalAcuatico
     */
    @Override
    public String toString() {
        return super.toString() + "AnimalAcuatico{" + "numAletas=" + numAletas + '}';
    }
    
}