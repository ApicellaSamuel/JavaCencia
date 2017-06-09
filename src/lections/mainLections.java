package lections;

public class mainLections {
    public static void main(String[] args){
        Class1 c1 = new Class1();
        Class1 c12 = new Class2(); //interessante
        Class2 c2 = new Class2();
        //Class2 c21 = new Class1();// non si può perchè Class1 non estende Class2 quindi non ha i metodi di Class2 implementati?

        c1.myB();
        c12.myB();
        System.out.println(c12.b);
        //c12.fatherB_and_MyA(); //non si può!!
        c2.fatherB_and_MyA();
        c2.myB();                                            //attenzione
        System.out.println("a: " + c2.a + " b: " + c2.b);   //a qui

    }
}
