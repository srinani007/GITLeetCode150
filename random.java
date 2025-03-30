import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

class UniqueRandomizedSet {
   
    private HashMap<Integer, Integer> map; // value -> index
    private ArrayList<Integer> list; // stores the actual values
    private Random rand; // for generating random numbers

    /** Initialize your data structure here. */
    public UniqueRandomizedSet() {
        map = new HashMap<>();
        list =  new ArrayList<>();
        rand  = new Random();
    }

    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val){
        if(map.containsKey(val)) return false; // already exists
        list.add(val); // add to the end of the list
        map.put(val, list.size()- 1); // store the index
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val){
        if(!map.containsKey(val)) return false; // doesn't exist

        int index = map.get(val); //get the index of the value
        int lastElement = list.get(list.size() - 1); // get the last element

        list.set(index, lastElement); // replace the element at index with the last element
        map.put(lastElement, index); // update the index of the last element
        list.remove(list.size() - 1); // remove the last element
        map.remove(val); // remove the value from the map

        return true;
    }

    /** Get a random element from the set. */
    public int getRandom(){
        return list.get(rand.nextInt(list.size()));
    }

    public static void main(String[] args) {
        UniqueRandomizedSet obj = new UniqueRandomizedSet();
        System.out.println(obj.insert(1)); // true
        System.out.println(obj.remove(2)); // false
        System.out.println(obj.insert(2)); // true
        System.out.println(obj.getRandom()); // 1 or 2
        System.out.println(obj.remove(1)); // true
        System.out.println(obj.insert(2)); // false
        System.out.println(obj.getRandom()); // 2
    }
   
}
