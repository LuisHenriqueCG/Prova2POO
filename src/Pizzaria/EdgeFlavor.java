package Pizzaria;

import java.util.Scanner;


public class EdgeFlavor {

    int operator;
    String border = "";
    double BorderValue;
    int validador = 0;
    Order order = new Order();

    public int validarBorda(int op) {
        switch (op) {
            case 1:
                selectBorder();
                validador = 1;
                break;
            case 2:

                break;
        }
        return 0;
    }

    public String selectBorder() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("SELECIONE UM SABOR DE BORDA \n"
                + "  Sabor da borda                      | Valor Adicional \n"
                + "[1] - Cheddar                         |   ------ \n"
                + "[2] - Catupiry                        |   ------ \n"
                + "[3] - 1/2 Nutella   1/2 Doce de Leite |   R$3,00 \n"
                + "[4] - Nutella                         |   R$2,00 \n");
        
        System.out.println("Por favor, me informe a borda de sua escolha: \n"
                + "*Cuidado com os valores adicionais*");
        operator = entrada.nextInt();

        switch (operator) {
            case 1:
                border = "Cheddar";
                break;

            case 2:
                border = "Catupiry";
                break;

            case 3:
                border = "1/2 Nutella 1/2 Doce de Leite";
                BorderValue = 3.0;
                break;

            case 4:
                border = "Nutella";
                BorderValue = 2.0;
                break;
        }
        return border;
    }
}