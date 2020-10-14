class Ugly_Number{
   
       static void getNthUglyNo(int n) 
       { 
        int ugly[] = new int[n+1];  // To store ugly numbers 
        int i2 = 0, i3 = 0, i5 = 0; 
        int next_multiple_of_2 = 2; 
        int next_multiple_of_3 = 3; 
        int next_multiple_of_5 = 5; 
        
          
        ugly[0] = 1; 
        for(int i =1;i<=n;i++)
        {
          int nextUgly = Math.min(next_multiple_of_2,Math.min     (next_multiple_of_3,next_multiple_of_5));
           ugly[i] = nextUgly;
          if(nextUgly == next_multiple_of_2)
          {
              i2 = i2+1;
              next_multiple_of_2 = ugly[i2]*2;
              
           }

           if(nextUgly == next_multiple_of_3)
             {
               i3 = i3+1;
               next_multiple_of_3 = ugly[i3]*3;
                
            }
            if(nextUgly == next_multiple_of_5)
               {
                   
                 i5 = i5+1;
                 next_multiple_of_5 = ugly[i5]*5;
                 }} 
        //loop end;
  
    for(int i = 0;i<n;i++)
        System.out.print(+ugly[i]+ "  ");
    }

    public static void main(String args[])
     {
            int n = 20;
             getNthUglyNo(20);
    }}
      