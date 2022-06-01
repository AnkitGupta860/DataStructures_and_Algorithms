public class _10_Merge_Sort {
    private void merge(int [] a, int [] aux,int lo,int mid,int hi)
    {

        for(int k=lo;k<=hi;k++)
        {
            aux[k] = a[k];
        }

        int i = lo, j = mid+1;
        for(int k = lo; k<=hi; k++)
        {
            if(i>mid)
                a[k] = aux[j++];
            else if(j>hi)
                a[k] = aux[i++];
            else if(aux[j]<aux[i])
                a[k] = aux[j++];
            else
                a[k] = aux[i++];
        }
    }

    private void sort(int [] a,int [] aux,int lo, int hi)
    {
        if(hi<=lo)
        {
            return;
        }
        int mid = lo+(hi-lo)/2;
        sort(a,aux,lo,mid);
        sort(a,aux,mid+1,hi);
        merge(a,aux,lo,mid,hi);
    }

    public void sort(int [] a)
    {
        int [] aux = new int[a.length];
        sort(a,aux,0,a.length-1);
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
        _10_Merge_Sort obj = new _10_Merge_Sort();
        int [] arr = new int[]{1,5,2,6,3,7};
        obj.sort(arr);
        obj.printArray(arr);
    }
}
