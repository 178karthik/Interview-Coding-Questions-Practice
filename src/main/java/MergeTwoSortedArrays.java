public class MergeTwoSortedArrays {
    public static void main(String[] args) {

    int a[]={1,3,5,7};
    int b[]={2,4,6,8};

    int c[]=new int[a.length+b.length];
    System.out.println(c.length);
    int i=0;
    int j=0;
    int k=0;
    while(i< a.length && j<b.length)
    {
        if(a[i]<=b[j])
        {
            c[k++]= a[i++];
        }
        else
        {
            c[k++]=b[j++];
        }
    }
    while(i< a.length)
    {
        c[k++]=a[i++];
    }
        while(j< b.length)
        {
            c[k++]=b[j++];
        }

    for(int m=0;m<c.length;m++)
    {
        System.out.println(c[m]);
    }
    }
}