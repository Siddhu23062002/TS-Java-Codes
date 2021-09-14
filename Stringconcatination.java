class Sample
{
  public static void main(String agrs[])
  {
    String str1=" Hello World "; 
    String str2=new String("I am Siddhu");
    System.out.println(str1.concat(str2));
    System.out.println(str2.concat(str1));
    str1=str1.concat(str2);
    System.out.println(str1);
    System.out.println(str2);
  }
}