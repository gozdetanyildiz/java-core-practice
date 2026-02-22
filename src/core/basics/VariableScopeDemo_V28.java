package core.basics;

public class VariableScopeDemo_V28 {
    static int x = 3; //CLASS

    public static void main(String[] args){
        //variable scope (değişken kapsamı)

        int x = 1;

        System.out.println(x);

        doSomething();
    }
    static void doSomething(){

        int x = 2;

        System.out.println(x);
    }
}
