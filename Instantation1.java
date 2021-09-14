class First
{
   int a=0;
   void update(int value)
   {
     a=value;
   }
   void disp()
    {
      System.out.println("Updated Value of a is:"+a);
    }
   public static void main(String args[])
    {
      First fob=new First();
      System.out.println("Initial Value is:"+fob.a);
      fob.update(10);
      fob.disp();
    }
}