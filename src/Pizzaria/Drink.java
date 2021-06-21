package Pizzaria;

import java.util.ArrayList;
import java.util.Scanner;


public class Drink {

    int operator;
    String drink = "";
    double drinkValue;
    int validador = 1;
    ArrayList  <String> drinkList = new ArrayList();

    public int validarDrink(int op) {

        switch (op) {
            case 1:
                selectDrink();
                break;
            case 2:
                validador = validador - 1;
                break;

        }
        return 0;
    }

    public ArrayList selectDrink() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("    CARDÁPIO DE BEBIDAS \n"
                + "Bebidas                       |  Valor \n"
                + "[1] - Coca Cola 2 LT          | R$9,50 \n"
                + "[2] - Cerveja Heineken 330 ML | R$6,50 \n"
                + "[3] - Suco Pratz 900ML        | R$12,50\n"
                + "[4] - Agua Mineral 600 ML     | R$3,50  ");
        
        System.out.println("Digite sua bebida: *SOMENTE O NÚMERO");
        operator = entrada.nextInt();

        switch (operator) {
            case 1:
                drinkList.add("Coca Cola 2 LT");
                drinkValue = drinkValue + 9.50;
                break;

            case 2:
                drinkList.add("Cerveja Heineken 330 ML");
                drinkValue = drinkValue + 6.50;
                break;

            case 3:
                drinkList.add("Suco Pratz 900 ML");
                drinkValue = drinkValue + 12.50;
                break;

            case 4:
                drinkList.add("Agua Mineral 600 ML");
                drinkValue = drinkValue + 3.50;
                break;
        }

        return drinkList;

    }

}