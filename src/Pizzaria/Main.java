package Pizzaria;

public class Main {
    

   public static void main(String[] args) {
      
        Order order = new Order();
        PizzaSize size = new PizzaSize();
        Flavor flavor = new Flavor();
        EdgeFlavor edge = new EdgeFlavor();
        Drink drink = new Drink();
        
        order.order();
    }
}

