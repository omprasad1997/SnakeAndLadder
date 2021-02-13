package com.blbz;

public class SnakeAndLadderUC1 {
	public static final int noPlay = 0;
    public static final int ladder  = 1;
    public static final int snake   = 2;
    
public static void main(String[] args) {
 
	int positionOfPlayer1=0;
    int positionOfPlayer2=0;
    boolean player1 = true;
    boolean player2  = false;

    

    while(positionOfPlayer1!=100 && positionOfPlayer2!=100)
    {
        if(positionOfPlayer1 < 0)
            positionOfPlayer1 = 0;
        else if(positionOfPlayer2 < 0)
            positionOfPlayer2 = 0;
        else
        {
            int numberOnDice = 1+(int)Math.floor(Math.random()*10)%6; 
  
            int options = (int)Math.floor(Math.random()*10)%3;
            switch(options)
            {
                case noPlay :
                {
                    player1 = (!player1);
                    player2 = (!player2);
                    break;

                }
                case ladder:
                    if(player1)
                    {
                    	int p1 = (positionOfPlayer1 + numberOnDice);
                    	if((positionOfPlayer1 + numberOnDice) < 100)
                    	{
                    		positionOfPlayer1 = positionOfPlayer1 + numberOnDice;
	                        player1 = true;
	                        player2 = false;
                    	}else if( p1 == 100)
                    		positionOfPlayer1 = 100;
                    	else
                    		break;
                        
                    }else
                    {
                    	int p2 = (positionOfPlayer2 + numberOnDice);
                    	if(p2 < 100)
                    	{
                    		positionOfPlayer2 = positionOfPlayer2 + numberOnDice;
	                        player2 = true;
	                        player1 = false;
                    	}else if( p2 == 100)
                    		positionOfPlayer2 = 100;
                    	else
                    		break;
                    }
                    break;
                case snake:
                    if(player1)
                    {
                        positionOfPlayer1 = positionOfPlayer1 - numberOnDice;
                        player1 = false;
                        player2 = true;
                    }else
                    {
                        positionOfPlayer2 = positionOfPlayer2 - numberOnDice;
                        player2 = true;
                        player1 = false;
                    }
                    break;
            }
        }
    }  
    System.out.println("Player 1:" + positionOfPlayer1);
    System.out.println("Player 2:" + positionOfPlayer2);
    
    if(positionOfPlayer1 == 100)
        System.out.println("Player 1 Won the game");
    else    
        System.out.println("Player 2 Won the game"); 
}
}


