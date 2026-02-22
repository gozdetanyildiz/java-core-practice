package core.basics;

public class VarargsAverageDemo_V34 {
    public static void main(String[] args) {
        //varargs (variable arguments)
        System.out.println(average(1, 2, 3, 4));

    }
    static double average(double... numbers){

        double sum = 0;

        if(numbers.length == 0){
            return 0;
        }

        for(double number : numbers){
            sum += number;
        }

        return sum / numbers.length;

    }
}
