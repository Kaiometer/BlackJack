public class Card {
 private final String[] SUITS = {"HEARTS","DIAMONDS","SPADES","CLUBS"};
 private final String[] FACE = {"Placeholder","ACE","TWO","THREE","FOUR","FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING","FAKEACE"};
 
 private String suit;
 private String face;
 public int cardValue;
 
 public Card() {
  int random = (int)(Math.random()*SUITS.length);
  suit = SUITS[random];
  int randomF = (int)(Math.random()*(FACE.length-1))+1;
  face = FACE[randomF];
 }
 
 public Card(int f, int s) {
  suit = SUITS[s];
  face = FACE[f];
 }

 public int getValue() {
 int total = 0;
   if (FACE[1].equals(face)) {
    total += 11;
   }
   if (FACE[2].equals(face)) {
    total += 2;
   }
   if (FACE[3].equals(face)) {
    total += 3;
   }
   if (FACE[4].equals(face)) {
    total += 4;
   }
   if (FACE[5].equals(face)) {
    total += 5;
   }
   if (FACE[6].equals(face)) {
    total += 6;
   }
   if (FACE[7].equals(face)) {
    total += 7;
   }
   if (FACE[8].equals(face)) {
    total += 8;
   }
   if (FACE[9].equals(face)) {
    total += 9;
   }
   if (FACE[10].equals(face) || FACE[11].equals(face) || FACE[12].equals(face) || FACE[13].equals(face)) {
    total += 10;
   }
   if (FACE[14].equals(face)) {
    total = total+1;
   }
  return total;
   
  }
 
 public String getSuit() {
  return suit;
 }
 
 public String getFace() {
  return face;
 }
 
 public void setFaceValue(String value) {
  face = value;
 }
 public void setSuitValue(String value) {
  suit = value;
 }
 
 public String toString() {
  return (face + " of " + suit);
 }
}