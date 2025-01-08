import java.util.ArrayList;
import java.util.List;

public class TwoSum {


    public static void main(String[] args)
    {
        int[] nums ={5,5};

        List<Integer> indexes= new ArrayList();

        int target =10;
        int n= nums.length;
        for(int i=0; i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int sum = nums[i]+nums[j];

                if(sum==target)
                {
                    indexes.add(i);
                    indexes.add(j);
                    break;
                }
            }
            if (!indexes.isEmpty()) {
                break;
            }
        }

        System.out.println(indexes.toString());
    }
}
