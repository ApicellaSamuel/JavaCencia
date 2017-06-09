package lections;

public class Class2 extends Class1{
    int a = 4;
    int b = 5;
    public Class2(){
        super();
        System.out.println(a + " and super.a " + super.a);
    }
    public void fatherB_and_MyA(){
        System.out.println(this.a + " and super.b " + super.b);
    }
    public void myB(){//inutile dichiararlo perchè già presente di default
        super.myB();
    }
}
