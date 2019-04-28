import java.util.Scanner;
class Faculty
{
  public void salary(int base_salary)
  {
    System.out.println("Base Salary: "+base_salary);
  }
}
class CSE
{
  public void salary(int base_salary)
  {
     System.out.println("CSE Faculty: "+(base_salary+3000));
  }
}
class IT
{
   public void salary(int base_salary)
  {
     System.out.println("IT Faculty: "+(base_salary+5000));
  }
}
class ECE
{
   public void salary(int base_salary)
  {
     System.out.println("ECE Faculty: "+(base_salary+4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
   Scanner in=new Scanner(System.in);
   int sal=in.nextInt();
    if(sal>0){
     Faculty f=new Faculty();
      f.salary(sal);
     CSE c=new CSE();
      c.salary(sal);
      IT i=new IT();
      i.salary(sal);
      ECE e=new ECE();
      e.salary(sal);  
    }else{
      System.out.println("null");
    }
    //implement your required concept here
  }
}