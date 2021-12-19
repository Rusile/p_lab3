package entity;

import ect.Price;
import place.Place;

public class Noone extends Entity {


    public Noone(String name) {
        super(name);
    }

    //никто

    public void dontWantorWant(Stocks stocks) {
        if (Stocks.getPrice() == Price.Low)
            System.out.println(getName() + " не хотел покупать акции");
        if (Stocks.getPrice() == Price.Normal)
            System.out.println(getName() + " не остался в минусе");

    }
}
