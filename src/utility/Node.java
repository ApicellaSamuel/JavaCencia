package utility;

/**
 * Created by sam on 09/04/17.
 */
public class Node<E> {
    private E head;

    public Node(E head){
        this.head = head;
    }

    public E getHead(){
        return this.head;
    }

    public void setHead(E head) {
        this.head = head;
    }

}
