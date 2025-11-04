public class Insertion_sort
{
    public  void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        
        for(int i=1; i<arr.length; i++)
        {
            int key=arr[i];
            int j=i-1;
            while (j>=0  &&  arr[j]>key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }

        for(int i : arr)
        {
            System.out.print(i+" ");
        }

    }
}