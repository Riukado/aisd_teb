package myPackage.exam.recursion;

public class Task1 {

    //Wypisz na konsolę, piramidę, wypisywać będziemy cyfrę 3 w formie string lub int
    //tj. w pierwszej linii jedna cyfra 3, w drugiej dwie trójki itd.
    //przykład wypisań na konsoli
    //3
    //33
    //333
    //itd
    //Aż do liczby wierszy (poziomów piramidy), podanej jako parametr do funkcji przykład: printPyramid(int lvlNumber) {...}
    //TIP podziel problem na mniejsze części, rezultatem nie musi być jedna funkcja, ale funkcjonalność, tj jak wywołam jedną funkcje to wyświetli mi się piramida,
    //Uwaga, piramida może być wypisana jako "odwrócona" na konsolę tj dla numberOfPyramidLevels=3 ->
    //333
    //33
    //3

    public static void printNumberPyramid(int numberOfPyramidLevels) {
        String s = "3";
        for(int i; numberOfPyramidLevels > 0; numberOfPyramidLevels--){ // inteliJ nie lubił wpisania numberOfPyramidLevels w miejsce zmiennej i
            System.out.println(s);
            s = s + "3";
        }

    }
}
