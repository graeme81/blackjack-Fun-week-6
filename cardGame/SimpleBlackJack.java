package cardGame;
import java.util.*;

class SimpleBlackJack {

 public static void main(String[] args){

  Deck deck = new Deck(1);
  Card card;
  Player player1 = new Player("Joe");
  Player player2 = new Player("Dealer");
  int p1 = 0;
  int p2 = 0;

  deck.shuffle();

  for(int i = 0; i < 2; i++){
    card = deck.topCard();
    player1.takeCard(card);
    card = deck.topCard();
    player2.takeCard(card);

    card = player1.getCard(i);
    p1 = p1+card.getValue().ordinal()+1;
    card = player2.getCard(i);
    p2 = p2+card.getValue().ordinal()+1;
  }

  System.out.println(player1.getName()+ " cards:");
  
  for (int i = 0; i < 2; i++){
    System.out.println(player1.getCard(i).getValue() + " of " + player1.getCard(i).getSuit());
  }

  System.out.println(player1.getName()+ "s Hand count is:"+ p1); 
  System.out.println(" ");

  System.out.println(player2.getName()+ " cards:");

  for (int i = 0; i < 2; i++){
    System.out.println(player2.getCard(i).getValue() + " of " + player2.getCard(i).getSuit());
  }

  System.out.println(player2.getName()+ "s Hand count is:"+ p2);
  System.out.println(" ");



  if (p1 > p2)
    System.out.println(player1.getName() + " wins!");
  else if (p2 > p1)
    System.out.println(player2.getName() + " wins!");
  else
   System.out.println("PUSH!");

 }
}