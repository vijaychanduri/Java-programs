package binarysearch;
import java.util.*;
public class binarysearchorderdiagonistic {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int t=sc.nextInt();
        int ans=binarysearch(a,t);
        System.out.println(ans);
    }
    public static int binarysearch(int[] a,int t)
    {
        int s=0,e=a.length-1;
        boolean asc=a[s]<a[e];
        while(s<=e)
        {
            int mid=(s+e)/2;
            if(a[mid]==t)
            {
                return mid;
            }
            if(asc)
            {
                if(t<a[mid])
                {
                    e=mid-1;
                }else if(t>a[mid]){
                    s=mid+1;
                }
            }else{
                if(t>a[mid])
                {
                    e=mid-1;
                }else if(t<a[mid]){
                    s=mid+1;
                }
            }
        }
        return -1;
    }
}
