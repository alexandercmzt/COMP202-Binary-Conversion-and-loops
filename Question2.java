public class Question2
{
  public static void main (String[] args)
  {
    //input section
    //System.out.println("Entries entered: " + args.length);
    System.out.println("Side length of box: " + args[0]);
    System.out.println("x,y coordinates of bottom left corner of the box: " + args[1] + " , " + args[2]);
    
    int side = Integer.parseInt(args[0]);
    int x = Integer.parseInt(args[1]);
    int y = Integer.parseInt(args[2]);
    
    //set up axes max/min range
    int xmax=15;
    int xmin=-15;
    int ymax=15;
    int ymin=-15;
    
    if (y+side > 15)
    {
      ymax = y+side;
    }
    else if (y-side < -15)
    {
      ymin = y -side;
    }
    
    if (x+side > 15)
    {
      xmax = x + side;
    }
    else if (x-side < -15)
    {
      xmin = x -side;
    }
    
    
    //draw axes and box
    for (int v = ymax; v >=ymin; v--)      //v is y coord, w is x coord
    {   
      for (int w = xmin; w<=xmax; w++)
      {
        if (v == 0 && w == 0)             //0,0 position
        {
          System.out.print("+");
        }
        else if (v==0 && w==xmax)
        {
          System.out.print(">");
        }
        else if (v==0 && w==xmin)
        {
          System.out.print("<");
        }
        else if (w==0 && v==ymax)
        {
          System.out.print("^");
        }
//       else if (w==0 && v==ymax)
//       {
//          System.out.print("?");
//        }
        else if (v==0)                        //x axis (y positions)
        {
          System.out.print("-");
        }
        else if (w==0)                         // y axis (x positions)
        {
          System.out.print("|");
        }
        else if (v >= y && v < y+side && w>=x && w<x+side)
        {
          System.out.print("#");
        }
        else
        {
          System.out.print(" ");
        }
      }
      System.out.println("");
    } 
    System.out.println("                                                                                                            :) ");
  }
}