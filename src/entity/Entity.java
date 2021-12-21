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


    @Override
    public int hashCode() {
        return 0;
    }



    @Override
    public boolean equals(Object anotherObject) {
        if (this == anotherObject) return true;
        if (anotherObject == null) return false;
        if (getClass() != anotherObject.getClass()) return false;
        Entity another = (Entity) anotherObject;
        return name.equals(another.name) && place.equals(another.place);
    }


}
