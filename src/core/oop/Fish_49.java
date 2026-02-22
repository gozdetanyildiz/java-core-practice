package core.oop;

public class Fish_49 implements Prey_49, Predator_49{

    @Override
    public void flee(){
        System.out.println("*Balık uzaklaşarak yüzüyor*");
    }

    @Override
    public void hunt(){
        System.out.println("*Balık avlanıyor*");
    }
}
