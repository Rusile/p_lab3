package entity;

import ect.Price;
import place.Place;

public class GadkinzArticle extends Article {

    public GadkinzArticle(String name) {
        super(name);
    }

    //Ряд статей
    @Override
    public void appeared() {
        fixSituation();
        System.out.println(getName() + "появилась");
    }

    public void fixSituation() {
        int chance = (int) (Math.random() * 1.99);
        if (getIsAppeared()) {
            Price newPrice = (chance == 0) ? Price.Low : Price.High;
            Stocks.setPrice(newPrice);
        }
    }
}
