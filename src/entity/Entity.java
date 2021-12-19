package entity;

import place.Place;

public abstract class Entity {

    private Place place;

    private String name;

    public Entity(String name) {
        this.name = name;
    }

    public Entity(String name, Place place) {
        this.place = place;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Place getPlace() {
        return place;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return getClass().getName() + "[name: " + getName() + "]";
    }
}
