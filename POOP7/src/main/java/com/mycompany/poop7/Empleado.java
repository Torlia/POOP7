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
public class Empleado {
    private String nombre;
    private int numEmpleado;
    private int sueldo;

    /**
     * Constructor vacío
     */
    public Empleado() {
    }

    //Sobrecarga
    /**
     * Sobrecarga de contructor
     * @param nombre nombre del empleado
     * @param numEmpleado número del empleado
     * @param sueldo  sueldo del empleado
     */
    public Empleado(String nombre, int numEmpleado, int sueldo) {
        this.nombre = nombre;
        this.numEmpleado = numEmpleado;
        this.sueldo = sueldo;
    }

    /**
     * Getter para consultar el valor de la variable nombre
     * @return nombre del empleado
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter para modificar el valor de la variable nombre
     * @param nombre nombre del empleado
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter para consultar el valor de la variable número de empleado
     * @return número del empleado
     */
    public int getNumEmpleado() {
        return numEmpleado;
    }

    /**
     * Setter para modificar el valor de la variable número de empleado
     * @param numEmpleado número del empleado
     */
    public void setNumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    /**
     * Getter para consultar el valor de la variable sueldo
     * @return sueldo del empleado
     */
    public int getSueldo() {
        return sueldo;
    }

    /**
     * Setter para modificar el valor de la variable sueldo
     * En caso de que el sueldo no sea mayor a cero, retornar cero
     * @param sueldo sueldo del empleado
     */
    public void setSueldo(int sueldo) {
        if(sueldo > 0)
            this.sueldo = sueldo;
        else
            this.sueldo = 0;
    }
    
    /**
     * Método para aumentar por cierto porcentaje el sueldo del empleado
     * @param porcentaje porcentaje a aumentar del sueldo original
     * @return sueldo aumentado del empleado
     */
    public int aumentarSueldo(int porcentaje){
        sueldo += (sueldo * porcentaje / 100);
        return sueldo;
    }

   @Override
   /**
    * Override que permite imprimir en una línea todas las variables del objeto tipo clase
    */
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", numEmpleado=" + numEmpleado + ", sueldo=" + sueldo + '}';
    }
    
}
