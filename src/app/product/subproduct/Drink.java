package app.product.subproduct;

import app.product.Product;

public class Drink extends Product {
    private Boolean hasStraw;

    public Drink(int id, String name, int price, int kcal, Boolean hasStraw) {
        super(id, name, price, kcal);
        this.hasStraw = hasStraw;
    }

    public Drink(Drink drink){
        super(drink.getName(), drink.getPrice(), drink.getKcal());
        this.hasStraw = drink.hasStraw();
    }
    public Boolean hasStraw() {
        return hasStraw;
    }

    public void setHasStraw(Boolean hasStraw) {
        this.hasStraw = hasStraw;
    }
}
