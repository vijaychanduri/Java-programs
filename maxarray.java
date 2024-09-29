package recusrsion;
import java.util.*;
public class maxarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println(maxrec(a,n));
    }
    public static int maxrec(int[] a,int n)
    {
        if(n==1)
        {
            return a[0];
        }
        return Math.max(a[n-1],maxrec(a,n-1));
    }
}
