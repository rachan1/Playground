import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
       // type your code here
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      TreeMap<String,String> tm=new TreeMap<String,String>();
      
      String num=br.readLine();
      System.out.println("Enter the number of values to be inserted in map:"+num);
      int n=Integer.parseInt(num);
      String key;
      String val;
      
      for(int i=0;i<n;i++){
        key=br.readLine();
        val=br.readLine();
        tm.put(key,val);
      }
      System.out.println(tm);
      
      String idx=br.readLine();
      System.out.println("Enter the index to be removed:"+idx);
      tm.remove(idx);
      
      System.out.println(tm);
      
      String idx1=br.readLine();
      System.out.println("Enter the index to insert:"+idx1);
      String val2=br.readLine();
      System.out.println("Enter the value to be inserted:"+val2);
      
      tm.put(idx1,val2);
      
      System.out.println(tm);
    }
}