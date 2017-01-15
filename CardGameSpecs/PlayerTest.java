import static org.junit.Assert.*;
import org.junit.*;
import cardGame.*;

public class PlayerTest{

  Deck deck;
  Card card;
  Player player;

  @Before
  public void before(){
    deck = new Deck(1);
    player = new Player("Joe");

    card = deck.topCard();
    player.takeCard(card);
    card = deck.topCard();
    player.takeCard(card);
  }

  @Test 
  public void cardsDeltFromDeckToHand(){
    
    assertEquals(Suit.DIAMONDS, player.getCard().getSuit());
    assertEquals(Value.ACE,player.getCard().getValue());

    assertEquals(Suit.DIAMONDS, player.getSecondCard().getSuit());
    assertEquals(Value.TWO,player.getSecondCard().getValue());

  } 

  @Test
  public void clearPlayerHand(){
    player.clearHand();
    assertEquals(0,player.getHandSize());
  }


}