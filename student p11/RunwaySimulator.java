import java.util.*;
/**
   Class for simulating a runway.
*/
public class RunwaySimulator
{
   private Queue<String> landing,takeoff;

   /**
      Constructor.
   */
   public RunwaySimulator()
   {
      landing = new LinkedList<>();
      takeoff = new LinkedList<>();
   }

   /**
      Add a flight symbol to the taking off queue.
      @param flightSymbol the flight symbol.
   */
   public void addTakeOff(String flightSymbol)
   {
      takeoff.add(flightSymbol);
   }

   /**
      Add a flight symbol to the landing queue.
      @param flightSymbol the flight symbol.
   */
   public void addLanding(String flightSymbol)
   {
      landing.add(flightSymbol);
   }

   /**
      Handle the next action.
   */
   public void handleNextAction()
   {
      if (landing.size()>0)
      {
          System.out.println("Plane "+landing.remove()+" is landing");
      }
      else if(takeoff.size()>0)
      {
          System.out.println("Plane "+takeoff.remove()+" is taking off");
      }
      else
      {
          System.out.println("No planes waiting");
      }
   }
}
