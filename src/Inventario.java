/**
 * Autor: Juan Sebastian Franco Castro
 * 1K DAM
 * UD2Repaso
 */

import java.util.Scanner;

public class Inventario {
    public static void main(String[] args) {
        //Inicio del Flujo del Trabajo
        Scanner scan = new Scanner(System.in);

        //Declaracion de Variables
        int manzana = 0;
        int pera = 0;
        int valor;

        //Recoleccion de Informacion al Usuario
        System.out.println("1. Agregar Manzana\n2. Agregar Pera\n3. Eliminar Manzana\n4. ELiminar Pera\n" +
                "5. Mostrar Inventario\n6. Salir");

        //Verificar si el VaLor no es un Entero
        while (!scan.hasNextInt()) {
            System.out.println("Ingresa un numero entero");
            scan.next();
        }
        valor = scan.nextInt();

        //Operacion Algoritmica
        while (valor != 6) {
            //Switch Nuevo
            switch (valor) {
                //Agregar Manzana
                case 1 -> {
                    manzana++;
                    System.out.println("Haz agregado una manzana");
                }
                //Agregar Pera
                case 2 -> {
                    pera++;
                    System.out.println("Haz agregado una pera");
                }
                //ELiminar Manzana
                case 3 -> {
                    //Debe haber una Manzana como Minimo si se Quiere Eliminar una
                    if (manzana > 0) {
                        manzana--;
                        System.out.println("Haz quitado una manzana");
                        //Si hay Menos de 3 Manzanas se Avisara de Reponer
                        if (manzana <= 3){
                            System.out.println("Hay que reponer");
                        }
                    } //En Caso de NO Haber Manzanas, se Avisara
                    else {
                        System.out.println("No hay inventario");
                    }
                }
                //ELiminar Pera
                case 4 -> {
                    //Debe haber una Pera como Minimo si se Quiere Eliminar una
                    if (pera > 0) {
                        pera--;
                        System.out.println("Haz quitado una pera");
                        //Si hay Menos de 3 Peras se Avisara de Reponer
                        if (pera <= 3){
                                System.out.println("Hay que reponer");
                        }
                    } //En Caso de NO Haber Peras, se Avisara
                    else {
                        System.out.println("No hay inventario");
                    }
                }
                //Imprimir la Cantidad de Inventario
                case 5 -> System.out.println("Tienes " + manzana + " mazanas y " + pera + " peras.");
                default -> System.out.println("Valor no valido");
            }

            //Volver a Mostrar el Menu
            System.out.println("1. Agregar Manzana\n2. Agregar Pera\n3. Eliminar Manzana\n4. ELiminar Pera\n" +
                    "5. Mostrar Inventario\n6. Salir");

            //Volver a Verificar si no es un Valor Entero
            while (!scan.hasNextInt()) {
                System.out.println("Ingresa un numero entero");
                scan.next();
            }
            valor = scan.nextInt();
        }
        //Termina el Programa
        System.out.println("Hasta Luego, Juan Sebastian Franco");
    }
}