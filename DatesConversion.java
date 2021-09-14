class Sample
 {
   public static void main(String args[])
   {
     int days, years, weeks;
     System.out.print("Enter days: ");
     days=nextInt();
     years=(days/365);  
     weeks=(days%365)/7;
     days=days-((years*365)+(weeks*7));
     System.out.println("YEARS: "+years);
     System.out.println("WEEKS: "+weeks);
     System.out.println("DAYS:  "+days);
   }
 }
