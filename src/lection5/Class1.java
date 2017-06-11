package lection5;

public class Class1 {
    int a = 1;
    int b = 2;
    public Class1(){
        System.out.println("Sono Class1!");
        this.a = 3;
    }
    public void myB(){
        System.out.println("Sono Class1 e il mio b è: " + this.b);
    }
}
