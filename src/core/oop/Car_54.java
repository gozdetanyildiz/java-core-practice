package core.oop;

public class Car_54 {
    String model;
    int year;
    Engine_54 engine;

    Car_54(String model, int year, String engineType){
        this.model = model;
        this.year = year;
        this.engine = new Engine_54(engineType);
    }

    void start(){
        this.engine.start();
        System.out.println(this.model + " çalışıyor");
    }
}
