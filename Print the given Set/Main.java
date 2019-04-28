import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
      //type your code here
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      
      LinkedHashSet lh=new LinkedHashSet();
      
      String a1=br.readLine();
      String arr[]=a1.split(",");
      
      for(int i=0;i<arr.length;i++){
        
       lh.add(arr[i]); 
      }
      System.out.println(lh);
    }
}