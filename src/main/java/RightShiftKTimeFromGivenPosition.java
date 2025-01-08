import java.util.Arrays;

public class RightShiftKTimeFromGivenPosition {

    public static void main(String[] args) {
        int a[]={1,3,5,8,9,10};

        int n=2;
        int k=4;

        int beforeN[]= Arrays.copyOfRange(a,0,n);
        int rotate[]= Arrays.copyOfRange(a,n,a.length);

        reverse(rotate,0, rotate.length-1);
        reverse(rotate,0, k-1);
        reverse(rotate,k , rotate.length-1);

        int result[]= new int[a.length];

        System.arraycopy(beforeN,0,result,0,beforeN.length);
        System.arraycopy(rotate,0,result,beforeN.length,rotate.length);

        System.out.println(Arrays.toString(result));

    }

    public static void reverse(int arr[],int left,int right)
    {
        while(left<right)
        {
            int temp= arr[left];
            arr[left] = arr[right];
            arr[right]= temp;
            left++;
            right--;
        }
    }


}
