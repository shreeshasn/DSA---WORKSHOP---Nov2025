public class factorial{
    public int fact(int n)
    {   
        if(n==0 || n==1)
            return 1;
        else    
            return n*fact(n-1);
    }

    public  void main(String[] args) {
        int n = 6;

        System.out.print(fact(n));

    }
}