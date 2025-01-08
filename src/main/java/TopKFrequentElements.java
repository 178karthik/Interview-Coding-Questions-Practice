import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> hash = new HashMap<>();


        int n = nums.length;
        Integer count = 1;
        int result[] = new int[k];

        for (int i = 0; i < n; i++) {
            if (!(hash.containsKey(nums[i]))) {
                hash.put(nums[i], count);
            } else {
                hash.put(nums[i], hash.get(nums[i]) + 1);
            }
        }

        List<Map.Entry<Integer, Integer>> map = new ArrayList<>(hash.entrySet());

        map.sort((a, b) -> Integer.compare(b.getValue(),a.getValue()));


        for (int j = 0; j < k; j++) {
            result[j] = map.get(j).getKey();
        }

        return result;



    }

    public static void main(String[] args)
    {
        int nums[]= new int[]{1, 2, 2, 3, 3, 3};
        int k=2;
        int result[] = topKFrequent(nums,k);
        for(int i=0;i< result.length;i++)
        {
            System.out.println(result[i]);
        }

    }
}

