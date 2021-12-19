package entity;

import ect.*;

public class Lords extends EntitiesWithMood {


    public Lords(String name) {
        super(name);
    }


    //Владельцы гигантских акций


    public void sellOrSave(Article article, Stocks stocks) {
        if (article.getIsAppeared()) {
            System.out.println(getName() + " бросились продавать акции ");
            Stocks.setPrice(Price.Low);

        } else {
            System.out.println(getName() + " сохранили свои акции");
            Stocks.setPrice(Price.Normal);
        }
    }

    @Override
    public void checkMood() {
        if (Stocks.getPrice() == Price.Low) {
            setMood(" были в отчаянии");
            System.out.println(getName() + getMood());
        }
        if (Stocks.getPrice() == Price.High) {
            setMood(" чувствовали себя прекрасно");
            System.out.println(getName() + getMood());
        }
        if (Stocks.getPrice() == Price.Normal) {
            setMood(" были спокойны");
            System.out.println(getName() + getMood());
        }
    }


}
