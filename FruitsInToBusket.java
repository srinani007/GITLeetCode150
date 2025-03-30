

public class FruitsInToBusket {
    public int totalFruit(int[] fruits){
        /* int max = 0; // biggest chunk of fruits
        int start = 0; // start of the chunk
        Map<Integer, Integer> map = new HashMap<>(); // map to store the fruits and their count
        int k = 2; // number of different fruits allowed
        for(int end = 0; end < fruits.length; end++){
            // if the fruits is already in the map, increment the count
            map.put(fruits[end], map.getOrDefault(fruits[end], 0) + 1);

            // if the map size is greater than k, remove the fruits from the start
            while(map.size() > k){
                map.put(fruits[start], map.get(fruits[start]) - 1);
                // if the count of the fruit is 0, remove the fruit from the mao
                // if too many types of fruits, remove the fruit from the map
                if(map.get(fruits[start]) == 0){
                    map.remove(fruits[start]); // remove the fruit from the map if the count is 0
                }
                start++; // increment the start
            }
            int count = end - start + 1; // count of the fruits
            max = Math.max(max, count); // get the max coutn of the fruits
        }
        return max; // retur the max count of the fruits */

        int type1 = fruits[0], type2 = -1;
        int left = 0, right = 1, pre = 0, ans = 0;
        int n = fruits.length;
        // start with the first fruit type, second type is "none" (-1)
        // total number of trees in the graden
        // left and right hands, "pre" tracks the last type of fruit
        // Biggest pile we can pick // ans

        while(right < n){ // move right hand through the garden
            int type = fruits[right]; // look at the fruit at the right hand
            if(type != type1) { // if it's not the same as type1
                if(type != type2 && type2 != -1) { // if it's not type2 and we already have 2 types
                    ans = Math.max(ans, right - left); // save the size of the current pile
                    left = pre; // move left hand to the last type1
                }
                type2 = type1; // shift type1 to type2 (old fruit becomes secoundry)
                type1 = type; // put the new fruit in the type1(main fruit)
                pre = right; // save the position of the last type2, mark this spot as the last switch
            }
            right++; // move right hand forward
        }
        return Math.max(ans, right - left); // return the biggest pile
    }
    public static void main(String[] args) {
        FruitsInToBusket obj = new FruitsInToBusket();
        int[] fruits = {1,2,1,3,4,3,5,1,2};
        System.out.println(obj.totalFruit(fruits));
    }
}
