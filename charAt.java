import java.util.Scanner;
class Test
  {
     public static void main(String args[])
        {
	Scanner sc=new Scanner(System.in);
	String st1=sc.nextLine();
	int len=st1.length();
	for(int i=0;i<len;i++)
	  {
	     System.out.print(st1.charAt(i)+".");
	  }
        }
  }
