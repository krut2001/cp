import java.util.*;
class MissN
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int j;
        int k=0;
        for(int i=1;i<n;i++){
            j=sc.nextInt();
            k=k^j;
        }
        int m=0;
        for(int i=1;i<=n;i++){
            m=m^i;
        }
        System.out.print(k^m);

    }
}
