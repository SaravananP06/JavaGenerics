public class PrintMyArray {

    public static void toPrint(Integer[] inputArray){
        for (int element: inputArray) {
            System.out.println(element);
        }
    }

    public static void toPrint(Double[] inputArray){
        for (double element: inputArray) {
            System.out.println(element);
        }
    }

    public static void toPrint(Character[] inputArray){
        for (char element: inputArray) {
            System.out.println(element);
        }
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