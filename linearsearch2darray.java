import java.util.*;
public class linearsearch2darray {
    public static void main(String[] args)
    {
        int[][] arr={
            {1,2,3,4},
            {2,4,5},
            {6,7,5},
            {2,3}   
        };
        int t=4;
        int[] ans=search(arr,t);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int t)
    {
      for(int row=0;row<arr.length;row++)
      {
        for(int col=0;col<arr[row].length;col++)
        {
            if(arr[row][col]==t)
            {
                return new int[]{row,col};
            }
        }
      }
      return new int[]{-1,-1};
    }
}
