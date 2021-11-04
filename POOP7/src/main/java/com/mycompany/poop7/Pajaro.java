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
public class Pajaro extends AnimalAereo{
    private String tipoPico;

    /**
     * Constructo vacío
     */
    public Pajaro() {
    }

    /**
     * Sobrecarga de constructor con atributos del animal y animal aéreo
     * @param numeroAlas número de alas del pájaro
     * @param nombre nombre del pájaro
     * @param lugarOrigen lugar de origen del pájaro
     * @param color color del pájaro
     */
    public Pajaro(int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(numeroAlas, nombre, lugarOrigen, color);
    }

    /**
     * Sobrecarga de constructor con atributos del animal, animal aéreo y pájaro
     * @param tipoPico tipo del pico del pájaro
     * @param numeroAlas número de alas del pájaro
     * @param nombre nombre del pájaro
     * @param lugarOrigen lugar de origen del pájaro
     * @param color color del pájaro
     */
    public Pajaro(String tipoPico, int numeroAlas, String nombre, String lugarOrigen, String color) {
        super(numeroAlas, nombre, lugarOrigen, color);
        this.tipoPico = tipoPico;
    }

    /**
     * Getter para consultar el valor de la variable tipo pico
     * @return tipo de pico del pájaro
     */
    public String getTipoPico() {
        return tipoPico;
    }

    /**
     * Setter para modificar el valor de la variable tipo pico
     * @param tipoPico tipo de pico del pájaro
     */
    public void setTipoPico(String tipoPico) {
        this.tipoPico = tipoPico;
    }
    
    /**
     * Método para indicar que el pájaro está recolectando ramas
     */
    public void recolectarRamas(){
        System.out.println("El pájaro está recolectando ramas ");
    }

    /**
     * Override que permite imprimir en una línea todas las variables del objeto tipo Animal, AnimalAéreo y Pájaro
     * @return variables de Animal, AnimaAéreo y Pájaro
     */
    @Override
    public String toString() {
        return super.toString() + "Pajaro{" + "tipoPico=" + tipoPico + '}';
    }
    
}
