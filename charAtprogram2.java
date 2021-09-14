import java.util.Scanner;
class Test
  {
     public static void main(String args[])
        {
	Scanner sc=new Scanner(System.in);
	String st1=sc.nextLine();
	int len=st1.length();
	System.out.println(st1.charAt(0));
	System.out.println(st1.charAt(len/2));
	System.out.println(st1.charAt(len-1));
        }
  }
