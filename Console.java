class console
{
  public static void main(String args[])
  {
    System.out.print("Enter your password:");
    char[]name=System.console().readPassword();
    System.out.println(name);
  }
}
