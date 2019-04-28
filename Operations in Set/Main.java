import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       // type your code here
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      
      LinkedHashSet lh=new LinkedHashSet();
      
      String a1=br.readLine();
      String arr[]=a1.split(",");
      for(int i=0;i<arr.length;i++){
       lh.add(arr[i]); 
      }
      
      System.out.println(lh);
      String val=br.readLine();
      System.out.println("Enter the value to be deleted: "+val);
      lh.remove(val);
      System.out.println(lh);
      String v1=br.readLine();
      System.out.println("Enter the value to be added: "+v1);
      lh.add(v1);
      System.out.println(lh);
    }
}