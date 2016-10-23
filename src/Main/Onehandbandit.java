
package Main;
import java.util.Random;
import javax.swing.JOptionPane;
public class Onehandbandit 
{
    public static Onehandbandit instance;
    private Onehandbandit()
    {
        
    }
    public static Onehandbandit inst()
    {
        if (instance==null)
        {
            instance = new Onehandbandit();
        }
        return instance;
    }

    public boolean graj()
    {
       Random generator = new Random();
       int first = generator.nextInt(10);
       int second = generator.nextInt(10);
       int third = generator.nextInt(10);
       if (first==second&&second==third)
       {
           JOptionPane.showMessageDialog(null,first+" "+second+" "+third+" Wygrana");
           return true;
       }
       else
       {
          JOptionPane.showMessageDialog(null,first+" "+second+" "+third+" Przegrana");
           return false;
       }
       
    }
}
