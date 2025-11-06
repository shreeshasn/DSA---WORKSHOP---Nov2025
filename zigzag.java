import java.util.*;

public class zigzag {
    public String convert(String s, int n) {
        String str=""; 
        if(n == 1)
            return s;
        else
        {
            char[][] arr = new char[n][s.length()*s.length()];  
            
            for(int i=0; i<n; i++)
            {
                for(int j=0; j<2*n; j++)
                {
                    arr[i][j] = '*';
                }
            }


            int col=0;  int row=0;
            for(int i=0; i<s.length();)
            {   int j=0;
                for(j=row; j<n && i<s.length(); j++)
                {
                    if(s.charAt(i) == '\0')
                        break;
                    arr[j][col] = s.charAt(i);
                    i=i+1;
                }
                int dummy = col;
                for(int k=j-2; k>=0 && i<s.length(); k--)
                {
                    if(s.charAt(i) == '\0')
                        break;
                    arr[k][++dummy]=s.charAt(i);
                    i=i+1;
                }
                col = dummy;
                row = 1;
            }
            
            for( int i=0; i<n; i++)
            {
                for(int j=0; j<s.length()*s.length(); j++)
                {
                    System.out.print(arr[i][j] +" ");
                }
                System.out.print(ln);
            }

            for(int i=0; i<n; i++)
            {
                for(int j=0; j<2*n; j++)
                {
                    if(arr[i][j]!='*' && str.length()<=s.length())
                        str=str+arr[i][j];
                }
            }
        }
        return str;
    }

    public  void main(String[] args) {
        String s = convert("PAYPALISHIRING", 3);
        System.out.println(s);
    }
}