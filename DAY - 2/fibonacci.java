public class fibonacci {

    public int fibo(int n){
        if(n==0)
            return 0;
        else if(n==1 || n==2)
            return 1;
        else
            return fibo(n-1)+fibo(n-2);

    }
    public  void main(String[] args) {
        int n=8;
        for(int i=0; i<n; i++)
        {
            System.out.println(fibo(i));
        }
        // System.out.println(fibo(n));
    }
}
