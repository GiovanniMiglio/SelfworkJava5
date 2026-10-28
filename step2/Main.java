package step2;

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
        List<Apple> green = filterApplesByColor(mele, Color.GREEN);
        List<Apple> red = filterApplesByColor(mele, Color.RED);
        List<Apple> pesanti = filterApplesByPeso(mele,100);
        for (Apple apple : green) {
            System.out.println(apple.getColor() + " " + apple.getPeso());

        }
        for (Apple apple : red) {
            System.out.println(apple.getColor() + " " + apple.getPeso());

        }
        for (Apple apple : pesanti) {
            System.out.println("---pesanti--"+ apple.getPeso() + " " + apple.getColor());
        }

    }

    public static List<Apple> filterApplesByColor(List<Apple> inventory, Color color) {
        List<Apple> appleInventory = new ArrayList<>();

        for (Apple apple : inventory) {
            if (color.equals(apple.getColor())) {
                appleInventory.add(apple);

            }
        }
        return appleInventory;

    }
    public static List<Apple> filterApplesByPeso(List<Apple> inventory, double peso){
        List<Apple> applePesanti = new ArrayList<>();
        for (Apple apple: inventory){
            if((apple.getPeso()> peso)){
                applePesanti.add(apple);
            }

        }
        return applePesanti;

        

    }
}