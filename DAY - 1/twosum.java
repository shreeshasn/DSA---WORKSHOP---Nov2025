// public class twosum {
//     public static void main(String[] args) {
//         int[] nums = {3,2,4,6}; 
//         int target=5;   int flag=0;
//         for(int i=0; i<nums.length; i++)
//         {
//             for(int j=i+1; j<nums.length; j++)
//             {
//                 if( nums[i]+nums[j] == target )
//                 {
//                     System.out.println(i+1);
//                     System.out.println(j+1);
//                     flag=1;
//                     break;
//                 }
//             }
//             if(flag==1)
//                 break;
//             else    
//                 continue;
//         }
//     }
// }

import java.util.HashMap;

public class twosum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> dp = new HashMap<>();
        int res[]={0,0};
        for(int i=0; i<nums.length; i++)
        {
            if(dp.containsKey(target - nums[i]))
            {
                res[0]=i+1;
                res[1]=dp.get(target - nums[i])+1;
            }
            else
            {
                dp.put(nums[i] , i);
            }
        }
        return res;
    }

    public  void main(String[] args) {
        int[] nums = {3,2,4,6}; 
        int target=9;   

        int res[] = twoSum(nums , target);
        System.out.println(res[0]+"\n"+res[1]);
    }

}