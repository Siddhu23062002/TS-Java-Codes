class Sample
{
  public static void main(String agrs[])
  {
    String str1="Hello World"; 
    String str2="Hello World";
    String str3=new String("Hello World");
    String str4=new String("hello World");
    System.out.println(str1==str2);
    System.out.println(str1.equals(str2));
    System.out.println(str3==str4);
    System.out.println(str3.equals(str4));
  }
}