package homework3;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sam on 16/04/17.
 * Main per test
 */
public class mainNet {
    public static void main(String[] args){
        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node3 = new Node<>(3);
        Node<Integer> node4 = new Node<>(4);
        Node<Integer> node5 = new Node<>(5);
        Node<Integer> node6 = new Node<>(6);
        Node<Integer> node7 = new Node<>(7);
        Node<Integer> node8 = new Node<>(8);
        Node<Integer> node9 = new Node<>(9);
        Node<Integer> node10 = new Node<>(10);
        Node<Integer> node11 = new Node<>(11);
        Node<Integer> node12 = new Node<>(12);
        MyNetwork<Node> network = new MyNetwork<>();
        List<Node> path = new ArrayList<>();
        network.addNode(node1);
        network.addNode(node2);
        network.addNode(node3);
        network.addNode(node4);
        network.addNode(node5);
        network.addNode(node6);
        network.addNode(node7);
        network.addNode(node8);
        network.addNode(node9);
        network.addNode(node10);
        network.addNode(node11);
        network.addNode(node12);
        try {
            network.addEdge(node1, node2);
            network.addEdge(node2, node3);
            network.addEdge(node3, node4);
            network.addEdge(node4, node9);
            network.addEdge(node9, node10);
            network.addEdge(node10, node11);
            network.addEdge(node11, node12);
            network.addEdge(node12, node1);
            network.addEdge(node2, node5);
            network.addEdge(node5, node6);
            network.addEdge(node6, node7);
            network.addEdge(node7, node8);
            network.addEdge(node8, node5);
            network.addEdge(node2, node11);
            network.addEdge(node11, node8);
            network.setSource(node1);
            network.setTarget(node8);
        }catch (NoSuchNodeException e){ System.out.println("mmm"); }

        try{
            path = network.shortestPath();
        }catch (NoSuchPathException e){ System.out.println("mmmPath"); }
        for(Object node : path) System.out.print(((Node)node).getHead() + "; ");
    }
}
