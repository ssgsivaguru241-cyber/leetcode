class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int player_1 = 0;
        int player_2 = 0;
        int player_1_next = 0;
        int player_2_next = 0;
        for(int i = 0 ; i < player1.length ; i++)
        {
            if(player_1_next <= 2 && player_1_next != 0)
            {
                player_1 += player1[i] * 2;
                player_1_next--;
            }
            else
            {
                player_1 += player1[i];
            }
            if(player1[i] == 10)
            {
                player_1_next = 2;
            }
        }
         for(int i = 0 ; i < player2.length ; i++)
        {
            if(player_2_next <= 2 && player_2_next != 0)
            {
                player_2 += player2[i] * 2;
                player_2_next--;
            }
            else
            {
                player_2 += player2[i];
            }
            if(player2[i] == 10)
            {
                player_2_next = 2;
            }
        }
        if(player_1 > player_2)
        {
            return 1;
        }
        if(player_2 > player_1)
        {
            return 2;
        }
        return 0;
    }
}