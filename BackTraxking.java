
import java.util.ArrayList;
import java.util.List;

public class BackTraxking {
    public List<List<Integer>> subsets(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        backTrack(result, new ArrayList<>(), nums, 0);
        return result;
    }
    private void backTrack(List<List<Integer>> resultSets, List<Integer> tempSet,
                                    int[] nums, int start){
            resultSets.add(new ArrayList<>(tempSet)); // add the current subset to the result
            for(int i = start; i < nums.length; i++){
                // add the current element to the subset
                // Case of including the current element
                tempSet.add(nums[i]);

                // bacltrack the new subset
                backTrack(resultSets, tempSet, nums, i+1);

                // remove the current element from the subset or case of excluding the current element
                tempSet.remove(tempSet.size() - 1);
        }

    }
    public static void main(String[] args) {
        BackTraxking obj = new BackTraxking();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = obj.subsets(nums);
        for(List<Integer> subset : result){
            System.out.println(subset);
        }
    }
}
