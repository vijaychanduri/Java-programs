package binarysearch;
import java.util.*;
public class binarysearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int t=sc.nextInt();
        int ans=binarySearch(a,t);
        System.out.println(ans);
    }
    public static int binarySearch(int[] a,int t)
    {
        int s=0,e=a.length-1;
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
            return mid;
          }
        }
        return -1;
    }
}
