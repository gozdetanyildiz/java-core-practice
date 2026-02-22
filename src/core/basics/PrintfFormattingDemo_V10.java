package core.basics;

public class PrintfFormattingDemo_V10 {
    public static void main(String[] args) {

            //%s, %d, %f, %c, %b bunlar format belirteci

            String name = "Spongebob";
            char firstLetter = 'S';
            int age = 30;
            double height = 60.5;
            boolean isEmployed = true;

            System.out.printf("Hello %s\n", name);
            System.out.printf("Your name starts with a %c\n", firstLetter);
            System.out.printf("You are %d years old\n", age);
            System.out.printf("You are %f inches tall\n", height);
            System.out.printf("Employed: %b\n", isEmployed);

            System.out.printf("%s is %d years old", name, age);



            double price1 = 9.99;
            double price2 = 100.15;
            double price3 = -54.01;

            System.out.printf("%.3f\n", price1);
            System.out.printf("%.3f\n", price2);
            System.out.printf("%.3f\n", price3);

            System.out.printf("%f\n", price1);
            System.out.printf("%f\n", price2);
            System.out.printf("%f\n", price3);


            int id1 = 1;
            int id2 = 23;
            int id3 = 456;
            int id4 = 7890;

            System.out.printf("id: %04d\n", id1);
            System.out.printf("id: %04d\n", id2);
            System.out.printf("id: %04d\n", id3);
            System.out.printf("id: %04d\n", id4);
        }
}
