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
public class Gerente extends Empleado{
    private int presupuesto;
    private boolean presupuestoAsignado;

    /**
     * Constructor vacío
     */
    public Gerente() {
    }

    /**
     * Sobrecarga de constructor con atributos del empleado y gerente
     * @param nombre nombre del gerente
     * @param numEmpleado número del gerente
     * @param sueldo sueldo del gerente
     * @param presupuesto presupuesto que se le otorga al gerente
     */
    public Gerente(String nombre, int numEmpleado, int sueldo, int presupuesto) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
        presupuestoAsignado = true;
    }

    /**
     * Sobrecarga de constructor con atributos del empleado
     * @param nombre nombre del gerente
     * @param numEmpleado nombre del empleado
     * @param sueldo sueldo del gerente
     */
    public Gerente(String nombre, int numEmpleado, int sueldo) {
        super(nombre, numEmpleado, sueldo);
    }

    /**
     * Getter para consultar el valor de la variable presupuesto
     * @return presupuesto del gerente
     */
    public int getPresupuesto() {
        return presupuesto;
    }

    /**
     * Setter para modificar el valor de la variable presupuesto
     * @param presupuesto presupuesto del gerente
     */
    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    /**
     * Método para asignar presupuesto del gerente
     * El valor booleano de true se refiere a que sí se le asigna presupuesto al gerente
     * El valor booleano de flase se refiere a que no se le asigna presupuesto al gerente
     * @param presupuesto presupuesto del gerente
     */
    public void asignarPresupuesto(int presupuesto){
        this.presupuesto = presupuesto;
        presupuestoAsignado = true;
    }

    @Override
    /**
     * Override que permite imprimir en una línea todas las variables del objeto tipo Gerente y de la clase padre (Empleado)
     */
    public String toString() {
        return super.toString() + "Gerente{" + "presupuesto=" + presupuesto + ", presupuestoAsignado=" + presupuestoAsignado + '}';
    }
    
}
