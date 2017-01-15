package cardGame;
import java.util.*;

public class Player{

  private String name;
  private ArrayList<Card> hand;
  private Card card;

  public Player(String name){

    this.name = name;
    this.hand = new ArrayList<Card>();

  }

  public void takeCard(Card card){
    //card = deck.topCard();
    hand.add(card);
  }

  public void clearHand(){ hand.clear();}

  public String getName(){return name;}
  public Card getCard(){ return hand.get(0);}
  public Card getSecondCard(){ return hand.get(1);}
  public int getHandSize(){ return hand.size();}

}