import java.util.*;
public class IncAr
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long a[]=new long[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
        }
        long count=0;
        for(int i=1;i<n;i++){
            if(a[i]<a[i-1]){
                count=count+Math.abs(a[i-1]-a[i]);
                a[i]=a[i-1];
            }
        }
        System.out.println(count);
    }
}
