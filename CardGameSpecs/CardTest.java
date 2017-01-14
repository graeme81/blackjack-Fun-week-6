import static org.junit.Assert.*;
import org.junit.*;
import cardGame.*;

public class CardTest{

  Card card;

  @Before
  public void before(){
    card = new Card(Suit.HEARTS, Value.FOUR);
  }

  @Test
  public void isCardAHeart(){
    assertEquals(Suit.HEARTS, card.getSuit());
  }

  public void isCardTheFour(){
    assertEquals(Value.FOUR,card.getValue());
  }

}