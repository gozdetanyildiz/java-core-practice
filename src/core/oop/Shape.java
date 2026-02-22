package core.oop;

public abstract class Shape {

    abstract double area(); // ABSTRACT yazmak zorunda

    void display(){ // CONCRETE
        System.out.println("This is a shape");
    }
}
