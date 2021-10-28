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
public class Main {
    public static void main(String[] args) {
        Empleado emp = new Empleado();
        System.out.println(emp);
        
        Gerente ger = new Gerente();
        System.out.println(ger);
        ger.setNombre("Raul Jimenez");
        ger.setNumEmpleado(568432);
        ger.setSueldo(25_000);
        System.out.println(ger);
        ger.aumentarSueldo(20);
        ger.asignarPresupuesto(50_000);
        System.out.println(ger);
        System.out.println("Nombre del gerente: " + ger.getNombre());
        
        Gerente ger2 = new Gerente("Karen Avalos", 596723, 80_000, 120_000);
        System.out.println(ger2);
        
        Gerente ger3 = new Gerente("Samantha Rios", 958645, 35_000);
        System.out.println(ger3);
        
        System.out.println("--- Instancias ---");
        
        //Si es de tipo gerente
        if(ger3 instanceof Gerente)
            System.out.println("Gerente es intancia de Gerente");
        
        if(ger3 instanceof Empleado)
            System.out.println("Gerente es instancia de Empleado");
        
        if(ger instanceof Object)
            System.out.println("Gerente es instancia de Object");
    }
}
