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
public class Main{
    /**
     * Método principal
     * Crea los objetos tipo clase
     * @param args array de Strings
     */
    public static void main(String[] args) {
        System.out.println("--- Herencia ---");
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
       

        System.out.println("\n--- Instancias ---");
        
        //Si es de tipo gerente
        if(ger3 instanceof Gerente)
            System.out.println("Gerente es intancia de Gerente");
        
        if(ger3 instanceof Empleado)
            System.out.println("Gerente es instancia de Empleado");
        
        if(ger instanceof Object)
            System.out.println("Gerente es instancia de Object");
        
        
        System.out.println("\n--- Animales ---");
        
        System.out.println(". Ballena .");
        //creación de objeto tipo animal
        Animal anim = new Animal();
        System.out.println(anim);
        
        //creación de objeto tipo animal acuático
        AnimalAcuatico animAcuat = new AnimalAcuatico();
        System.out.println(animAcuat);
        
        //creación de objeto tipo ballena
        Ballena ballena = new Ballena(27, 3, "Ballena", "Océano", "Azul");
        System.out.println(ballena);
        
        //llamar a métodos
        ballena.sonido("canto");
        anim.comer();
        ballena.nadar();
        ballena.comer();
        ballena.pelearConPinocho();
        
        
        System.out.println("\n. Perro .");
        System.out.println(anim);
   
        AnimalTerrestre terreste = new AnimalTerrestre();
        System.out.println(terreste);
        
        Perro dog = new Perro("Verde", 4, "Firulais", "Escocia", "Café");
        System.out.println(dog);
        
        dog.correr();
        dog.comer();
        dog.hacerTrucos();
        
        
        System.out.println("\n. Pájaro .");
        System.out.println(anim);

        AnimalAereo animAer = new AnimalAereo();
        System.out.println(animAer);

        Pajaro pajaro = new Pajaro("Nectarívoro", 2, "Colibrí", "América", "Arcoíris");
        System.out.println(pajaro);

        pajaro.sonido("pitido");
        anim.comer();
        pajaro.volar();
        pajaro.comer();
        pajaro.recolectarRamas();
    }
}
