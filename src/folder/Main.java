/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package folder;

import java.util.Scanner;

/**
 *
 * @author neco3
 * Notas Rapidas
 *  1.- Para llamar un metodo de una funcion hay dos formas
 *      a.- Si el metodo no es static se tiene que declarar el objeto y ya se puede llamar el metodo
 *      b.- Si el metodo es estatico se llama el nombre de la clase y el metodo con un punto ejemplo Clase.Metodo
 * 2.- Se pueden llamar variables a otras clases y desde ahi modificarlas ejemplo: variable tipo int a 
 *     para llamarla en otra clase se tendria que hacer lo siguiente nombreClaseDeLaVariable.a
 * 
 */
public class Main {

    public static int cont = 0;
    public static final int tamano = 5;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declarar objeto
        Pais paises[] = new Pais[tamano];

        boolean flag = true;
        if (cont == tamano - 1) {
            System.out.println("Limite de paises ingresados");
        } else {
            do {
                //Instanciar objeto
                paises[cont] = new Pais();
                Metodos.menu();
                System.out.println("Ingrese una opcion");
                switch (sc.nextInt()) {
                    case 1:
                        Metodos.ingresar(paises);
                        break;
                    case 2:
                        Metodos.modificar(paises);
                        break;
                    case 3:
                        Metodos.mostrarDatos(paises);
                        break;
                    case 4:
                        Metodos.borrarPais(paises);
                        break;
                    case 5:
                        flag = false;
                        break;
                    default:
                        System.out.println("Ingreso una opcion no valida");
                }

            } while (flag != false);

        }
    }
}
