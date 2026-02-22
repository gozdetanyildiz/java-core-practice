package core.basics;

public class MethodOverloadingDemo_V27 {
    public static void main(String[] args){

        // overloaded methods = aynı ismi paylaşan ama parametreleri farklı olan metodlar
           // signature = metod adı + parametreler

        String pizza = bakePizza("flat-bread", "mozzarella", "pepperoni");

        System.out.println(pizza);

    }
    static String bakePizza(String bread){
        return bread + " pizza";
    }
    static String bakePizza(String bread, String cheese){
        return cheese + " " + bread + " pizza";
    }
    static String bakePizza(String bread, String cheese, String topping){
        return topping + " " + cheese + " " + bread + " pizza";
    }
}
