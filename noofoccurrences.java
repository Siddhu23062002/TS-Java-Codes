import java.util.Scanner;
class Sample
{
  public static void main(String agrs[])
  {
    Scanner sc=new Scanner(System.in);
    String str1=sc.nextLine(); 
    int len=str1.length();
    int ncount=0;
    for(int i=0;i<len;i++)
     {
       if(str1.charAt(i)>='0' && str1.charAt(i)<='9');
       {
         ncount=ncount+1; 
       }
    System.out.println("No of digits are :"+ncount);
     }
  }
}