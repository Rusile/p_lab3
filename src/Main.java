import place.*;
import entity.*;
import ect.*;

public class Main {
    public static void main(String[] args) {
        Article article = new Article("Статейка", Place.Newspaper);
        Lords lords = new Lords("Владельцы гигантских акций");
        Stocks stocks = new Stocks("Акции", Place.Barge);
        Noone noone = new Noone("Никто ");
        RichCrew bogachi = new RichCrew("Трое богачей ");
        Gadkinz gadkinz = new Gadkinz("господин Гадкинз ");
        GadkinzArticle gadkinzArticle = new GadkinzArticle("Ряд статей");

        article.appeared();
        stocks.checkCurrentPrice();
        lords.sellOrSave(article, stocks);
        stocks.checkCurrentPrice();
        noone.dontWantorWant(stocks);
        lords.checkMood();
        bogachi.pay(gadkinz);
        gadkinz.makeArticle(gadkinzArticle);
        gadkinzArticle.fixSituation();

        stocks.checkCurrentPrice();
        lords.checkMood();


    }
}










