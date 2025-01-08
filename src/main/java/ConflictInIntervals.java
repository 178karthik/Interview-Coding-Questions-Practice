import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConflictInIntervals {
    public static void main(String[] args) {

        int [][] arr = {{1, 3},
                {2, 4},
                {5, 6},
                {7, 8},
                {4, 7}};

        List<String> conflictsFound = new ArrayList<>();

        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));

        for(int i=0;i< arr.length-1;i++)
        {
            if(arr[i][1]>arr[i+1][0])
            {
                conflictsFound.add("Conflicts found "+Arrays.toString(arr[i])+" and "+Arrays.toString(arr[i+1]));
            }
        }

        System.out.println(conflictsFound.toString());

    }
}
