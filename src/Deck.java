import java.util.Random;

public class Deck {
	public static final int NUMFACES = 13;
	public static final int NUMSUITS = 4;
	public static final int NUMCARDS = 52;

	private int topCardIndex;
	private Card[] stack;
	public Object shuffle;

	public Deck (){
		//initialize data - stackOfCards - topCardIndex
		topCardIndex = 0;
		int n = 0;
		int a = 1;
		stack = new Card[NUMCARDS];
		while(topCardIndex <NUMCARDS) {
			Card c = new Card(a,n);
			stack [topCardIndex] = c;
			topCardIndex++;
			if(a==13) {
				a=1;
				n++;
			} else {
				a++;
			}
	}
		topCardIndex = 51;
	}

	//shuffle the stack of cards
    public void shuffle (){
    		for(int index=0;index<100; index++) {
    			double random;
    			random =(Math.random()*(52));
    			double orginal;
    			orginal = (Math.random()*(52));
    			Card temp = stack[(int)orginal];
    			stack[(int) orginal]=stack[(int) random];
    			stack[(int) random] = temp;

	}
    }

    //return how many cards remain undealt
	public int numCardsLeft(){
		return NUMCARDS-topCardIndex;
	}

    //"deals" a Card from the stack
	public Card nextCard(){
        Card next = stack[topCardIndex];
        topCardIndex--;
        return next;
	}

	public String toString(){
		String result = "";
		for(int i=0; i<stack.length; i++) {
			result = result + stack[i].toString() + "\n";
		}
		return result;
	} 

}
