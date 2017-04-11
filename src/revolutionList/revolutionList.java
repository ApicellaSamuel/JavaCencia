package revolutionList;

/**
 * Created by sam on 09/04/17.
 */
public class revolutionList<E> {
    niceNode<E> root;
    revolutionList<E> next;

    public revolutionList(niceNode root){
        this.root=root;
    }

    public void push(niceNode node){
        if(this.next != null)
            this.next.push(node);
        else this.next = new revolutionList<E>(node);
    }

    public niceNode<E> estrai(){
        int nicePriority = this.root.getNice() - 1;
        niceNode<E> nextNode = this.root;
        revolutionList<E> nextList = this.next;
        do{
            if(nextNode.getNice() < nicePriority) nicePriority = nextNode.getNice();
            nextNode = this.next.root;
            nextList = this.next;
        }while(nextList != null);

        nextNode = this.root;
        nextList = this.next;
        do{
            if(nextNode.getNice() == nicePriority){
                niceNode retNode = this.root;
                this.root = this.next.root;
                this.next = this.next.next;
                return retNode;
            }
            nextNode = this.next.root;
            nextList = this.next;
        }while(nextList != null);//non considero l'ultimo nodo
        return null;//non capita, spero
    }
}
