import java.util.*;
class weirdalgo
{
    static long change(long n)
    {
        if(n!=1){
            if(n%2==0)
            {
            long k=n/2;
            System.out.print(k+" ");
            return change(k);
            }
            else
            {
            Long k=(n*3)+1;
            System.out.print(k+" ");
            return change(k);
            }
        }
        return n;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        System.out.print(n+" ");
        change(n);
    }
}
