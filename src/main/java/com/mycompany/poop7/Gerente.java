/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.poop7;

/**
 *
 * @author cecitowers
 */
public class Gerente extends Empleado{
    private int presupuesto;
    private boolean presupuestoAsignado;

    public Gerente() {
    }

    public Gerente(String nombre, int numEmpleado, int sueldo, int presupuesto) {
        super(nombre, numEmpleado, sueldo);
        this.presupuesto = presupuesto;
        presupuestoAsignado = true;
    }

    public Gerente(String nombre, int numEmpleado, int sueldo) {
        super(nombre, numEmpleado, sueldo);
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }
    
    public void asignarPresupuesto(int presupuesto){
        this.presupuesto = presupuesto;
        presupuestoAsignado = true;
    }

    @Override
    public String toString() {
        return super.toString() + "Gerente{" + "presupuesto=" + presupuesto + ", presupuestoAsignado=" + presupuestoAsignado + '}';
    }
    
}
