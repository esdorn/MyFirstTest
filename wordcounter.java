import java.util.*;
import java.io.*;
/**
 * Write a description of class wordcounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wordcounter
{
    public static void main()
    {
        String filename = "speech.txt";

        try (Scanner in = new Scanner(new File(filename)))
        {
            TreeSet<String> words = new TreeSet<>();
            while (in.hasNext())
            {
                String word = clean(in.next());
                words.add(word);
            }
            for (String w:words)
            {
                System.out.println(w);
            }
            System.out.println(words.size());
        }
        catch (FileNotFoundException e)
        {
          System.out.println("Cannot open: " + filename);
        }
    }

    public static String clean(String s)
    {
        String r = "";
        for (int i = 0; i < s.length(); i++)
        {
           char c = s.charAt(i);
           if (Character.isLetter(c))
           {
              r = r + c;
           }
        }
        return r.toLowerCase();
    }
}
