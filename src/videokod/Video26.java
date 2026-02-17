package videokod;

public class Video26 {
    public static void main(String[] args) {
        // method

        happyBirthday("Spongebob", 30);
    }

    static void happyBirthday(String name, int age){
        System.out.println("Doğum günün kutlu olsun!");
        System.out.printf("Doğum günün kutlu olsun sevgili %s!\n", name);
        System.out.printf("%d yaşına girdin!\n", age);
        System.out.println("Doğum günün kutlu olsun!\n");
    }

    static double square(double number){
        return number * number;
    }

    static double cube(double number){
        return number * number * number;
    }

    static String getFullName(String first, String last){
        return first + " " + last;
    }
}
