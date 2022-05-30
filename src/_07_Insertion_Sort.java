public class _07_Insertion_Sort {
    public void sort(int [] a)
    {
        int N = a.length;
        for(int i=0;i<N;i++)
        {
            for(int j=i;j>0;j--)
            {
                if(a[j]<a[j-1])
                {
                    int temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                }
                else
                {
                    break;
                }
            }
        }
    }
    public void printArray(int [] a)
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] arr = new int[]{3,6,1,2,9,0};
        _07_Insertion_Sort obj = new _07_Insertion_Sort();
        obj.sort(arr);
        obj.printArray(arr);
    }
}
