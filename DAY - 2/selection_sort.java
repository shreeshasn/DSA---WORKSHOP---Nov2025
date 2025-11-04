public class selection_sort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        for(int i=0; i<arr.length; i++)
        {   int si = i;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[si] > arr[j])
                    si=j;
            }
            int temp = arr[si];
            arr[si] = arr[i];
            arr[i] = temp;
        }
        for(int i : arr)
            System.out.print(i);
    }
}
