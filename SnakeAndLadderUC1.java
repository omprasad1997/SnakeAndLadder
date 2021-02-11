package com.blbz;

public class SnakeAndLadderUC1 {
		public static final int no_play = 0;
		public static final int ladder  = 1;
		public static final int snake   = 2;

	public static void main(String[] args) {
		int pos_of_player_1=0;
	    int pos_of_player_2=0;
	    boolean player1 = true;
	    boolean player2  = false;

	    

	    while(pos_of_player_1!=100 && pos_of_player_2!=100)
	    {
	        if(pos_of_player_1 < 0)
	            pos_of_player_1 = 0;
	        else if(pos_of_player_2 < 0)
	            pos_of_player_2 = 0;
	        else
	        {
	            int no_on_die = 1+(int)Math.floor(Math.random()*10)%6; 
	  
	            int options = (int)Math.floor(Math.random()*10)%3;
	            switch(options)
	            {
	                case no_play :
	                {
	                    player1 = (!player1);
	                    player2 = (!player2);
	                    break;

	                }
	                case ladder:
	                    // if(pos_of_player + no_on_die > 100)
	                    //     break;
	                    // else
	                    //     pos_of_player = pos_of_player + no_on_die;
	                    if(player1)
	                    {
	                    	int p1 = (pos_of_player_1 + no_on_die);
	                    	if((pos_of_player_1 + no_on_die) < 100)
	                    	{
	                    		pos_of_player_1 = pos_of_player_1 + no_on_die;
		                        player1 = true;
		                        player2 = false;
	                    	}else if( p1 == 100)
	                    		pos_of_player_1 = 100;
	                    	else
	                    		break;
	                        
	                    }else
	                    {
	                    	int p2 = (pos_of_player_2 + no_on_die);
	                    	if(p2 < 100)
	                    	{
	                    		pos_of_player_2 = pos_of_player_2 + no_on_die;
		                        player2 = true;
		                        player1 = false;
	                    	}else if( p2 == 100)
	                    		pos_of_player_2 = 100;
	                    	else
	                    		break;
	                    }
	                    break;
	                case snake:
	                    if(player1)
	                    {
	                        pos_of_player_1 = pos_of_player_1 - no_on_die;
	                        player1 = false;
	                        player2 = true;
	                    }else
	                    {
	                        pos_of_player_2 = pos_of_player_2 - no_on_die;
	                        player2 = true;
	                        player1 = false;
	                    }
	                    break;
	            }
	        }
	    }  
	    System.out.println("Player 1:" + pos_of_player_1);
	    System.out.println("Player 2:" + pos_of_player_2);
	    
	    if(pos_of_player_1 == 100)
	        System.out.println("Player 1 Won the game");
	    else    
	        System.out.println("Player 2 Won the game"); 
	}
}


