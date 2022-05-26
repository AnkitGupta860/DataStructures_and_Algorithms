public class _01_Quick_Find {
    private int[] id;
    public _01_Quick_Find(int N)
    {
        id = new int[N];
        for(int i=0;i<N;i++)
        {
            id[i] = i;
        }
    }
    public boolean connected(int p,int q)
    {
        return id[p] == id[q];
    }
    public void union(int p,int q)
    {
        int pid = id[p];
        int qid = id[q];
        for(int i=0;i<id.length;i++)
        {
            if(id[i]==pid)
            {
                id[i]=qid;
            }
        }
    }

    public static void main(String[] args) {
        _01_Quick_Find obj = new _01_Quick_Find(5);
        obj.union(2,3);
    }
}
