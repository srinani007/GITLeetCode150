
import java.util.Arrays;

public class candy {
   public int candyRating(int[] ratings){
    int n = ratings.length;
    if(n == 0) return 0; // if the length of the ratings array is 0, return 0
    int[] candies = new int[n]; // create a new array of integers with the length of the rating array

    Arrays.fill(candies, 1); // fill the candies array with 1

    // left to right passs
    for(int i = 1; i < n; i++){
        if(ratings[i] > ratings[i - 1]){
            candies[i] = candies[i - 1] + 1; // add 1 to the previous value
        }
    }
    //right to left pass
    for(int i = n - 2; i >= 0; i--){
        if(ratings[i] > ratings[i + 1]){
            candies[i] = Math.max(candies[i], candies[i + 1] + 1); // get the maximum value of the two 
        }
    }
    // sum up all the candies
    int totalCandies = 0;
    for(int candy : candies){
        totalCandies = totalCandies + candy;// add the candies to the totalCandies
    }
    return totalCandies;
   }
    public static void main(String[] args) {
         candy obj = new candy();
         int[] ratings = {1,2,87,87,87,2,1};
         System.out.println(obj.candyRating(ratings)); // 5
    }
}
