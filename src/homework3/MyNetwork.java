package homework3;


import java.util.*;

/**
 * Created by sam on 15/04/17.
 * Rete di oggetti?
 */
public class MyNetwork<T> implements Network<T> {

    private T source;
    private T target;
    private HashMap<T,ArrayList<T>> E = new HashMap<>();

    public T source() {
        return this.source;
    }

    public T target() {
        return this.target;
    }

    public void setSource (T newsource) throws NoSuchNodeException {
        if(!E.containsKey(newsource)) throw new NoSuchNodeException();
        this.source = newsource;
    }

    public void setTarget(T newtarget) throws NoSuchNodeException {
        if(!E.containsKey(newtarget)) throw new NoSuchNodeException();
        this.target = newtarget;
    }

    public void addNode(T v) {
        E.put(v, new ArrayList<>());
    }

    public void addEdge(T p, T a) throws NoSuchNodeException {
        if(!E.containsKey(p) || !E.containsKey(a)) throw new NoSuchNodeException();
        E.get(p).add(a);
    }

    public List<T> shortestPath() throws NoSuchPathException {
        List<T> Q = new ArrayList<>();
        List<T> retList = new ArrayList<>();
        Q.add(source);
        HashMap<T, T> fathersVector = new HashMap<>();//(figlio,padre)
        T u;
        ArrayList<T> adjacent;
        while(!Q.isEmpty()){
            u = Q.get(0);
            Q.remove(u);
            adjacent = E.get(u);
            for(T v : adjacent){
                 if(!fathersVector.containsKey(v)){//!figlio di qualcuno
                     Q.add(v);
                     fathersVector.put(v, u);
                 }
            }
            if(fathersVector.containsKey(this.target)) Q.clear();
        }



        Stack<T> momentStack = new Stack<>();
        T son = this.target;
        if(!fathersVector.containsKey(this.target)) throw new NoSuchPathException();
        while(!son.equals(this.source)){
            momentStack.push(son);
            son=fathersVector.get(son);
        }
        retList.add(this.source);
        while(!momentStack.empty()){
            retList.add(momentStack.pop());
        }
        return retList;
    }


}
