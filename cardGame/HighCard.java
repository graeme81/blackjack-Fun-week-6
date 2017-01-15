 package cardGame;
 import java.util.*;

 class HighCard {

  public static void main(String[] args){

    Deck deck = new Deck(1);
    Card card;
    Player player1 = new Player("Joe");
    Player player2 = new Player("Dealer");

    deck.shuffle();
    card = deck.topCard();
    player1.takeCard(card);
    card = deck.topCard();
    player2.takeCard(card);

    card = player1.getCard(0);
    int p1 = card.getValue().ordinal()+1;
    card = player2.getCard(0);
    int p2 = card.getValue().ordinal()+1;

    System.out.println(p1+ "  ..  " + p2);


    if (p1 > p2)
      System.out.println(player1.getName() + " wins!");
    else if (p2 > p1)
      System.out.println(player2.getName() + " wins!");
    else
     System.out.println("DRAW!");

  }
}