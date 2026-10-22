import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public int[] two(int [] nums, int tagert){
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int cur=nums[i];
            int x=tagert-cur;
            if(map.containsKey(x)){
                return new int[]{map.get(x),i};
            
        }
        map.put(cur,i);
    }
    return null;
    }
}
