package Assignment2;

public class Main {
    public static void main(String[] args) {
        ArrayHandler arrayHandler = new ArrayHandler(10);
        arrayHandler.initializeArray();
        arrayHandler.printArray();
        arrayHandler.descendingSorting();
        arrayHandler.printArray();
        System.out.println();
        ArrayHandler arrayHandler1 = new ArrayHandler(new int[15]);
        arrayHandler1.initializeArray();
        arrayHandler1.printArray();
        arrayHandler1.ascendingSorting();
        arrayHandler1.printArray();
        System.out.println();
        ArrayHandler ar = new ArrayHandler();
        ar.setArrayLength(12);
        ar.initializeArray();
        ar.printArray();
        ArrayHandler a = new ArrayHandler();
        a.setArray(new int[8]);
        a.initializeArray();
        a.printArray();
    }




}
