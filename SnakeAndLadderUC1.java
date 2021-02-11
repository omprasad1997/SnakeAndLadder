package com.blbz;

public class SnakeAndLadderUC1 {
		public static final int no_play = 0;
		public static final int ladder  = 1;
		public static final int snake   = 2;

	public static void main(String[] args) {
		int pos_of_player=0;

        while(pos_of_player!=100)
        {
            if(pos_of_player < 0)
                pos_of_player = 0;
            else
            {
                int no_on_die = 1+(int)Math.floor(Math.random()*10)%6;                    
                int options = (int)Math.floor(Math.random()*10)%3;
                switch(options)
                {
                    case no_play :
                        break;
                    case ladder:
                        pos_of_player = pos_of_player + no_on_die;
                        break;
                    case snake:
                        pos_of_player = pos_of_player - no_on_die;
                        break; 
                }
            }
        }
	}
}


