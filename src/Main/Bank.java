
package Main;

public class Bank 
{
    private static Bank instant;
    private int casinoMoney = 1000000;
    private int playerMoney = 2000;
    
    private Bank()
            {}     
    public static Bank instant()
    {
        if (instant==null)
        {
            instant = new Bank();
        }
        return instant;
    }

    public void setPlayerMoney(int playerMoney) {
        this.playerMoney = playerMoney;
    }

    public int getPlayerMoney() {
        return playerMoney;
    }
    public int getCasinoMoney() {
        return casinoMoney;
    }
    public void setCasinoMoney(int CasinoMoney) {
        this.casinoMoney = CasinoMoney;
    }
    
  
    
}
