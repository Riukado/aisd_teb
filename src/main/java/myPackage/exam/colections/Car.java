package myPackage.exam.colections;

public class Car implements Comparable<Car>{
    boolean isExclusive; // true or false
    int yearOfProduction; // eg 2021, 2015 etc
    int levelOfEquipment; // 3 > 2 > 1, higher the better
    int id;
    double value; // how much does it cost for client

    //patrz Employee
    //todo dodaj wszystkie brakujące metody do klasy aby móc jej używać w zadniu Task2

    public Car(boolean isExclusive, int yearOfProduction, int levelOfEquipment, int id, double value) {
        this.isExclusive = isExclusive;
        this.yearOfProduction = yearOfProduction;
        this.levelOfEquipment = levelOfEquipment;
        this.id = id;
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
        return "Car{" +
                "isExclusive=" + isExclusive +
                ", yearOfProduction=" + yearOfProduction +
                ", levelOfEquipment=" + levelOfEquipment +
                ", id=" + id +
                ", value=" + value +
                '}';
    }
}