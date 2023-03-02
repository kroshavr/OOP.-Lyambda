import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
//Задание 1
        Predicate<Integer> predicate1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 0;
            }
        };
        System.out.println(predicate1.test(100));

        Predicate<Integer> predicate2 = a -> a > 0;
        System.out.println(predicate2.test(-100));

//        Task1 task11 = new Task1(1);
//        Task1 task12 = new Task1(-2);
//        Task1 task13 = new Task1(32);
//        Task1 task14 = new Task1(-12);
//
//        List<Task1> task1List = new ArrayList<>();
//        task1List.add(task11);
//        task1List.add(task12);
//        task1List.add(task13);
//        task1List.add(task14);

//        Predicate<Task1> predicate = new Predicate<Task1>() {
//            @Override
//            public boolean test(Task1 task1) {
//                return task1.getNumber() > 0;
//            }};
//            System.out.println(predicate.test(task11));
//            System.out.println(predicate.test(task12));
//            System.out.println(predicate.test(task13));
//            System.out.println(predicate.test(task14));

//Задание 2
        Task2 task21 = new Task2("Q");
        Task2 task22 = new Task2("W");

        List<Task2> task2List = new ArrayList<>();
        task2List.add(task21);
        task2List.add(task22);
//        for (Task2 task2 : task2List) {
//            task2(new Consumer<Task2>() {
//                @Override
//                public void accept(Task2 task2) {
//                    System.out.println("Привествие в честь " + task2.getName());
//                }
//            }.accept(task2));
//        }
        Consumer<Task2> task2Consumer = new Consumer<Task2>() {
            @Override
            public void accept(Task2 task2) {
                System.out.println("Привествие в честь " + task2.getName());
            }};
        for (Task2 task2 : task2List) {
            task2Consumer.accept(task2);
        }

        Consumer<Task2> task2Consumer1 = x -> System.out.println("Привествие в честь " + x.getName());
        task2Consumer1.accept(task21);

//Задание 3
        Task3 task31 = new Task3(2.3);
        Task3 task32 = new Task3(12.84);

        List<Task3> task3List = new ArrayList<>();
        task3List.add(task31);
        task3List.add(task32);

        for (Task3 task3 : task3List) {
            System.out.println(new Function<Task3, Long>() {
                @Override
                public Long apply(Task3 task3) {
                    return (long) task3.getNum();
                }}.apply(task3));
        }

        Function<Task3, Long> task3Function = b -> (long) b.getNum();
        System.out.println(task3Function.apply(task31));

//Задание 4
        Supplier<Integer> integerSupplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random() * 101);
            }
        };
        System.out.println(integerSupplier.get());

        Supplier<Integer> integerSupplier1 = () -> (int) (Math.random() * 101);
        System.out.println(integerSupplier1.get());
    }
}