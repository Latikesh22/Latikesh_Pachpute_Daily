import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Solution {  

    public static int[] twoSum(int[] nums, int target){
    int[] result = new int[2];
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {
        if (map.containsKey(target - nums[i])) {
            result[1] = i;
            result[0] = map.get(target - nums[i]);
            return result;
        }
        map.put(nums[i], i);
    }
    return result;
   
    }
    public static void main(String[] args) {
        Scanner lp = new Scanner(System.in);
        int n = lp.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i]=lp.nextInt();
        }
        int target=lp.nextInt();
        lp.close();
        int[] indices = twoSum(nums, target);
        
        if (indices.length == 2) {
            System.out.println(indices[0] + " " + indices[1]);
        } else {
            System.out.println("No solution found!");
        }


    }
    

}