public class search_rotated_array {

    public int search(int[] nums, int target) {
        if(nums.length ==1){
            return bin(nums, target, 0, nums.length -1);
        }
        int pivot = pivot(nums, target, 0, nums.length -1);
        int res = bin(nums, target, 0, pivot);
        if(res ==-1){
            res = bin(nums, target, pivot+1, nums.length -1);
        }
        return res;
    }

    static int pivot(int[] arr, int target, int start, int end){
        while(start <= end){
            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1]){
                return mid;
            }
            else if(arr[mid] > arr[arr.length-1]){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
            
        }
        return 0;
    }

    static int bin(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2;
        if(target ==arr[mid]){
            return mid;
        }
        else if(target < arr[mid]){
           return  bin(arr, target,start, end-1 );
        }
        else {
           return  bin(arr, target, mid+1, end);
        }
        
    }

    public  void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        System.out.print(  search( nums , 0) );
    }
}
