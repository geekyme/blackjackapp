package blackjack;

import java.util.ArrayList;

public class Blackjack {
  private ArrayList<Integer> cards = new ArrayList<Integer>();
  private int next = 0;
  private int total = 0;

  public void Blackjack() {

  }

  public void deal() {
    int card = (int)(Math.random() * 10 + 1);

    cards.add(card);

    next++;
  }

  public int total() {
    total = 0;

    for (int i = 0; i < cards.size(); i++) {
      total+= cards.get(i);
    }

    return total;
  }
}
