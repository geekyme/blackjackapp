package blackjack;

import java.util.ArrayList;

public class Blackjack {
  private ArrayList<Integer> cards = new ArrayList<Integer>();

  public void Blackjack() {

  }

  public void dealFirstTwo() {
    this.deal();
    this.deal();
  }

  public void start() {
    this.dealFirstTwo();

    System.out.println("Game started");
  }

  public void restart() {
    this.cards.clear();
    this.dealFirstTwo();

    System.out.println("Game restarted");
  }

  public void deal() {
    int card = (int)(Math.random() * 10 + 1);

    cards.add(card);

    if (this.total() == 21) {
      System.out.println("Blackjack!");
    }
    else if (cards.size() >= 5) {
      System.out.println("5-Dragon!");
    }
  }

  public int total() {
    int total = 0;

    for (int i = 0; i < cards.size(); i++) {
      total+= cards.get(i);
    }

    return total;
  }

  public boolean isBust() {
    return this.total() > 21;
  }

  public void sayTotal() {
    System.out.println("Your total is: " + Integer.toString(this.total()));
  }
}
