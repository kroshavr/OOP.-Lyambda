import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
public class Main {
    public static void main(String[] args) {
//Задание 1
        Task1 task11 = new Task1(1);
        Task1 task12 = new Task1(-2);
        Task1 task13 = new Task1(32);
        Task1 task14 = new Task1(-12);

        List<Task1> task1List = new ArrayList<>();
        task1List.add(task11);
        task1List.add(task12);
        task1List.add(task13);
        task1List.add(task14);

        Predicate<Task1> predicate = new Predicate<Task1>() {
            @Override
            public boolean test(Task1 task1) {
                return task1.getNumber() > 0;
            }
        };
            System.out.println(predicate.test(task11));
            System.out.println(predicate.test(task12));
            System.out.println(predicate.test(task13));
            System.out.println(predicate.test(task14));

//Задание 2
        Task2 task21 = new Task2("Q");
        Task2 task22 = new Task2("W");

        List<Task2> task2List = new ArrayList<>();
        task2List.add(task21);
        task2List.add(task22);

        Consumer<Task2> task2Consumer = new Consumer<Task2>() {
            @Override
            public void accept(Task2 task2) {
                System.out.println("Привествие в честь " + task2.getName());
            }
        };
        for (Task2 task2 : task2List) {
            task2Consumer.accept(task2);
        }

//Задание 3

    }
}