package intro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<Person> people = List.of(new Person("Andrea", Gender.MALE),
            new Person("Maria", Gender.FEMALE),
            new Person("Paola", Gender.FEMALE),
            new Person("Roberto", Gender.MALE),
            new Person("Marco", Gender.MALE));

    static List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    public static void main(String[] args) {

        List<Person> females = new ArrayList<>();

        for (Person person : people) {
            if (Gender.FEMALE.equals(person.getGender())) {
                females.add(person);

            }
        }
        for (Person female : females) {
            System.out.println("---for--" + female.getName());

        }
        List<Person> femalesStream = people.stream().filter(person -> Gender.FEMALE.equals(person.getGender()))
                .toList();
        femalesStream.forEach(female -> System.out.println("---stream---" + female.getName()));
        List<Integer> pari = numbers.stream().filter(number -> number % 2 == 0).toList();
        pari.forEach(number -> System.out.println("---pari--" + number));
        List<Integer> doppio = pari.stream().map(number -> number*2).toList();
        doppio.forEach(number -> System.out.println("---doppi---" + number));
        int somma = doppio.stream().reduce(0, (a, b) -> a + b);
        System.out.println("---somma doppiS---" + somma);

    }
}
