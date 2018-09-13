import java.util.*;

public class Grid
{
   private static final int SIZE = 10;
   int[][] pixels = new int[SIZE][SIZE];
   private Stack<Pair> pairs= new Stack<>(); 
   private Pair pair;
   /**
      Flood fill, starting with the given row and column.
   */
   public void floodfill(int row, int column)
   {
      pairs.push(new Pair(row,column));
      pixels[row][column] = 1;
      int count = 2;
      while (count<=SIZE*SIZE)
      {
          pair = pairs.pop();
          if (pair.getX()-1>=0&&pixels[pair.getX()-1][pair.getY()]==0)
          {
              pairs.push(new Pair(pair.getX()-1,pair.getY()));
              pixels[pair.getX()-1][pair.getY()] = count;
              count++;
          }
          if (pair.getY()+1<SIZE&&pixels[pair.getX()][pair.getY()+1]==0)
          {
              pairs.push(new Pair(pair.getX(),pair.getY()+1));
              pixels[pair.getX()][pair.getY()+1] = count;
              count++;
          }
          if (pair.getX()+1<SIZE&&pixels[pair.getX()+1][pair.getY()]==0)
          {
              pairs.push(new Pair(pair.getX()+1,pair.getY()));
              pixels[pair.getX()+1][pair.getY()] = count;
              count++;
          }
          if (pair.getY()-1>=0&&pixels[pair.getX()][pair.getY()-1]==0)
          {
              pairs.push(new Pair(pair.getX(),pair.getY()-1));
              pixels[pair.getX()][pair.getY()-1] = count;
              count++;
          }
      }
   }

   @Override
   public String toString()
   {
      String r = "";
      for (int i = 0; i < SIZE; i++)
      {
         for (int j = 0; j < SIZE; j++)
            r = r + String.format("%6d", pixels[i][j]);
         r = r + "\n";
      }
      return r;
   }
}
