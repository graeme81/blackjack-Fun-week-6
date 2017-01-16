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
public void cardsDeltFromDeck(){
  card = deck.topCard();
  card = deck.topCard();
  card = deck.topCard();
  card = deck.topCard();
  // 4 decks is 208 cards - 4 cards is 204
  assertEquals(204, deck.deckSize());
}

@Test
public void card15IsTwoOfClubs(){
  card = deck.card15();
  assertEquals(Suit.CLUBS, card.getSuit());
  assertEquals(Value.TWO, card.getValue());
}

@Test
public void card102IsJackOfSpades(){
  card = deck.card102();
  assertEquals(Suit.SPADES, card.getSuit());
  assertEquals(Value.JACK, card.getValue());
}

@Test
public void returningACardIntValue(){
  card = deck.card15();
  assertEquals(2, card.getValue().ordinal()+1);
}

// @Test
// public void card15IsSometimesAHeart(){
//   deck.shuffle();
//   card = deck.card15();
//   assertEquals(Suit.HEARTS, card.getSuit());
// }

}