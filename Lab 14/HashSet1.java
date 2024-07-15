import java.util.HashSet;
import java.util.Iterator;

public class HashSet1{
    
    public static void main(String[] args) {
        //create set
        HashSet<Integer> set = new HashSet<>();

        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //size
        System.out.println("Size of set:"+set.size());
        System.out.println(set);

        //search
        if(set.contains(1)){
            System.out.println("Set contains value");
        }
        else{
            System.out.println("Set not contains value");
        }

        //delete
        set.remove(1);
        System.out.println(set);

        //iterator
        Iterator<Integer> i =set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

    }
}