public class PrintMyArray {

    public static <E> void toPrint(E[] inputArray){
        for (E element: inputArray) {
            System.out.println(element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        Character[] charArray = {'a','b','c','d'};

        toPrint(intArray);
        toPrint(doubleArray);
        toPrint(charArray);
    }
}