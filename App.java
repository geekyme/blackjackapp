import blackjack.Blackjack;
import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    Blackjack bj = new Blackjack();

    bj.start();
    bj.sayTotal();

    Scanner input = new Scanner(System.in);

    String command = "";

    while(!command.equals("exit")) {
      System.out.println("What do you want to do next? <deal|restart|total|exit>");
      command = input.next();

      switch (command) {
        case "deal":
          bj.deal();
          bj.sayTotal();

          if (bj.isBust()) {
            System.out.println("You are busted!");
          }
          break;

        case "restart":
          bj.restart();
          bj.sayTotal();
          break;

        case "total":
          bj.sayTotal();
          break;

        case "exit":
          break;

        default:
          System.out.println("You did not give a valid command!");
          break;

      }
    }

  }
}
