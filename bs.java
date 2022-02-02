import java.util.*;
public class bs
{
    static int binarysearch(long a[],int l,int r,long n){
        if(r>=l){
            int mid=l+(r-l)/2;
            if(a[mid]==n){
                return mid;
            }
            if(a[mid]>n){
                return binarysearch(a,l,mid-1,n);
            }
            return binarysearch(a,mid+1,r,n);
        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        long a[]=new long[n];
        long q[]=new long[k];
        for(int i=0;i<n;i++){
            a[i]=sc.nextLong();
        }
        for(int i=0;i<k;i++){
            q[i]=sc.nextLong();
        }
        int i=0;
        while(i<k){
            long m=q[i];
            int res=binarysearch(a,0,n-1,m);
            if(res==-1){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
            i++;
        }

    }
}
