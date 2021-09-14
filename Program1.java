import java.io.BufferedReader;
import java.io.InputStreamReader;
class Temp
{
  public static void main(String[] args)throws Exception
  {
    BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Write your name: ");
    String name=reader.readLine();
    System.out.print("Enter marks for first subject: ");
    float n1=Float.parseFloat(reader.readLine());
    System.out.print("Enter marks for Second subject: ");
    float n2=Float.parseFloat(reader.readLine());
    System.out.print("Enter marks for Third subject: ");
    float marks=Float.parseFloat(reader.readLine());
  }
}

