public class Palindrome
{
    public static void main(String[] args)
    {
        int count=0;
        String s = "Gadag";
        String a = s.toLowerCase();
        for(int i =0; i<a.length(); i++)
        {
            if(a.charAt(i)==a.charAt(a.length()-i-1))
            {
                count=count+1;
            }
        }
        if(count==a.length())
            System.out.println("PALINDROME");
        else
            System.out.println("NOT PALINDROME");
    }
}