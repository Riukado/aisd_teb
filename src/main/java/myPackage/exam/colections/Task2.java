package myPackage.exam.colections;

import java.util.*;

public class Task2 {
        //przynajmniej 10 elementów, pokrywająca większość przypadków i umożliwiająca po wyświetlonych danych ocenić działanie programu

    static Car punto = new Car(false,2000,1,0,26499.99);
    static Car sedan = new Car(false,1995,1,1,18020.39);
    static Car tesla = new Car(true,2018,3,2,30000);
    static Car ford = new Car(true,2021,2,3,244200);
    static Car suzuki = new Car(false,2017,2,4,55500.10);
    static Car nissan = new Car(false,2014,1,5,43999);
    static Car peugeot = new Car(false,1990,1,6,18495);
    static Car lexus = new Car(true,2021,2,7,233300);
    static Car fiat = new Car(false,2010,1,8,3089.99);
    static Car dacia = new Car(false,2006,2,9,13030);
    static Car bmw = new Car(true,2022,3,10,12245.99);
    static Car skoda = new Car(false,2015,2,11,40000);
    static Car volvo = new Car(false,2012,1,12,15000);

    public static List<Car> carList = new LinkedList<>(Arrays.asList(punto,sedan,tesla,ford,suzuki,nissan, peugeot,lexus,fiat,dacia, bmw, skoda, volvo));


    public static List<Car> getCarList() {
        return carList;
    }

    public static void printSortedCars() {
        //Wypisz na konsolę listę aut (listę należy zrobić samodzielnie, przygotowanie danych testowych jest częścią zadania)
        //lista ma być posortowana po atrybutach w następującej kolejności:
        //auta ekskluzywne mają znajdować się na początku listy
        //auta najnowsze, o najwyższym roku produkcji, mają być wyświetlane przed autami starszymi
        //auta o wyższym poziomie wyposażenia mają być przed autami o niższym poziomie wyposażenia
        //auta droższe mają być wyświetlane przed tańszymi
        Collections.sort(carList);
        for(Car car : carList){
            System.out.println(car);
        }
    }

    public static void printCarsToValueAndLevelOfEquipment(double maxValue, int levelOfEquipment) {
        //Kontekst biznesowy: klient wchodzi na stronę salonu samochodów używanych i chce zobaczyć auta do pewnej kwoty "maxValue"
        //oraz mające konkretny poziom wyposażenia np: poziom 2 = auto ma klimatyzacje, a poziom 1 auto klimatyzacji nie ma itp
        //ZADANIE: wyfiltruj a następnie wypisz auta od najtańszego do najdroższego z listy aut
        List<Car> listOfCarsFilter = new LinkedList<>();

        for (Car car : carList) {
            if(car.getValue() <= maxValue && Objects.equals(car.getLevelOfEquipment(), levelOfEquipment)){
                listOfCarsFilter.add(car);
            }
        }

        Collections.reverse(listOfCarsFilter);
        for (Car car : listOfCarsFilter) {
            System.out.println(car);
        }
    }

    public static void addCarsToList() {
        carList.add(volvo);
        carList.add(bmw);
        carList.add(lexus);

    }

    public static void removeCarFromList() {
        carList.remove(dacia);
        carList.remove(fiat);
        carList.remove(punto);
        carList.remove(sedan);
    }

    public static void printCarListAfterSomeModifications(List<Car> list) {
        //dodaj 2-3 nowe auta do listy
        //usuń z listy 1-2 auta
        //wyświetl listę
        for (Car car : list) {
            System.out.println(car);
        }
    }

}
