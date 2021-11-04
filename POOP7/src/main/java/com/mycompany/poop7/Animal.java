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
public class Animal {
    private String nombre;
    private String lugarOrigen;
    private String color;

    /**
     * Constructor vacío
     */
    public Animal() {
    }

    /**
     * Sobrecarga de cosntructor
     * @param nombre nombre del animal
     * @param lugarOrigen lugar de origen del animal
     * @param color color del animal
     */
    public Animal(String nombre, String lugarOrigen, String color) {
        this.nombre = nombre;
        this.lugarOrigen = lugarOrigen;
        this.color = color;
    }

    /**
     * Getter para consultar el valor de la variable nombre
     * @return nombre del animal
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter para modificar el valor de la variable nombre
     * @param nombre nombre del animal
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter para consultar el valor de la variable lugar de origen
     * @return lugar de origen del animal
     */
    public String getLugarOrigen() {
        return lugarOrigen;
    }

    /**
     * Setter para modificar el valor de la variable lugar de origen
     * @param lugarOrigen lugar de origen del animal
     */
    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    /**
     * Getter para consultar el valor de la variable color
     * @return color del animal
     */
    public String getColor() {
        return color;
    }

    /**
     * Setter para modificar el valor de la variable color
     * @param color color del animal
     */
    public void setColor(String color) {
        this.color = color;
    }
    
    /**
     * Método para indicar qué sonido hace el animal
     * @param sonido sonido del animal
     */
    public void sonido(String sonido){
        System.out.println("El sonido de " + nombre + " es -> " + sonido);
    }
    
    /**
     * Método para indicar que el animal está comiendo
     */
    public void comer(){
        System.out.println("El animal está comiendo");
    }

    @Override
    /**
     * Override que permite imprimir en una línea todas las variables del objeto tipo Animal
     */
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", lugarOrigen=" + lugarOrigen + ", color=" + color + '}';
    }
    
}
