package entity;

import place.Place;

import ect.Price;

//  акции
public class Stocks extends Entity {

    private static Price price = Price.Normal;

    public Stocks(String name, Place place) {
        super(name, place);
    }

    public void checkCurrentPrice() {
        System.out.println( getName() + ":" + price.getCost() + getPlace().getName());
    }

    public static Price getPrice() {
        return price;
    }

    public static void setPrice(Price price) {
        Stocks.price = price;
    }


}
