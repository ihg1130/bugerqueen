package app;

import app.discount.*;
import app.discount.discountCondition.*;
import app.discount.discountPolicy.*;
import app.product.*;

public class AppConfigurer {

    private Cart cart = new Cart(productRepository(), menu());
    public ProductRepository productRepository() {
        return new ProductRepository();
    }

    public Menu menu() {
        return new Menu(productRepository().getAllProducts());
    }

    public Cart cart() {
        return cart;
    }

    public Discount discount() {
        return new Discount(
                new DiscountCondition[]{
                        new CozDiscountCondition(new FixedRateDiscountPolicy(10)),
                        new KidDiscountCondition(new FixedAmountDiscountPolicy(500))
                });
    }

    public Order order() {
        return new Order(cart(), discount());
    }
}
