package myPackage.exam.colections;

import java.util.List;

public class Task2 extends Car{
        //przynajmniej 10 elementów, pokrywająca większość przypadków i umożliwiająca po wyświetlonych danych ocenić działanie programu
        //todo ma być posortowana po roczniku, auta nowsze jako pierwsze a starze później i stale utrzymywać porządek

    Car punto = new Car(false,2000,1,0,26499.99);
    Car sedan = new Car(false,1995,1,1,18020.39);
    Car tesla = new Car(true,2018,3,2,30000);
    Car ford = new Car(true,2021,2,3,244200);
    Car suzuki = new Car(false,2017,2,4,55500.10);
    Car nissan = new Car(false,2014,1,5,43999);
    Car peugeot = new Car(false,1990,1,6,18495);
    Car lexus = new Car(true,2021,3,7,233300);
    Car fiat = new Car(false,2010,1,8,3089.99);
    Car dacia = new Car(false,2006,2,9,13030);
    Car bmw = new Car(true,2022,3,10,12245.99);
    Car skoda = new Car(false,2015,2,11,40000);
    Car volvo = new Car(false,2012,1,12,15000);

    public static List<Car> carList;

    public Task2(boolean isExclusive, int yearOfProduction, int levelOfEquipment, int id, double value) {
        super(isExclusive, yearOfProduction, levelOfEquipment, id, value);
    }

    public static List<Car> getCarList() { //TIP singleton
        //zwraca aktualny stan listy aut
        //todo
        return carList;
    }

    public static void printSortedCars() {
        //Wypisz na konsolę listę aut (listę należy zrobić samodzielnie, przygotowanie danych testowych jest częścią zadania)
        //lista ma być posortowana po atrybutach w następującej kolejności:
        //auta ekskluzywne mają znajdować się na początku listy
        //auta najnowsze, o najwyższym roku produkcji, mają być wyświetlane przed autami starszymi
        //auta o wyższym poziomie wyposażenia mają być przed autami o niższym poziomie wyposażenia
        //auta droższe mają być wyświetlane przed tańszymi
        System.out.println();

    }

    public static void printCarsToValueAndLevelOfEquipment(double maxValue, int levelOfEquipment) {
        //Kontekst biznesowy: klient wchodzi na stronę salonu samochodów używanych i chce zobaczyć auta do pewnej kwoty "maxValue"
        //oraz mające konkretny poziom wyposażenia np: poziom 2 = auto ma klimatyzacje, a poziom 1 auto klimatyzacji nie ma itp
        //ZADANIE: wyfiltruj a następnie wypisz auta od najtańszego do najdroższego z listy aut
        //todo tutaj wykonaj zadanie
    }

    public static void addCarsToList() {
        carList.add();
    }

    public static void removeCarFromList() {
        carList.remove();
    }

    public static void printCarListAfterSomeModifications() {
        //dodaj 2-3 nowe auta do listy
        //usuń z listy 1-2 auta
        //wyświetl listę
        //todo
        carList.add();
    }

}
