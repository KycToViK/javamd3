import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();

        animals.add("Шиншила");
        animals.add("Крокодил");
        animals.add("Лев");
        animals.add("Медведь");
        animals.add("Слон");

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Введите комманду от 1 до 5");
            int command = input.nextInt();
            switch (command) {
                case 1:
                    System.out.println("Животные в зоопарке:");
                    for (String animal : animals)
                        System.out.println(animal);
                    break;

                case 2:
                    System.out.println("Добавьте животное");
                    animals.add(input.next());
                    break;

                case 3:
                    System.out.println("Удалить животное");
                    animals.remove(input.next());
                    break;

                case 4:
                    System.out.println("Очистка списка животных");
                    if (!animals.isEmpty())
                        animals.clear();
                    break;

                case 5:
                    System.out.println("Введите животное для проверки");
                    System.out.println(animals.contains(input.next()));
                    break;

                default:
                    break;
            }
        }
    }
}