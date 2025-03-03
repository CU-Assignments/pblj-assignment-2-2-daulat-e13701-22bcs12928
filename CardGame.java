import java.util.*;

class Card {
    String symbol;
    int number;

    Card(String symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }
}
public class CardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, List<Card>> cardMap = new TreeMap<>(); 

        System.out.print("Enter Number of Cards: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter card " + i + ": ");
            String symbol = sc.nextLine();
            int number = sc.nextInt();
            sc.nextLine(); 
            cardMap.putIfAbsent(symbol, new ArrayList<>()); 
            cardMap.get(symbol).add(new Card(symbol, number));
        }
        System.out.println("\nDistinct Symbols are: ");
        for (String symbol : cardMap.keySet()) {
            System.out.print(symbol + " ");
        }
        System.out.println("\n");
        for (String symbol : cardMap.keySet()) {
            List<Card> cards = cardMap.get(symbol);
            int sum = 0;
            System.out.println("Cards in " + symbol + " Symbol");
            for (Card card : cards) {
                System.out.println(card.symbol + " " + card.number);
                sum += card.number;
            }
            System.out.println("Number of cards : " + cards.size());
            System.out.println("Sum of Numbers : " + sum);
            System.out.println();
        }
        sc.close();
    }
}
