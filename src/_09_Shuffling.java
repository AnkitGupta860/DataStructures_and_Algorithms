import java.util.Random;
public class _09_Shuffling {

    public void shuffling(int [] a)
    {
        for(int i=0;i<a.length;i++)
        {
            Random rand = new Random();
            int r = rand.nextInt(i+1);
            int temp = a[i];
            a[i] = a[r];
            a[r] = temp;
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
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        _09_Shuffling obj = new _09_Shuffling();
        obj.shuffling(arr);
        obj.printArray(arr);
    }
}
