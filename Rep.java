import java.util.*;
class Rep
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] c=s.toCharArray();
        int count=0;
        int max=0;
        for(int i=0;i<c.length;){
            if(i==0){
                count++;
                if(max<count){
                    max=count;
                }
                i++;
            }
            else if(c[i]==c[i-1]){
                count++;
                if(max<count){
                    max=count;
                }
                i++;
            }
            else{
                count=1;
                i++;
            }
        }
        System.out.print(max);
    }
}
