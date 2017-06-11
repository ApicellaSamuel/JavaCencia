package lection5;

public class Class2 extends Class1{
    int a = 4;
    int b = 5;
    public Class2(){
        super();
        System.out.println("Sono Class2 e il mio a è: " + a + " e super.a " + super.a + " e this.b è: " + this.b);
    }
    public void fatherB_and_MyA(){
        System.out.println("Sono Class 2 e il mio this.a è: " + this.a + " e super.b è: " + super.b);
    }
    /*public void myB(){//inutile dichiararlo perchè già presente di default
        super.myB();
    }*/
}
