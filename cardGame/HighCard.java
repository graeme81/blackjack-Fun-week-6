 package cardGame;
 import java.util.*;

 class HighCard {

  public static void main(String[] args){

    Deck deck = new Deck(1);
    Card card ,p1card, p2card;
    Player player1 = new Player("Joe");
    Player player2 = new Player("Dealer");

    deck.shuffle();
    
    //deal cards
    card = deck.topCard();
    player1.takeCard(card);
    card = deck.topCard();
    player2.takeCard(card);

    //count cards
    p1card = player1.getCard(0);
    int p1 = p1card.getValue().ordinal()+1;
    p2card = player2.getCard(0);
    int p2 = p2card.getValue().ordinal()+1;

    //print out players cards
    System.out.println(player1.getName()+" has the "+p1card.getValue()+" of "+ p1card.getSuit());
    System.out.println(player2.getName()+" has the "+p2card.getValue()+" of "+ p2card.getSuit());

    // adding this at the end so Aces win
    if (p1 == 1) p1 = 14;
    if (p2 == 1) p2 = 14;

    //print out winner
    if (p1 > p2)
      System.out.println(player1.getName() + " wins!");
    else if (p2 > p1)
      System.out.println(player2.getName() + " wins!");
    else
     System.out.println("It's a Tie!");

  }
}