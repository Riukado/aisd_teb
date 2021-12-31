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


    public int compareTo(Car otherCar) {
        int result = otherCar.getExclusive().compareTo(this.getExclusive());
        if (result==0){
            int result2 = otherCar.getYearOfProduction().compareTo(this.getYearOfProduction());
            if (result2 == 0){
                int result3 = otherCar.getLevelOfEquipment().compareTo(this.getLevelOfEquipment());
                if (result3 == 0){
                    return otherCar.getValue().compareTo(this.getValue());
                }
                return result3;
            }
            return result2;
        }
        return result;
    }

    public double getValue() {
        return value;
    }

    public int getLevelOfEquipment() {
        return levelOfEquipment;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public boolean getExclusive() {
        return isExclusive;
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