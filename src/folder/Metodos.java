/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package folder;

import java.util.Scanner;

/**
 *
 * @author neco3
 */
public class Metodos {

    private static Scanner sc = new Scanner(System.in);

    //Static se pone para no tener que crear un objeto
    public static void menu() {
        System.out.println("1.-Agregar Pais\n2.-Modificar Pais\n3- Mostrar datos\n4.-Eliminar Pais\n5.-Salir");
    }

    public static void ingresar(Pais[] paises) {

        System.out.println("Ingresa el nombre del pais");
        paises[Main.cont].setNombreP(sc.nextLine());
        System.out.println("Ingresa la capital del pais");
        paises[Main.cont].setCapitalP(sc.nextLine());
        System.out.println("Ingresa el idioma del pais");
        paises[Main.cont].setIdiomaP(sc.nextLine());
        System.out.println("Ingresa la moneda del pais");
        paises[Main.cont].setMonedaP(sc.nextLine());
        System.out.println("Ingresa la poblacion del pais");
        paises[Main.cont].setPoblacion(Long.parseLong(sc.nextLine()));
        Main.cont++;
    }

    public static void menuModificar() {
        System.out.println("\nModificar Menu\n\n1.-Modificar Capital\n2.-Modificar Idioma\n3.-Modificar Poblacion\n4.-Salir");
    }

    public static void modificar(Pais[] paises) {
        System.out.println("ingrese el nombre del pais que desea modificar");
        String temp = sc.nextLine();
        boolean flag = true;
        for (int i = 0; i < Main.cont; i++) {
            do {

                if (paises[i].getNombreP().equals(temp)) {
                    System.out.println("Modificacion al pais" + paises[i].getNombreP());
                    Metodos.menuModificar();
                    switch (Integer.parseInt(sc.nextLine())) {
                        case 1:
                            System.out.println("Ingresa la nueva capital del pais");
                            paises[i].setCapitalP(sc.nextLine());
                            break;
                        case 2:
                            System.out.println("Ingresa el nuevo idioma del pais");
                            paises[i].setIdiomaP(sc.nextLine());
                            break;
                        case 3:
                            System.out.println("Ingresa la nueva cantidad de poblacion del pais");
                            paises[i].setPoblacion(Long.parseLong(sc.nextLine()));
                            break;
                        case 4:
                            flag = false;
                            break;
                        default:
                            System.out.println("Ingreso una opcion invalida");
                    }
                }
            } while (flag != false);
        }
    }

    public static void mostrarDatos(Pais[] paises) {
        for (int i = 0; i < Main.cont; i++) {
            System.out.println(paises[i].toString());
        }
    }

    public static void borrarPais(Pais[] paises) {
        System.out.println("Ingresa el pais que desea borrar");
        String temp = sc.nextLine();
        int aux = 0;
        boolean flag = true;
        for (int i = 0; i < Main.cont; i++) {
            if (paises[i].getNombreP().equals(temp)) {
                aux = i;
                flag = false;
            }
        }
        if (flag == false) {
            for (int i = aux; i < Main.cont; i++) {
                paises[i] = paises[i + 1];
            }
            Main.cont--;
        } else {
            System.out.println("No se encontro el pais");
        }

    }

}
