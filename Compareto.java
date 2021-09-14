class Sample
{
  public static void main(String agrs[])
  {
    String str1="Hello"; 
    String str2="Hello";
    String str3=new String("Hello");
    String str4=new String("hello");

    System.out.println(str1.compareTo(str2));

    System.out.println(str3.compareTo(str4));
    System.out.println(str3.compareToIgnoreCase(str4));
  }
}