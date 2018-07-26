public class Dealer {
 Deck deckOfCards = new Deck();
 private Card[] hand = new Card [11];
 private int nextIndex;
 private int winCount;
 public int index;
 public int Index = 0;
 Card nen = new Card();


 private Card[] stack;
 //add temp to this dealers hand
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
  
 //"discard" the dealer hand when a new round begins
 public  void resetHand( )
 {
  for(int card= 0; card<11;card++){
   hand[card]= null; 
  }
 }

 //increment the dealerΓÇÖs win count
 public void countWin()
 {
  winCount++;  
 }

 //return this dealer's win count
 public int getWinCount()
 {
  return winCount;
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

 public String toString(){
  String result = "";
  for(int i=0; i<hand.length; i++) {
   if (hand[i]!=null){
    result = result + hand[i].toString();
   }
  }
  return result;
 }

 //shuffle the deck
 public void shuffleDeck(){
  deckOfCards.shuffle();
 }

 //get the next card from the deckOfCards and return it
 public Card dealCard(){
  //int toggle = 0;
  //int ind = 0;
  Card c1 = deckOfCards.nextCard();
  /*while (toggle == 0 && ind < 11) {
   if (hand[ind]!=null){
    hand[ind]= c1;
    toggle = 1;
   }
   ind++;
  }
  */
  return c1;
 }


 //return true if the dealer hits, false if not
 public boolean hit(){
  boolean hit = false;
  if (getHandValue()==17) {
	  for (int i = 0; i<hand.length; i++) {
	  	if (hand[i] != null) {
		if (hand[i].getValue() == 11) {
			hit = true;
     }
    }
   }
  }
  if (getHandValue()<17) {
   hit = true;
  }
  return hit;
 }

  public boolean dealDaDealer() {
    boolean f = hit();
    while (hit() == true) {
    nen = dealCard();
    addCardToHand(nen);
    }
    return f;
   }
   }