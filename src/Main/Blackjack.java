
package Main;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Blackjack 
{
    public static Blackjack instance;
    private Blackjack()
    {
        
    }
    public static Blackjack inst()
    {
        if (instance==null)
        {
            instance = new Blackjack();
        }
        return instance;
    }
    public int graj()
    {
        int bankHand1,bankHand2,bank;
        Scanner scan = new Scanner(System.in);
        Random gen = new Random();
        int playerHand = gen.nextInt(21)+1;
        do{
        bankHand1 = gen.nextInt(11)+1;
        bankHand2 = gen.nextInt(10)+1;
        bank = bankHand1+bankHand2;
        }
        while (bankHand1+bankHand2<17);
        JOptionPane.showMessageDialog(null,"Gracz: "+playerHand+"\nKrupier: x + "+bankHand1+" ");
        while (playerHand<21)
        { 
        String ans = JOptionPane.showInputDialog("Dobierać? t/n");
        if (ans.equals("n"))
        {
            JOptionPane.showMessageDialog(null,"Krupier: "+bank);
            if (playerHand>bank)
            {
                JOptionPane.showMessageDialog(null,"Wygrana");
                return 2;
            }
            else if (playerHand==bank)
            {
                JOptionPane.showMessageDialog(null,"Remis");
                return 1;
            }
            else if (bank>playerHand)
                    {
                        JOptionPane.showMessageDialog(null,"Przegrana");
                        return 0;
                    }
        }
        playerHand += gen.nextInt(11)+1;
        JOptionPane.showMessageDialog(null,"Gracz: "+playerHand);
        }
        if (playerHand!=21)
        {JOptionPane.showMessageDialog(null,"Przegrana");
        return 0;}
        else
        {
            JOptionPane.showMessageDialog(null,"Wygrana");
                return 1;
        }
    }
}
