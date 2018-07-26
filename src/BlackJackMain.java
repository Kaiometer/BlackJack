import java.util.Scanner;

public class BlackJackMain {

 public static void main(String[] args) {
  int pWin = 0;
  int dWin = 0;
  boolean want;
  System.out.println("Do you want to play?(respond true or false)");
  Scanner keyboard = new Scanner(System.in);
  want = keyboard.nextBoolean();
  if (want == false) {
   System.out.println("Game over");
  }

  while ( want == true) {

   Deck d = new Deck();
   d.shuffle();
   Card c1 = d.nextCard();
   Card c2 = d.nextCard();

   /*Card c3 = d.nextCard();
   Card c4 = d.nextCard(); */
   Card c3 = new Card(1,1);
   Card c4 = new Card(6,1);


   Player p = new Player();
   Dealer de = new Dealer();

   p.addCardToHand(c1);
   p.addCardToHand(c2);

   de.addCardToHand(c3);
   de.addCardToHand(c4);

   System.out.println("__________________________________________________________________________________________");
   System.out.println("                                      Black Jack                                          ");
   System.out.println("__________________________________________________________________________________________");
   System.out.println("");
   System.out.println("You have been dealt two cards. Your hand size is "+p.getHandSize());
   System.out.println("The value of your hand is "+p.getHandValue());
   System.out.println("Your hand has a " + c2);
   System.out.println("Your hand has a " + c1);
   System.out.println("__________________________________________________________________________________________");


   System.out.println("I just dealt two cards. My hand size is "+de.getHandSize());
   System.out.println("The card you can see is the "+c3);
   System.out.println("__________________________________________________________________________________________");


   boolean hitwant;
   System.out.println("Would you like to hit?(respond true or false)");
   Scanner keyboard1 = new Scanner(System.in);
   hitwant =keyboard1.nextBoolean();
   while (hitwant == true) {
    Card f = new Card();
    f = d.nextCard();
    System.out.println("You drew a " + f);
    p.addCardToHand(f);
    System.out.println("Your hand size is "+p.getHandSize());
    System.out.println("The value of your's hand is "+p.getHandValue());
    if (p.getHandValue()>=21) {
     hitwant =false;
     de.dealDaDealer();
    } else {
     System.out.println("Would you like to hit?(respond true or false)");
     Scanner keyboard2 = new Scanner(System.in);
     hitwant =keyboard2.nextBoolean();
     
     if (hitwant == false) {
      de.dealDaDealer();
      System.out.println("");
      System.out.println("You have "+p.getHandValue());
      de.dealDaDealer();
      System.out.println("The dealer has " + de.getHandValue());

      if (p.getHandValue() > 21) {
       System.out.println("The Dealer Wins");
       dWin++;
       p.resetHand();
       de.resetHand();
       System.out.println("You have won " + pWin + " rounds.  The dealer has won " +dWin + " rounds.");
       System.out.println("Do you want to play again?(respond true or false)");
       Scanner keyboard4 = new Scanner(System.in);
       want = keyboard4.nextBoolean();
      }
      
      if (de.getHandValue() > 21) {
       System.out.println("The Player Wins");
       pWin++;
       p.resetHand();
       de.resetHand();
       System.out.println("You have won " + pWin + " rounds.  The dealer has won " +dWin + " rounds.");
       System.out.println("Do you want to play again?(respond true or false)");
       Scanner keyboard3 = new Scanner(System.in);
       want = keyboard3.nextBoolean();
      }

      

      if (de.getHandValue() >= p.getHandValue() && de.getHandValue() <= 21) {
       System.out.println("The Dealer Wins");
       dWin++;
       p.resetHand();
       de.resetHand();
       System.out.println("You have won " + pWin + " rounds.  The dealer has won " +dWin + " rounds.");
       System.out.println("Do you want to play again?(respond true or false)");
       Scanner keyboard5 = new Scanner(System.in);
       want = keyboard5.nextBoolean();
      }
      if (p.getHandValue() > de.getHandValue() && p.getHandValue() <= 21) {
       System.out.println("The Player Wins");
       pWin++;
       p.resetHand();
       de.resetHand();
       System.out.println("You have won " + pWin + " rounds.  The dealer has won " +dWin + " rounds.");
       System.out.println("Do you want to play again?(respond true or false)");
       Scanner keyboard6 = new Scanner(System.in);
       want = keyboard6.nextBoolean();
      }
     }

    }
   }
   if (hitwant == false) {
    System.out.println("");
    de.dealDaDealer();
    System.out.println("You have "+p.getHandValue());
    System.out.println("The dealer has " + de.getHandValue());

    if (de.getHandValue() > 21) {
     System.out.println("The Player Wins");
     pWin++;
     p.resetHand();
     de.resetHand();
     hitwant = true;
     System.out.println("You have won " + pWin + " rounds.  The dealer has won " +dWin + " rounds.");
     System.out.println("Do you want to play again?(respond true or false)");
     Scanner keyboard3 = new Scanner(System.in);
     want = keyboard3.nextBoolean();
    }

    if (p.getHandValue() > 21) {
     System.out.println("The Dealer Wins");
     dWin++;
     p.resetHand();
     de.resetHand();
     hitwant = true;
     System.out.println("You have won " + pWin + " rounds.  The dealer has won " +dWin + " rounds.");
     System.out.println("Do you want to play again?(respond true or false)");
     Scanner keyboard4 = new Scanner(System.in);
     want = keyboard4.nextBoolean();
    }

    if (de.getHandValue() >= p.getHandValue() && de.getHandValue() <= 21) {
     System.out.println("The Dealer Wins");
     dWin++;
     p.resetHand();
     de.resetHand();
     hitwant = true;
     System.out.println("You have won " + pWin + " rounds.  The dealer has won " +dWin + " rounds.");
     System.out.println("Do you want to play again?(respond true or false)");
     Scanner keyboard5 = new Scanner(System.in);
     want = keyboard5.nextBoolean();
    }
    if (p.getHandValue() > de.getHandValue() && p.getHandValue() <= 21) {
     System.out.println("The Player Wins");
     pWin++;
     p.resetHand();
     de.resetHand();
     hitwant = true;
     System.out.println("You have won " + pWin + " rounds.  The dealer has won " +dWin + " rounds.");
     System.out.println("Do you want to play again?(respond true or false)");
     Scanner keyboard6 = new Scanner(System.in);
     want = keyboard6.nextBoolean();
    }
   }
  }
 }
}