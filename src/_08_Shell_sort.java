public class _08_Shell_sort {
    public void sort(int [] a)
    {
        int n = a.length;
        for(int gap = n/2;gap>=1;gap=gap/2)
        {
            for(int j = gap;j<n;j++)
            {
                for(int i = j-gap;i>=0;i=i-gap)
                {
                    if(a[i+gap]>a[i])
                    {
                        break;
                    }
                    else
                    {
                        int temp = a[i+gap];
                        a[i+gap] = a[i];
                        a[i] = temp;
                    }
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
        int[] arr = new int[]{3, 6, 1, 2, 9, 0};
        _08_Shell_sort obj = new _08_Shell_sort();
        obj.sort(arr);
        obj.printArray(arr);
    }
}
