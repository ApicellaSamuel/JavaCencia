package homework3;


import java.util.*;

/**
 * Created by sam on 15/04/17.
 * Rete di oggetti?
 */
public class MyNetwork<T> implements Network<T> {

    private T source;
    private T target;
    private HashMap<T,ArrayList<T>> adjacentList = new HashMap<>();//una mappa che ad ogni T associa una lista di T (gli adiacenti)

    public T source() {
        return this.source;
    }

    public T target() {
        return this.target;
    }

    public void setSource (T newsource) throws NoSuchNodeException {
        if(!adjacentList.containsKey(newsource)) throw new NoSuchNodeException();//se non è presente alcun T in adjacentList
        this.source = newsource;
    }

    public void setTarget(T newtarget) throws NoSuchNodeException {
        if(!adjacentList.containsKey(newtarget)) throw new NoSuchNodeException();//se non è presente alcun T in adjacentList
        this.target = newtarget;
    }

    public void addNode(T v) {
        adjacentList.put(v, new ArrayList<>());//aggiungo il T e gli associo una lista di T inizialmente vuota
    }

    public void addEdge(T p, T a) throws NoSuchNodeException {
        if(!adjacentList.containsKey(p) || !adjacentList.containsKey(a)) throw new NoSuchNodeException();//se i T non sono presenti nella adjacentList allora lancio l'eccezione
        adjacentList.get(p).add(a);//alla lista associata a T gli aggiungo il nuovo T
    }

    public List<T> shortestPath() throws NoSuchPathException {
        List<T> Q = new ArrayList<>();//per tenere memoria dei T in ordine e per poterli visitare in ordine(BFS)
        List<T> retList = new ArrayList<>();//la lista che conterrà la soluzione
        Q.add(source);//comincio partendo dalla sorgente
        HashMap<T, T> fathersVector = new HashMap<>();//vettore(figlio,padre) per poter ricostruire il percorso (source,target)
        T u;
        ArrayList<T> adjacent;//lista degli adiacenti di u;
        while(!Q.isEmpty()){//finchè ci sono nodi da visitare
            u = Q.get(0);//prendo il primo T della lista
            Q.remove(u);//e lo rimuovo
            adjacent = adjacentList.get(u);//ne prendo gli adiacenti
            for(T v : adjacent){
                 if(!fathersVector.containsKey(v)){//se non è figlio di qualche T allora ancora non è stato visitato
                     Q.add(v);//lo aggiungo ai T da visitare
                     fathersVector.put(v, u);//e gli assegno come padre u
                 }
            }
            if(fathersVector.containsKey(this.target)) Q.clear();//se ho raggiunto target svuoto la lista dei T da visitare
        }

        if(!fathersVector.containsKey(this.target)) throw new NoSuchPathException();//se target non è mai stato raggiunto
                                                                                    //partendo da source allora non esiste un cammino

        Stack<T> momentStack = new Stack<>();
        T son = this.target;
        while(!son.equals(this.source)){//ricostruisco il cammino da source a target
            momentStack.push(son);      //utilizzando uno stack e il vettore dei padri
            son=fathersVector.get(son);//parto da target e mi muovo da padre in padre
        }


        retList.add(this.source);
        while(!momentStack.empty()){//li metto nella lista in ordine source,...,target
            retList.add(momentStack.pop());//e ritorno la lista
        }

        return retList;
    }


}
