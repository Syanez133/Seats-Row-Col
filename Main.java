import java.util.Scanner; 
class Main {
  public static void main(String[] args) {
    int[][] seats = new int[10][4];
    int rownum =0;
    int colnum =0;
    for(int i = 0;i<10;i++)
    {
      System.out.println();
   
      for(int j = 0;j<4;j++)
      {
        seats[i][j] =0;
        System.out.print(seats[i][j]);

      }
      
    }
    Scanner input = new Scanner(System.in); 
   

    while(rownum != -1)
    {
    System.out.println();   
    System.out.println("Please Enter a Row Number ");
    rownum = input.nextInt();
    
      if(rownum == -1)
      {
        for(int i = 0;i<10;i++)
    {
      System.out.println();
   
      for(int j = 0;j<4;j++)
      {
        System.out.print(seats[i][j]);

      }
      
    }
    break;
      }
    System.out.println("Please Enter a Col Number ");
    colnum = input.nextInt();
    while(rownum <0 || rownum >10 || colnum <0 || colnum >4)
    {
      
      if(rownum <0 || rownum >10)
      {
        System.out.println("ERROR :Please Enter a VALID Row Number in the range 0 - 9");
       rownum = input.nextInt();
      }
      if(colnum <0 || colnum >4)
      {
        System.out.println("ERROR :Please Enter a VALID Col Number in the range 0 - 3");
       colnum = input.nextInt();
      }
      
    }
    if(seats[rownum][colnum] == 1)
    {
      System.out.println("SEAT OCCUPIED:Please Enter a different seat ["+rownum+"]"+"["+colnum+"]");
    }
    else{
    seats[rownum][colnum] = 1;
    System.out.println("Reservation made for ["+rownum+"]"+"["+colnum+"]");
    }
    
     }
  }
}