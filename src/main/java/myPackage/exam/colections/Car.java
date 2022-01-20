package myPackage.exam.colections;

import java.util.UUID;

public class Car implements Comparable<Car> {
    Boolean isExclusive; // true or false
    Integer yearOfProduction; // eg 2021, 2015 etc
    Integer levelOfEquipment; // 3 > 2 > 1, higher the better
    UUID id;
    Double value; // how much does it cost for client


    //patrz Employee
    //dodaj wszystkie brakujące metody do klasy, aby móc jej używać w zadaniu Task2

    public Car(boolean isExclusive, int yearOfProduction, int levelOfEquipment, int id, double value) {
        this.isExclusive = isExclusive;
        this.yearOfProduction = yearOfProduction;
        this.levelOfEquipment = levelOfEquipment;
        this.id = UUID.randomUUID();
        this.value = value;
    }


    public Boolean getExclusive() {
        return isExclusive;
    }

    public Integer getYearOfProduction() {
        return yearOfProduction;
    }

    public Integer getLevelOfEquipment() {
        return levelOfEquipment;
    }

    public UUID getId() {
        return id;
    }

    public Double getValue() {
        return value;
    }

    @Override
    public int compareTo(Car o) {
        int result = o.getExclusive().compareTo(this.isExclusive);
        if (result == 0) {
            result = o.getYearOfProduction().compareTo(this.getYearOfProduction());
            if (result == 0) {
                result = o.getLevelOfEquipment().compareTo(this.getLevelOfEquipment());
                if (result == 0) {
                    result = o.getValue().compareTo(this.getValue());
                }
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return
                "Czy jest ekskluzywne: " + isExclusive +
                ", Rok produkcji: " + yearOfProduction +
                ", Poziom wyposażenia: " + levelOfEquipment +
                ", ID: " + id +
                ", Cena:  "+ value;
    }


}