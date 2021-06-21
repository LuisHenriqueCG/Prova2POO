package Pizzaria;

import java.util.ArrayList;

public class Flavor {

    double flavorValue;
    PizzaSize size = new PizzaSize();
    ArrayList<String> flavorList = new ArrayList();

    Order order = new Order();

    public ArrayList selectFlavor(int op) {

        switch (op) {
            case 1:
                flavorList.add("5 Queijos");
                break;
            case 2:
                flavorList.add("Frango Catupiry");
                break;
            case 3:
                flavorList.add("Cheddar");
                flavorValue += 3.50;
                break;
            case 4:
                flavorList.add("Calabresa");
                break;
            case 5:
                flavorList.add("Chocolate");
                break;
            case 6:
                flavorList.add("Prestigio");
                break;
            case 7:
                flavorList.add("Salmao com alcaparras");
                flavorValue += 4.0;
                break;
            case 8:
                flavorList.add("Camarao");
                flavorValue += 4.50;
                break;
            case 9:
                flavorList.add("Abacaxi com Canela");
                break;
        }

        return flavorList;
    }

}