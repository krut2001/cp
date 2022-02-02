import java.io.*;
import java.util.*;

public class apt {
    public static void main(String[] args) {
        Kattio io = new Kattio();

        int n = io.nextInt();  // number of applicants
        int m = io.nextInt();  // number of apartments
        int k = io.nextInt();  // max diff between desired and actual size

        int[] applicants = new int[n];
        int[] apartments = new int[m];
        for (int i = 0; i < n; i++) {
            applicants[i] = io.nextInt();
        }
        for (int i = 0; i < m; i++) {
            apartments[i] = io.nextInt();
        }

        Arrays.sort(applicants);
        Arrays.sort(apartments);

        int i = 0;
        int j = 0;
        int ans = 0;
        while (i < n && j < m) {
            // Found suitable apartment
            if (Math.abs(applicants[i] - apartments[j]) <= k) {
                i++;
                j++;
                ans++;
            }
            // Apartment is too small -> increment apartment pointer
            else if (applicants[i] > apartments[j]) {
                j++;
            }
            // Apartment is too big -> increment applicant pointer
            else {
                i++;
            }
        }
        io.println(ans);
        io.close();
    }

    //BeginCodeSnip{Kattio}
    static class Kattio extends PrintWriter {
        private BufferedReader r;
        private StringTokenizer st;

        // standard input
        public Kattio() { this(System.in, System.out); }
        public Kattio(InputStream i, OutputStream o) {
            super(o);
            r = new BufferedReader(new InputStreamReader(i));
        }
        // USACO-style file input
        public Kattio(String problemName) throws IOException {
            super(new FileWriter(problemName + ".out"));
            r = new BufferedReader(new FileReader(problemName + ".in"));
        }

        // returns null if no more input
        public String next() {
            try {
                while (st == null || !st.hasMoreTokens())
                    st = new StringTokenizer(r.readLine());
                return st.nextToken();
            } catch (Exception e) { }
            return null;
        }

        public int nextInt() { return Integer.parseInt(next()); }
        public double nextDouble() { return Double.parseDouble(next()); }
        public long nextLong() { return Long.parseLong(next()); }
    }
    //EndCodeSnip
}
/*import java.util.*;
class apt
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int k=sc.nextInt();
        long na[]=new long[n];
        long ma[]=new long[m];
        for(int i=0;i<n;i++){
            na[i]=sc.nextLong();
        }
        for(int i=0;i<m;i++){
            ma[i]=sc.nextLong();
        }
        sc.close();
        Arrays.sort(na);
        Arrays.sort(ma);

        int i=0;
        int j=0;
        long count=0;
        while(i<n && j<m)
        {
            if(Math.abs(na[i]-ma[j])<=k){
                i++;
                j++;
                count++;
            }
            else if(na[i]>ma[j]){
                j++;
            }
            else i++;
        }
        System.out.println(count);
    }
}
*/






















