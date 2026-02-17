package videokod;

public class Video63 {
    public static void main(String[] args) {
        // Anonymous class

        Dog_63 dog1 = new Dog_63();
        Dog_63 dog2 = new Dog_63(){
            @Override
            void speak(){
                System.out.println("Scooby Doo says *Ruh Roh*");
            }
        };

        dog1.speak();
        dog2.speak();

    }
}
