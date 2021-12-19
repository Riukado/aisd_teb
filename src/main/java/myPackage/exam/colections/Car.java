package myPackage.exam.colections;

import java.util.UUID;

public class Car {
    boolean isExclusive; // true or false
    int yearOfProduction; // eg 2021, 2015 etc
    int levelOfEquipment; // 3 > 2 > 1, higher the better
    UUID id;
    double value; // how much does it cost for client

    //patrz Employee
    //todo dodaj wszystkie brakujące metody do klasy aby móc jej używać w zadniu Task2

    public Car(boolean isExclusive, int yearOfProduction, int levelOfEquipment, UUID id, double value) {
        this.isExclusive = isExclusive;
        this.yearOfProduction = yearOfProduction;
        this.levelOfEquipment = levelOfEquipment;
        this.id = id;
        this.value = value;
    }

}
