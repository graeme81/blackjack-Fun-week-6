package cardGame;
import java.util.*;
import java.util.Scanner.*;

class BlackJack {

  public static void main(String[] args){

    Deck deck = new Deck(4);
    Card card;
    Player dealer = new Player("Dealer");
    Score number = new Score(0);
    int total1 = 0;
    int total2 = 0;
    boolean playerTurn = true;
    boolean dealerTurn = false;

    deck.shuffle();

    //Get Player Name and create player
    System.out.println("Enter Player name:");
    Scanner input = new Scanner(System.in);
    String playerName = input.next();
    Player player = new Player(playerName);
    //System.out.println("Player 1 is " + player.getName());

    //Deal some cards
    for (int i = 0; i < 2; i++){
      card = deck.topCard();
      player.takeCard(card);
      card = deck.topCard();
      dealer.takeCard(card);
    }

    //Show Dealer card
    System.out.println(dealer.getName()+ " is showing the "+dealer.getCard(0).getValue() + " of "+ dealer.getCard(0).getSuit());
    System.out.println("");

    //Show Player hand
    System.out.println(player.getName()+ "s cards are:");
    System.out.println("");

    for (int i = 0; i < player.getHandSize(); i++){
      System.out.println("The "+player.getCard(i).getValue() + " of " + player.getCard(i).getSuit());
      //keep cout of total
      card = player.getCard(i);
      int a = card.getValue().ordinal()+1;
      total1 = total1+ number.getScore(a);
    } 
    System.out.println(total1);
    System.out.println("");   


    //Ask for Hit or Stick loop

    while (playerTurn == true && total1 < 21){
      System.out.println("Do you want to Twist or Stick? (Enter T or S)");
      String choice = input.next();

      if (choice.compareToIgnoreCase("T") == 0){
        player.takeCard(deck.topCard());
        System.out.println(player.getName()+ "s cards are:");
        System.out.println("");
        total1 = 0;
        for (int i = 0; i < player.getHandSize(); i++){
          System.out.println("The " + player.getCard(i).getValue() + " of " + player.getCard(i).getSuit());

          //keep count of total
          card = player.getCard(i);
          int a = card.getValue().ordinal()+1;
          total1 = total1+ number.getScore(a);
          
        } 
        System.out.println(total1);
        System.out.println(""); 

      }
      else  playerTurn = false;
            dealerTurn = true;
    }

    //Dealer Plays
    System.out.println("The Dealers cards are:");
    for(int i = 0; i<dealer.getHandSize(); i++){
      System.out.println("The "+dealer.getCard(i).getValue() + " of "+ dealer.getCard(i).getSuit());
      card = dealer.getCard(i);
      int b = card.getValue().ordinal()+1;
      total2 = total2+ number.getScore(b);
    }
    System.out.println(total2);
    System.out.println("");


    while(dealerTurn == true && total2 < 17){
      total2 = 0;

      dealer.takeCard(deck.topCard()); 

      System.out.println("The Dealers cards are:");
      for(int i = 0; i<dealer.getHandSize(); i++){
        System.out.println("The "+dealer.getCard(i).getValue() + " of "+ dealer.getCard(i).getSuit());

        //keep count of total
        card = dealer.getCard(i);
        int b = card.getValue().ordinal()+1;
        total2 = total2 + number.getScore(b);
        
      }
      System.out.println(total2);
      System.out.println("");  

    }

    //Result Shown
    if ((total1 > total2 && total1 < 22)||(total1 < total2 && total2 > 21))
      System.out.println(player.getName()+ " wins!");
    else if ((total2 > total1 && total2 < 22)||(total2 < total1 && total1 > 21))
      System.out.println(dealer.getName()+ " wins!");
    else
      System.out.println("PUSH!");


  }

}
