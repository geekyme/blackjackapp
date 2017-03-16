package blackjack;

public class Blackjack {
  private int[] cards = new int[5];
  private int next = 0;
  private int total = 0;

  public void Blackjack() {

  }

  public void deal() {
    this.cards[this.next] = (int )(Math.random() * 10 + 1);

    this.next++;
  }

  public int total() {
    total = 0;

    for (int i = 0; i < this.cards.length; i++) {
      total+= this.cards[i];
    }

    return total;
  }
}
