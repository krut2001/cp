import java.util.*;
class srsq
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long q=sc.nextLong();
        long a[]=new long[n+10];
        long dp[]=new long[n+100];
        dp[0]=0;
        for(long i=1;i<=n;i++){
            a[i]=sc.nextLong();
            if(i==1){
                dp[i]=a[i];
            }
            else dp[i]=a[i]+dp[i-1];

        }
        while(q!=0){
            long l=sc.nextLong();
            long r=sc.nextLong();
            System.out.println(dp[r]-dp[l-1]);
            q--;
        }
    }
}
