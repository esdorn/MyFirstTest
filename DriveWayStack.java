import java.util.Stack;
import java.util.Scanner;

/**
 * Write a description of class DriveWayStack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DriveWayStack
{
    public static void  main()
    {
        Stack<Integer> drive= new Stack<>();
        Stack<Integer> street= new Stack<>();
        Scanner scan = new Scanner(System.in);
        int num = 1;
        int num2 = 0;
        boolean check = true;
        while (num!= 0)
        {
            System.out.println("Enter the license plate number (positve to add negitive to remove)");
            num = scan.nextInt();
            if (num<0)
            {
                num=num*-1;
                check = true;
                while (drive.size()>0&&check)
                {
                    System.out.println("Driveway: "+drive);
                    System.out.println("Street: "+street);
                    num2 = drive.pop();
                    if (num2==num)
                    {
                        System.out.println("Found car returning cars from the street");
                    }
                    else
                        street.push(num2);
                }
                if (!check)
                {
                    System.out.println("Did not find car returning cars from the street");
                }
                while (street.size()>0)
                {
                    drive.push(street.pop());
                    System.out.println("Driveway: "+drive);
                    System.out.println("Street: "+street);
                }
            }
            else
            {
                drive.push(num);
            }
            System.out.println();
        }
    }
}
