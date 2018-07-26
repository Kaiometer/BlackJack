public class Player {
    private Card[] hand = new Card[11];
    private int nextIndex;
    private int winCount;
    public static final int NUMCARDS = 52;
    public int win=0;
    public int Index=0;
    //constructor(s)
    
    //add temp to this player's hand
    public  void addCardToHand( Card temp )
    {
     int toggle = 0;

     while (Index<11 && toggle == 0) {
      if (hand[Index] == null) {
      hand[Index] = temp;
      toggle = 1;
      }
      Index++;
     }
    }
    
    //"discard" the Player's hand when a new round begins
    public  void resetHand(){
      for(int card= 0; card<11;card++){
       hand[card]= null;
      }
    }
    
    //increment the player's win count
    public void countWin(){
      win++;  
    }
    
    //return this player's win count
    public int getWinCount()
    {
      return win;
    }
    
    //return the number of cards in hand
    public int getHandSize(){
      int size =0;
      int indexy =0;
      int d = 0;
      while(d<=10) {
       if (hand[indexy] != null) {
        size++;
       }
       d++;
       indexy++;
      }
      return size;
    }
    
    //compute the value of
    public int getHandValue(){
    	  int total=0;
    	  int totalF = 0;
    	  int value =0;
    	  int valuee = 0;
    	  Card c4 = new Card (14,0);
    	  for (int numberofcard = 0; numberofcard<11;numberofcard++) {
    	   if (hand[numberofcard]!=null){
    	    value = hand[numberofcard].getValue() ;
    	    total = total+value;
    	   }
    	  }
    	  if (total > 21) {
    	   for (int numberofcard = 0; numberofcard<11;numberofcard++) {
    	    if (hand[numberofcard]!=null){
    	    valuee = hand[numberofcard].getValue() ;
    	    if (valuee == 11){
    	     hand[numberofcard] = c4;
    	     total = total-10;
    	    }
    	    
    	  }
    	  }
    	  /*for (int numberofcard = 0; numberofcard<11;numberofcard++) {
    	   if (hand[numberofcard]!=null){
    	    value = hand[numberofcard].getValue() ;
    	    totalF = totalF+value;
    	   }
    	  }  
    	 } */
    	  
    	 }
    	  return total;
    	 }
    
    public String toString()
    {
      String result = "";
       for (int i=0; i<hand.length; i++) {
        if (hand[i] != null) {
        result = result + hand[i].toString()+ "\n";
        }
       }
       return result;
       }
}