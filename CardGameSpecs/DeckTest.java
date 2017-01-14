import static org.junit.Assert.*;
import org.junit.*;
import cardGame.*;

public class DeckTest{

Deck deck;
Card card;

@Before 
public void before(){
  deck = new Deck(4);
}


@Test
public void deckIs52Cards(){
  assertEquals(208, deck.deckSize());

}

@Test
public void firstCardIsAceDiamonds(){
  card = deck.topCard();
  assertEquals(Suit.DIAMONDS, card.getSuit());
  assertEquals(Value.ACE, card.getValue());
}

@Test
public void Card15IsTwoOfClubs(){
  card = deck.card15();
  assertEquals(Suit.CLUBS, card.getSuit());
  assertEquals(Value.TWO, card.getValue());

}

}