package com.mycompany.poop7;
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CeciliaTorres, CeciliaZurita, JacielHernández, MarioTerán, MiguelCamacho
 */
public class Perro extends AnimalTerrestre{
    String colorCollar;
    
    /**
     * Constructor vacío
     */
    public Perro() {
    }
    
    /**
     * Sobrecarga de constructor con atributos del animal, animal terrestre y perro
     * @param colorCollar color del collar del perro
     * @param numPatas número de patas del perro
     * @param nombre nombre del perro
     * @param lugarOrigen lugar de origen del perro
     * @param color color del perro
     */
    public Perro(String colorCollar, int numPatas, String nombre, String lugarOrigen, String color) {
        super(numPatas, nombre, lugarOrigen, color);
        this.colorCollar = colorCollar;
    }
    
    /**
     * Sobrecarga de constructor con atributos del perro
     * @param colorCollar color del collar del perro
     */
    public Perro(String colorCollar) {
        this.colorCollar = colorCollar;
    }
    
    /**
     * Getter para consultar el valor de la variable color collar
     * @return color del collar del perro
     */
    public String getColorCollar() {
        return colorCollar;
    }

    /**
     * Setter para modificar el valor de la variable color collar
     * @param colorCollar color del collar del perro
     */
    public void setColorCollar(String colorCollar) {
        this.colorCollar = colorCollar;
    }
    
    /**
     * Método para elegir el truco que el perro hará por medio de un menú
     */
    public void hacerTrucos(){
        Random rnd = new Random();
        int trucazo;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("\n\t ===TRUCOS===");
        System.out.println("1 - Traer la pelota");
        System.out.println("2 - Sentarse");
        System.out.println("3 - Dar la patita");
        System.out.println("4 - Hacerce el muerto");
        System.out.println("5 - Bailar una cumbia");
        System.out.println("6- ¡¡RANDOM!!");
        System.out.println("7 - Salir");
        System.out.println("Seleccione una opción: ");
        trucazo=sc.nextInt();
        switch (trucazo) {
            case 1:
                System.out.println(Perro.super.getNombre()+" ha traido la pelota");
                break;
            case 2:
                System.out.println(Perro.super.getNombre()+" ha sentado");
                break;
            case 3:
                System.out.println(Perro.super.getNombre()+" te está dando la patita");
                break;
            case 4:
                System.out.println(Perro.super.getNombre()+" se hace el muertito");
                break;
            case 5:
                System.out.println(Perro.super.getNombre()+" *Se pone a bailar*");
                break;
            case 6:
                trucazo = rnd.nextInt(4)+1;
                switch (trucazo) {
                    case 1:
                    System.out.println(Perro.super.getNombre()+" ha traido la pelota");
                    break;
                case 2:
                    System.out.println(Perro.super.getNombre()+" se ha sentado");
                    break;
                case 3:
                    System.out.println(Perro.super.getNombre()+" te está dando la patita");
                    break;
                case 4:
                    System.out.println(Perro.super.getNombre()+" se hace el muertito");
                    break;
                case 5:
                    System.out.println(Perro.super.getNombre()+" *c pone a bailar*");
                    break;
                        default:
                            System.out.println("ª");
                }
                break;
            case 7:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida");
        }
        }while (trucazo!=7);
    }

    /**
     * Override que permite imprimir en una línea todas las variables del objeto tipo Animal, AnimalTerrestre y Perro
     * @return variables de Animal, AnimaTerrestre y Perro
     */
    @Override
    public String toString() {
        return super.toString() + "Perro{" + "colorCollar=" + colorCollar + '}';
    }
    
}
