package revolutionList;

/**
 * Created by sam on 26/02/17.
 */
public class niceNode<E> {
    private E head;
    private int nice;

    public niceNode(E head, int nice){
        this.head = head;
        this.nice = nice;
    }

    public int getNice(){
        return this.nice;
    }

    public void setNice(int nice){
        this.nice = nice;
    }

    public void revolutionNice(){
        this.nice = -1 * this.nice;
    }

    public E getHead(){
        return this.head;
    }

    public void setHead(E head) {
        this.head = head;
    }

}
