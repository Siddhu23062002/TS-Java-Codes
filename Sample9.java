class Sample 
  {
   public static void main(String[]args)
     {
        int arr[]=new int[10];
        int len=args.length;
        for(int i=0; i<len; i++)
           arr[i]=Integer.parseInt(args[i]);
        int sum=0;
        int avg=0;
        for(int i=0; i<len; i++)
           sum=sum+arr[i];
        System.out.println("Sum is"+sum);
        System.out.println("Average is"+(sum/(float)len));
     }
  }
