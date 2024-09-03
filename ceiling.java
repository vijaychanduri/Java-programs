package binarysearch;
import java.util.*;
public class ceiling {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);{
           int n=sc.nextInt();
           int[] a=new int[n];
           for(int i=0;i<n;i++)
           {
            a[i]=sc.nextInt();
           }
           int t=sc.nextInt();
           int ans=Ceiling(a,t);
           System.out.println(ans);
        }
    }
        public static int Ceiling(int[] a,int t)
        {
            int s=0,e=a.length-1;
            if(t>a[a.length-1])
            {
                return -1;
            }
            while(s<=e)
            {
                int mid=(s+e)/2;
                if(t<a[mid])
                {
                  e=mid-1;
                }else if(t>a[mid])
                {
                    s=mid+1;
                }else{
                    return mid+1;
                }
            }
            return s;
        }
    
}
