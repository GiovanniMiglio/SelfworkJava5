package step3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Apple> mele = List.of(
            new Apple(Color.GREEN, 150),
            new Apple(Color.GREEN, 50),
            new Apple(Color.RED, 250),
            new Apple(Color.GREEN, 145.5),
            new Apple(Color.RED, 75),
            new Apple(Color.GREEN, 155));

    public static void main(String[] args) {
        List<Apple> green = filterApples(mele, new ApplePredicateGreen ());
        List<Apple> pesanti = filterApples(mele, new ApplePredicateHeavy());
        for (Apple apple : green) {
            System.out.println(apple.getColor() + " " + apple.getPeso());

        }
        for (Apple apple : pesanti) {
            System.out.println("---pesanti--"+ apple.getPeso() + " " + apple.getColor());
        }

    }

    public static List<Apple> filterApples(List<Apple> inventory, ApplePredicate predicate) {
        List<Apple> appleInventory = new ArrayList<>();

        for (Apple apple : inventory) {
            if (predicate.test(apple)) {
                appleInventory.add(apple);

            }
        }
        return appleInventory;

    }
    
}