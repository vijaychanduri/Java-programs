package recusrsion;
import java.util.*;
public class sumtrianglefromarray {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        printtriangle(a);
    }
    public static void printtriangle(int[] a)
    {
        if(a.length<1)
        {
            return;
        }
        int[] temp=new int[a.length-1];
        for(int i=0;i<a.length-1;i++)
        {
            int x=a[i]+a[i+1];
            temp[i]=x;
        }
        System.out.println(Arrays.toString(a));
        printtriangle(temp);
        //System.out.println(Arrays.toString(a));
    }
    
}
