class Alphabets
{
 public static void main(String[] args)
 {
   String s=("The quick brown fox jumps over the lazy dog");
   int i=0;
   for(char c:s.toCharArray()) 
   {
     int x=Character.toUpperCase(c);
     if (x>='A'&& x<='Z') 
     {
       i |=1<<(x-'A');
     }
   }
   if(i==(i|((1<<(1+'Z'-'A'))-1))) 
     System.out.println("All Alphabets are there in the string");
   else
     System.out.println("Some Alphabets are missing");
  }
}