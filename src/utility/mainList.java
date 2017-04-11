package utility;

import java.util.ArrayList;

/**
 * Created by sam on 10/04/17.
 */
public class mainList {

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(2));
        System.out.println(list.get(list.size()-1));
    }
}
