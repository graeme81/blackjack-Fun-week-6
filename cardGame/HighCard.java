 package cardGame;
 import java.util.*;

 class HighCard {

  public static void main(String[] args){

    Deck deck = new Deck(1);
    Card card ,p1card, p2card;
    Player player1 = new Player("Joe");
    Player player2 = new Player("Dealer");

    deck.shuffle();

    card = deck.topCard();
    player1.takeCard(card);
    card = deck.topCard();
    player2.takeCard(card);

    p1card = player1.getCard(0);
    int p1 = p1card.getValue().ordinal()+1;
    p2card = player2.getCard(0);
    int p2 = p2card.getValue().ordinal()+1;

    System.out.println(player1.getName()+" has the "+p1card.getValue()+" of "+ p1card.getSuit());
    System.out.println(player2.getName()+" has the "+p2card.getValue()+" of "+ p2card.getSuit());

    if (p1 > p2)
      System.out.println(player1.getName() + " wins!");
    else if (p2 > p1)
      System.out.println(player2.getName() + " wins!");
    else
     System.out.println("It's a Tie!");

  }
}