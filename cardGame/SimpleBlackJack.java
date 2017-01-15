package cardGame;
import java.util.*;

class SimpleBlackJack {

 public static void main(String[] args){

  Deck deck = new Deck(1);
  Card card;
  Player player1 = new Player("Joe");
  Player player2 = new Player("Dealer");
  Score number = new Score(0);
  int total1 = 0;
  int total2 = 0;

  deck.shuffle();

  for(int i = 0; i < 2; i++){
    //dealing cards
    card = deck.topCard();
    player1.takeCard(card);
    card = deck.topCard();
    player2.takeCard(card);

    //tracking score for player 1
    card = player1.getCard(i);
    int a = card.getValue().ordinal()+1;
    total1 = total1 + number.getScore(a);

    //tracking score for player 2
    card = player2.getCard(i);
    int b = card.getValue().ordinal()+1;
    total2 = total2 + number.getScore(b);
  }

  //printing out cards of player 1
  System.out.println(player1.getName()+ "s cards:");
  
  for (int i = 0; i < 2; i++){
    System.out.println(player1.getCard(i).getValue() + " of " + player1.getCard(i).getSuit());
  }
  System.out.println(player1.getName()+ "s Hand count is:"+ total1); 
  System.out.println(" ");


  //printing out cards of player 2
  System.out.println(player2.getName()+ " cards:");

  for (int i = 0; i < 2; i++){
    System.out.println(player2.getCard(i).getValue() + " of " + player2.getCard(i).getSuit());
  }
  System.out.println(player2.getName()+ "s Hand count is:"+ total2);
  System.out.println(" ");


  // Printing out name of the winner
  if (total1 > total2)
    System.out.println(player1.getName() + " wins!");
  else if (total2 > total1)
    System.out.println(player2.getName() + " wins!");
  else
   System.out.println("PUSH!");

 }
}