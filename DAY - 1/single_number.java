import java.util.HashMap;

public class single_number
{
    public int singleNumber(int[] nums) {
        HashMap<Integer , Integer> d = new HashMap<>();
        Integer n=0;
        for(Integer i : nums)
        {
            if(d.containsKey(i))
            {
                d.put(i , d.get(i)+1);
            }
            else
            {
                d.put(i , 1);
            }
        }
        for(Integer i : nums)
        {
            if(d.get(i)==1)
            {
                n=i;
            }
            else
            {
                continue;
            }
        }
        return n;
    }

    public  void main(String[] args) {
        int[] nums = {4,2,2,2,5,5,6,5,5};
        System.out.println(singleNumber(nums));

        int sum=0;
        for(int i : nums)
        {
            sum = sum^i;
        }
        System.out.println(sum); 
    }

}