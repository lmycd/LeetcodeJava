import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * Created by liunian on 2017/4/10.
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
       // int[] result = new int[2];
      // Hashtable has = new Hashtable();
        Map<Integer, Integer> hass = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(hass.containsKey(nums[i]) ) {
                return new int[]{hass.get(nums[i]), i};
            }
                //return new int[i, has.get(target-nums[i])];

            hass.put(target-nums[i], i);


        }
        return new int[2];
    }
}
