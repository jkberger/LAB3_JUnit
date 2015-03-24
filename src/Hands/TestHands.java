package Hands;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import poker.Card;
import poker.Deck;
import poker.Hand;
import poker.eHandStrength;
import poker.eRank;
import poker.eSuit;

public class TestHands {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void TestRoyalFlush1() {

		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
		rfHand.add(new Card(eSuit.CLUBS,eRank.ACE));
		Hand h = Hand.EvalHand(rfHand);
		
		assertEquals("Should be rf:",eHandStrength.RoyalFlush.getHandStrength(),h.getHandStrength());
		
	}

	@Test
	public final void TestRoyalFlush2() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
		rfHand.add(new Card(eSuit.CLUBS,eRank.ACE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be rf:",eHandStrength.RoyalFlush.getHandStrength(),h.getHandStrength());		
	}
	
	@Test
	public final void TestStraightFlush1() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.NINE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be Sf:",eHandStrength.StraightFlush.getHandStrength(),h.getHandStrength());		
	}

	@Test
	public final void TestStraightFlush2() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.NINE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be Sf:",eHandStrength.StraightFlush.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestFlush1() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TEN));
		rfHand.add(new Card(eSuit.CLUBS,eRank.NINE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be f:",eHandStrength.Flush.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestStraight() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.KING));
		rfHand.add(new Card(eSuit.HEARTS,eRank.TEN));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.NINE));
		rfHand.add(new Card(eSuit.SPADES,eRank.JACK));
		rfHand.add(new Card(eSuit.HEARTS,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be S:",eHandStrength.Straight.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestStraight2() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.HEARTS,eRank.KING));
		rfHand.add(new Card(eSuit.DIAMONDS,eRank.TEN));
		rfHand.add(new Card(eSuit.SPADES,eRank.NINE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JACK));
		rfHand.add(new Card(eSuit.CLUBS,eRank.QUEEN));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be S:",eHandStrength.Straight.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestFullHouse1() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FIVE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FIVE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FIVE));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be FH:",eHandStrength.FullHouse.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestFullHouse2() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FIVE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FIVE));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be FH:",eHandStrength.FullHouse.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestFourOfAKind1() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FIVE));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be 4k:",eHandStrength.FourOfAKind.getHandStrength(),h.getHandStrength());		
	}

	@Test
	public final void TestFourOfAKind2() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FIVE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FIVE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FIVE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FIVE));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be 4k:",eHandStrength.FourOfAKind.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestFiveOfAKind1() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.CLUBS,eRank.JOKER));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be 5k:",eHandStrength.FiveOfAKind.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestThreeOfAKind1() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.FOUR));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FIVE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FIVE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FIVE));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be 3k:",eHandStrength.ThreeOfAKind.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestThreeOfAKind2() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FOUR));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FIVE));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be 3k:",eHandStrength.ThreeOfAKind.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestThreeOfAKind3() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.FOUR));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FOUR));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FOUR));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FIVE));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be 3k:",eHandStrength.ThreeOfAKind.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestPair1() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.CLUBS,eRank.THREE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FOUR));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FIVE));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be Pair:",eHandStrength.Pair.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestPair2() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.CLUBS,eRank.THREE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.THREE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FOUR));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FIVE));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be Pair:",eHandStrength.Pair.getHandStrength(),h.getHandStrength());		
}
	@Test
	public final void TestPair3() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.CLUBS,eRank.THREE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FOUR));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FOUR));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FIVE));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be Pair:",eHandStrength.Pair.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestPair4() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.CLUBS,eRank.THREE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FOUR));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FIVE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FIVE));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be Pair:",eHandStrength.Pair.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestTwoPair1() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.CLUBS,eRank.THREE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.THREE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FIVE));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be TwoPair:",eHandStrength.TwoPair.getHandStrength(),h.getHandStrength());		
	}
	@Test
	public final void TestTwoPair2() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.CLUBS,eRank.TWO));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FOUR));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FOUR));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FIVE));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be TwoPair:",eHandStrength.TwoPair.getHandStrength(),h.getHandStrength());
	}
	@Test
	public final void TestHighCard1() {
		
		ArrayList<Card> rfHand = new ArrayList<Card>();
		rfHand.add(new Card(eSuit.CLUBS,eRank.ACE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.THREE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.NINE));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FOUR));
		rfHand.add(new Card(eSuit.CLUBS,eRank.FIVE));
		Hand h = Hand.EvalHand(rfHand);		
		
		assertEquals("Should be HighCard:",eHandStrength.HighCard.getHandStrength(),h.getHandStrength());		
	}		
}
	
