package core.basics;

public class ArrayAndForEachDemo_V31 {
    public static void main(String[] args) {

        // array

        String[] fruits = {"apple", "orange", "banana", "coconut"};

        //fruits[0] = "pineapple";
        //int numOfFruits = fruits.length;
        //Arrays.sort(fruits);
        //Arrays.fill(fruits, "pineapple");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
