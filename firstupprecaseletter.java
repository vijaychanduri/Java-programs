package recusrsion;
import java.util.*;
public class firstupprecaseletter {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char res=first(str);
        if(res==0)
        {
            System.out.println("no upper case letters");
        }else{
            System.out.println(res);
        }
    }
    public static char first(String str)
    {
        for(int i=0;i<str.length();i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
               return str.charAt(i);
        }
        return 0;  
    }
}
