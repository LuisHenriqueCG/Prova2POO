package Pizzaria;

import java.util.Scanner;


public class Order {

    int x = 0;
    double TotalValue;

    public void order() {
        PizzaSize pizzaSize = new PizzaSize();
        Flavor flavor = new Flavor();
        EdgeFlavor edgeFlavor = new EdgeFlavor();
        Drink drink = new Drink();

        Scanner entrada = new Scanner(System.in);

        System.out.println("CARDÁPIO DE PIZZA: \n"
        +"      Tamanho       |Quantidade de Sabores | Valor S/Borda | Valor C/Borda \n"
        +"[1] - Gigante       |       5              |    R$75,00    |    R$80,00 \n"
        +"[2] - Familia       |       4              |    R$66,00    |    R$69,50 \n"
        +"[3] - Media         |       3              |    R$52,00    |    R$56,50 \n"
        +"[4] - Pequena       |       3              |    R$42,00    |    R$44,50 \n"
        +"[5] - Broto         |       2              |    R$28,00    |    Não Disponível \n");
        
        System.out.println("Digite o tamanho da pizza: *SOMENTE NÚMERO \n"
                +          "*Lembrando que o tamanho Broto, não tem borda disponível! ");
        pizzaSize.selectSize(entrada.nextInt());

        while (x < pizzaSize.amountOfFlavors) {
            Scanner entrada2 = new Scanner(System.in);

            System.out.println("CARDÁPIO DE SABORES: \n"
                    + "      Sabores                    | Valores Adicionais\n"
                    + "[1] - 5 Queijos                  |  --------- \n"
                    + "[2] - Frango Catupiry            |  --------- \n"
                    + "[3] - Cheddar                    |   R$3,50   \n"
                    + "[4] - Calabresa                  |  --------- \n"
                    + "[5] - Chocolate                  |  --------- \n"
                    + "[6] - Prestigio                  |  --------- \n"
                    + "[7] - Salmao com alcaparras      |   R$4,00   \n"
                    + "[8] - Camarão                    |   R$4,50   \n"
                    + "[9] - Abacaxi com Canela         |  --------- ");
            
            System.out.println("Escolha os sabores para sua pizza: \n"
                    +          "*Somente os números*");
            flavor.selectFlavor(entrada2.nextInt());
            x++;
        }
        //Adicinar Bebida
        if (pizzaSize.Validador == 0){
        Scanner entrada3 = new Scanner(System.in);
        System.out.println("Deseja adicionar borda? \n"
                +          "[1] - Sim \n"
                +          "[2] - Nao");
        edgeFlavor.validarBorda(entrada3.nextInt());
        }else{
            
        }

        double valor;
        if (edgeFlavor.validador == 1) {
            valor = pizzaSize.ValueWithBorder;
        } else {
            valor = pizzaSize.sizeValue;
        }

        while (drink.validador == 1) {
            Scanner entrada4 = new Scanner(System.in);
            System.out.println("Deseja adicionar alguma bebida?");
            System.out.println("[1] - Sim");
            System.out.println("[2] - Nao");

            drink.validarDrink(entrada4.nextInt());
        }

        TotalValue = valor + flavor.flavorValue + edgeFlavor.BorderValue + drink.drinkValue;
        System.out.println("RESUMO DO PEDIDO:");
        System.out.println("Tamanho: " + pizzaSize.Size);
        System.out.println("Sabores: " + flavor.flavorList);
        System.out.println("Bordas Selecionadas: " + edgeFlavor.border);
        System.out.println("Bebida(s) Escolhida(s): " + drink.drinkList);
        System.out.println("O Valor total do pedido foi: " +"R$" + TotalValue);

    }
}