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
        printNumberPyramidRecursionUpsideDown(numberOfPyramidLevels);
    }

    private static void printNumberPyramidRecursionUpsideDown(int numberOfPyramidLevels){
        if (numberOfPyramidLevels <= 1) {
            System.out.println("3");
        }
        else {
            for (int i = 0; i < numberOfPyramidLevels; i++) {
                System.out.print("3");
            }
            System.out.println();
            printNumberPyramidRecursionUpsideDown(numberOfPyramidLevels - 1);
        }
    }
}
