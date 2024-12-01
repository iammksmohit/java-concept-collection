import pojo.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Stream;

public class ListQuestions {


    public static void main(String[] args) {
        List<Integer> list = Stream.of(1, 2, 3, 4, 5).toList();
        copyOnWriteArrayListExample(list); // work fine as it creates new copy list of list and do changes in that list
       // arrayListExample(list); // produce concurrent modification exception due to change in original list
        sortMultiComparatorExample();

    }

    private static void arrayListExample(List<Integer> list) {

        List<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(list);
        arrayList.stream().forEach(i->{
        arrayList.remove(i);
        });
        arrayList.forEach(System.out::println);

    }

    private static void copyOnWriteArrayListExample(List<Integer> list) {
        List<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.addAll(list);
        copyOnWriteArrayList.forEach(i->{
            if (i == 3)
                copyOnWriteArrayList.remove(i);
        });
        copyOnWriteArrayList.forEach(x-> System.out.println(x));

    }


    private static void sortMultiComparatorExample() {

        Employee e1 = new Employee("mayur", 25, "cse");
        Employee e2 = new Employee("sulu", 25, "ece");
        Employee e3 = new Employee("mayur", 24, "cse");
        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.sort(Comparator.comparing(Employee::getAge)
                .thenComparing((a, b) -> b.getName().compareTo(a.getName()))
                .thenComparing((a, b) -> b.getDepartment().compareTo(a.getDepartment())));
        System.out.println(employees);

    }

}
