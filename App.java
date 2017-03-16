import blackjack.Blackjack;

public class App {
  public static void main(String[] args) {
    Blackjack bj = new Blackjack();

    bj.deal();

    System.out.println(bj.total());

    bj.deal();

    System.out.println(bj.total());
  }
}
