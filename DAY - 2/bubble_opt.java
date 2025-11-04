public class bubble_opt {
    public static void main(String[] args) {
        // int[] arr = {5, 4, 3, 2, 1};
        int[] arr = {1, 2, 3, 5, 4};
        // int swapped = 1;
        int i=0; int j=1;
        while(i<arr.length && j<arr.length)
        {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++; j++;
                }
                else{
                    j++;
                }
        }

        for(int k : arr)
            System.err.print(k);

    }
}
