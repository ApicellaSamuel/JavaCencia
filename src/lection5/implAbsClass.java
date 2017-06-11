package lection5;

public class implAbsClass extends absClass {
    public implAbsClass(int A){
        super(A);
    }
    public void stampa(){
        this.A = 80;
        System.out.println(this.A);
    }
}
