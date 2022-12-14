package org.flintcore.cofee;

import org.flintcore.cofee.base.MaquinaDeCafe;
import org.flintcore.cofee.contenedor.Azucarero;
import org.flintcore.cofee.contenedor.Cafetera;
import org.flintcore.cofee.contenedor.Vaso;

import java.util.Scanner;

public class Main {

    private static final String SALIDA_INPUT = "3";
    private static final int EXIT_INPUT_USER_MENU = 4;
    private static MaquinaDeCafe maquinaDeCafe;
    private static Scanner inputUser;

    public static void main(String[] args) {
        maquinaDeCafe = new MaquinaDeCafe();

//        Fill cafetera
        fillStorage();

        String answer = "";
        int option;

        inputUser = new Scanner(System.in);

        do {

            System.out.println("Seleccione una opcion:");
            System.out.println("1. Obtener cafe.");
            System.out.println("2. Inventario.");
            System.out.println("3. Salir.");

            try {
                option = inputUser.nextInt();
            } catch (Exception ex) {
                option = 0;
                showWrongInputMessage();
                continue;
            }

            switch (option) {
                case 1:
                    showUserGetMenu();
                    break;

                case 2:
                    showStorageGetMenu();
                    break;

                default:
            }

        } while (answer.equals(SALIDA_INPUT));


    }

    private static void fillStorage() {
        Vaso p = new Vaso(50, 10);
        Vaso m = new Vaso(50, 25);
        Vaso g = new Vaso(50, 35);
//        Azucar
        Azucarero azucarero = new Azucarero(200);

//        Cafe
        Cafetera cafe = new Cafetera(300);

        maquinaDeCafe.setAzucarero(azucarero);
        maquinaDeCafe.setVasoPequeno(p);
        maquinaDeCafe.setVasoPequeno(m);
        maquinaDeCafe.setVasoPequeno(g);
        maquinaDeCafe.setCafetera(cafe);

    }

    private static void showUserGetMenu() {
        int option = 0;

        do {
            System.out.println("1. Obtener cafe pequeño.");
            System.out.println("2. Obtener cafe mediano.");
            System.out.println("3. Obtener cafe grande.");
            System.out.println("4. Salir.");

            try {
                option = inputUser.nextInt();
            } catch (Exception ex) {
                option = 0;
                showWrongInputMessage();
                continue;
            }

            Vaso glassSelected = null;

            switch (option) {
                case 1:
                    glassSelected = maquinaDeCafe.getTipoDeVaso(MaquinaDeCafe.PEQUENO);
                    break;
                case 2:
                    glassSelected = maquinaDeCafe.getTipoDeVaso(MaquinaDeCafe.MEDIANO);
                    break;
                case 3:
                    glassSelected = maquinaDeCafe.getTipoDeVaso(MaquinaDeCafe.GRANDE);
                    break;

                default:

            }

            showCoffeMenu(glassSelected);

        } while (option != EXIT_INPUT_USER_MENU);

    }

    private static void showCoffeMenu(Vaso vaso) {
        int option = 0;
        int sugarValue, coffeeValue = sugarValue = -1;

        do {
            try {
                System.out.println("Ingrese la cantidad de azucar:");
                sugarValue = inputUser.nextInt();

            } catch (Exception e) {
                sugarValue = -1;
                continue;
            }

            try {
                System.out.println("Ingrese la cantidad de cafe:");
                coffeeValue = inputUser.nextInt();
            } catch (Exception e) {
                coffeeValue = -1;
            }
        } while (sugarValue == -1 && coffeeValue == -1);


    }

    private static void showStorageGetMenu() {
    }

    private static void showWrongInputMessage() {
        System.out.println("Valor no valido\n\n");
    }
}