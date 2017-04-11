package revolutionList;

import java.util.*;

/**
 * Created by sam on 10/04/17.
 */
public class mainList {

    public static void main(String[] args){
        ArrayList<niceNode> list = new ArrayList<>();
        niceNode<Integer> node1 = new niceNode<Integer>(1, 1);
        niceNode<Integer> node2 = new niceNode<Integer>(2, 2);
        niceNode<Integer> node3 = new niceNode<Integer>(3, 3);
        niceNode<Integer> node41 = new niceNode<Integer>(4, 1);
        niceNode<Integer> node51 = new niceNode<Integer>(5, 1);
        niceNode<Integer> node61 = new niceNode<Integer>(6, 1);
        list.add(node2);
        list.add(node3);
        list.add(node1);
        list.add(node41);
        list.add(node51);
        list.add(node61);

        list.forEach(node -> System.out.print(node.getHead() + " : " + node.getNice() + "; "));

        Iterator<niceNode> iterList = list.listIterator();

        niceNode currNode = iterList.next();
        niceNode niceNode = currNode;
        while(iterList.hasNext()){
            currNode = iterList.next();
            if(currNode.getNice() < niceNode.getNice()) niceNode = currNode;
        }
        list.remove(niceNode);
        System.out.println();
        list.forEach(node -> System.out.print(node.getHead() + " : " + node.getNice() + "; "));
        System.out.println();
        System.out.println(niceNode.getHead());

        iterList = list.listIterator();
        currNode = iterList.next();
        niceNode = currNode;
        while(iterList.hasNext()){
            currNode = iterList.next();
            if(currNode.getNice() < niceNode.getNice()) niceNode = currNode;
        }
        list.remove(niceNode);
        list.forEach(node -> System.out.print(node.getHead() + " : " + node.getNice() + "; "));
        System.out.println();


        System.out.println(niceNode.getHead());
    }
}
