import java.util.*;

public class binary {
    public int bs(int[] arr , int l , int r, int key)
        {
            if(l>r)
                return -1;
            int mid = (l+r)/2;
            if( arr[mid] == key )
                return mid+1;
            else if( arr[mid] > key )
                return bs( arr , l , mid-1 , key);
            else
                return bs( arr , mid+1 , r , key);
    }
    public void main(String[] args) {
        int[] arr= {6,1,8,3,5,9};
        Arrays.sort(arr);
        int l=0;
        int r=arr.length-1;
        int key=6;
        System.out.println(bs(arr, l, r, key));
    }
}
