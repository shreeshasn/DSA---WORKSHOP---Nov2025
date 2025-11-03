import java.lang.String;

public class split_reverse {

    public static void main(String[] args) {
        String s = "Hello World! I am God, God is Great.";
        String[] dp = s.split(" ");
        String s1 = "";
        for(int i=dp.length-1; i>=0; i--)
        {
            s1=s1+dp[i]+" ";
        }
        System.out.println(s1);
    }
}
