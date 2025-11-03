import java.util.Arrays;
// import java.util.HashMap;

public class anagrams
{
    public int anag(String s1 ,String s2)
    {
        if(s1.length()==s2.length())
        {
            char[] s = s1.toCharArray();
            Arrays.sort(s);
            String s11 = new String(s);
            
            char[] t = s2.toCharArray();
            Arrays.sort(t);
            String s22 = new String(t);

            if(s11.equals(s22))
                return 1;
            else    
                return 0;
        }
        else    
            return 0;
    }

    // public int anagr(String s1 ,String s2)
    // {
    //     if(s1.length()==s2.length())
    //     {
    //         HashMap<Character, Integer> h1 = new HashMap<>();
    //         HashMap<Character, Integer> h2 = new HashMap<>();
    //         for(int i=0; i<s1.length(); i++)
    //         {
    //             if(h1.containsKey(s1.charAt(i)))
    //                 h1.put(s1.charAt(i) , h1.get( s1.charAt(i) ) +1 );
    //             else    
    //                 h1.put(s1.charAt(i) , 1 );
    //         }   
    //         for(int i=0; i<s2.length(); i++)
    //         {
    //             if(h2.containsKey(s2.charAt(i)))
    //                 h2.put(s2.charAt(i) , h2.get( s2.charAt(i) ) +1 );
    //             else    
    //                 h2.put(s2.charAt(i) , 1 );
    //         }  

    //         if(h1 == h2)
    //         {
    //             return 1;
    //         }
    //         else
    //             return 0;
    //     }   
    //     else    
    //         return 0;
    // }

    public  void main(String[] args) {
        String s1 = "anag";
        String s2 = "gnaa";

        if(anag(s1,s2)==1 )
        {
            System.out.println("anag -> anagram");
        }
        else 
        {
            System.out.println("anagr -> not a anagram");
            
        }

        // if(anagr(s1,s2)==1 )
        // {
        //     System.out.println("anagr -> anagram");
        // }
        // else 
        // {
        //     System.out.println("anagr -> not a anagram");
            
        // }

    }
}


// import java.util.Scanner;

// public class AnagramCheck {
//     static boolean isAnagram(String str1, String str2) {
//         if (str1.length() != str2.length())
//             return false;

//         int[] count = new int[256];
//         for (int i = 0; i < str1.length(); i++) {
//             count[str1.charAt(i)]++;
//             count[str2.charAt(i)]--;
//         }

//         for (int i = 0; i < 256; i++) {
//             if (count[i] != 0)
//                 return false;
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter first word: ");
//         String word1 = sc.nextLine();

//         System.out.print("Enter second word: ");
//         String word2 = sc.nextLine();

//         if (isAnagram(word1, word2))
//             System.out.println("The words are anagrams.");
//         else
//             System.out.println("The words are not anagrams.");

//         sc.close();
//     }
// }