/*import java.util.*;
class DisNum
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<Integer> set=new HashSet<Integer>();
        for(int i=0;i<n;i++){
            int k=sc.nextInt();
            set.add(k);
        }
        System.out.println(set.size());
    }
}
*/
import java.util.*;

class DisNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        int power = 0;
        int a = 0,b = 0,flag = 0;
        for(int i = 0,j = 0;j<n;j++){
            if(arr[i][j] == Arrays.stream(arr[i]).min().getAsInt()){
                power = arr[i][j];
                a = i;
                b = j;
                flag++;
                break;
            }
        }
        while(flag!=n){
            if(b == 0){
                power+=Math.min(arr[a+1][b],arr[a+1][b+1]);
                b = (arr[a+1][b]<arr[a+1][b+1]?b:b+1);
                a = a+1;
                flag++;
            }
            else if(b == n-1){
                power+=Math.min(arr[a+1][b-1],arr[a+1][b]);
                b = (arr[a+1][b]<arr[a+1][b-1]?b:b-1);
                a = a+1;
                flag++;
            }
            else{
                power+=Math.min(arr[a+1][b],Math.min(arr[a+1][b-1],arr[a+1][b+1]));
                if(arr[a+1][b-1] < arr[a+1][b] && arr[a+1][b-1] <arr[a+1][b+1]) b = b-1;
                else if(arr[a+1][b] <arr[a+1][b-1] && arr[a+1][b] <arr[a+1][b+1] ) b = b;
                else b = b+1;
                a = a+1;
                flag++;

            }
        }
        System.out.println(power);
    }

}
