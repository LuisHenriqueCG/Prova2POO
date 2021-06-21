package Pizzaria;

import java.util.ArrayList;

public class PizzaSize {

    int amountOfFlavors;
    double sizeValue;
    double ValueWithBorder;
    String Size;
    int Validador = 0;
    EdgeFlavor edgeflavor = new EdgeFlavor();

    public int selectSize(int op) {

        switch (op) {
            case 1:
                amountOfFlavors = 5;
                Size = "Gigante";
                sizeValue = 75;
                ValueWithBorder = 80;
                break;

            case 2:
                amountOfFlavors = 4;
                Size = "Familia";
                sizeValue = 66;
                ValueWithBorder = 69.5;
                break;

            case 3:
                amountOfFlavors = 3;
                Size = "Media";
                sizeValue = 52;
                ValueWithBorder = 56.5;
                break;

            case 4:
                amountOfFlavors = 3;
                Size = "Pequena";
                sizeValue = 42;
                ValueWithBorder = 44.5;
                break;

            case 5:
                amountOfFlavors = 2;
                Size = "Broto";
                sizeValue = 28;
                Validador = 1;
                break;
        }
        return amountOfFlavors;
    }
}
