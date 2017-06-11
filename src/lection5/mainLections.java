package lection5;

public class mainLections {
    public static void main(String[] args){
        /*
        Class1 c1 = new Class1();
        c1.myB();

        Class1 c12 = new Class2(); //interessante: c12 possiede tutti i metodi di Class2 tranne quelli non presenti in Class1
        c12.myB();
        System.out.println(c12.b);

        Class2 c2 = new Class2();
        c2.fatherB_and_MyA();
        c2.myB();                                            //attenzione : la pseudovariabile this è statica con gli attributi
        System.out.println("a: " + c2.a + " b: " + c2.b);   //anche qui

        //Class2 c21 = new Class1();// non si può perchè Class1 non estende Class2 quindi non ha i metodi di Class2 implementati
        //c12.fatherB_and_MyA();   //non si può!!
        */
        implAbsClass absClass = new implAbsClass(8);
        absClass.stampaA();
        absClass.stampa();
    }
}
