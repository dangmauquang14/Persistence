package collection.choibai;

import java.util.ArrayList;
import java.util.List;

public class Player {
	private int position; 
	private List<Card> cards = new ArrayList<>();
	
	public Player() {
		position++;
	}

	public Player(List<Card> cards) {
		super();
		this.cards = cards;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}

	@Override
	public String toString() {
		return "\nPlayer [Number " + position + ", cards=" + cards + "]";
	}


	public static List<Player> initialData()
	{
		List<Player> result = new ArrayList<>();
		for(int i = 0;i < 4;i++)
		{
			result.add(new Player());
		}
		return result;
	}
}