package app;
import app.product.*;


import java.util.Scanner;

public class OrderApp {
    public void start(){


        Scanner scanner = new Scanner(System.in);

        ProductRepository productRepository = new ProductRepository();
        Product[] products = productRepository.getAllProducts();
        Menu menu = new Menu(products);

        Cart cart = new Cart(productRepository, menu);

        System.out.println("BurgerQueen Order Service");
        while (true){
        menu.printMenu();
        String input = scanner.nextLine();

        if(input.equals("+")){
            break;
        }
        else{
            int menuNumber = Integer.parseInt(input);

            if(menuNumber == 0) cart.printCart();

            else if(1 <= menuNumber && menuNumber <= products.length) cart.addToCart(menuNumber);
        }

}
}
}
