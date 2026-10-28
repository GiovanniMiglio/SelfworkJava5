package step1;

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
        List<Apple> green = filterGreenApples(mele);

        for (Apple apple : green) {
            System.out.println(apple.getColor() + " " + apple.getPeso());

        }

    }

    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> green = new ArrayList<>();
        for (Apple apple : inventory) {
            if (Color.GREEN.equals(apple.getColor())) {
                green.add(apple);

            }
        }
        return green;
    }
}