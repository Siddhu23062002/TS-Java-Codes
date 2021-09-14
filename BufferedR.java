import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Temp
{
  public static void main(String[] args)throws IOException
  {
    BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Write your name: ");
    String name=reader.readLine();
    System.out.print("Type your favourite no(between 1-10):");
    int favno=Integer.parseInt(reader.readLine());
    System.out.println("Welcome "+name+"Your Favourite no is"+favno);
  }
}

