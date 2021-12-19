package entity;

import place.Place;

public abstract class EntitiesWithMood extends Entity {
    private String mood;

    public EntitiesWithMood(String name) {
        super(name);
    }

    public EntitiesWithMood(String name, Place place) {
        super(name, place);
    }

     public void setMood(String mood){
         this.mood = mood;
     }

     public String getMood(){
        return mood;
     }

    public void checkMood(){
        System.out.println(getMood());
    }
}
