import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ListQuestions {


    public static void main(String[] args) {

        arrayListExample(); // produce concurrent modification exception due to change in original list
        copyOnWriteArrayListExample(); // work fine as it creates new copy list of list and do changes in that list

    }

    private static void arrayListExample() {

        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.stream().forEach(i->{
        arrayList.remove(i);
        });
        arrayList.forEach(System.out::println);

    }

    private static void copyOnWriteArrayListExample() {
        List<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.add(1);
        copyOnWriteArrayList.add(2);
        copyOnWriteArrayList.add(3);
        copyOnWriteArrayList.add(4);
        copyOnWriteArrayList.add(5);
        copyOnWriteArrayList.forEach(i->{
            if (i == 3)
                copyOnWriteArrayList.remove(i);
        });
        copyOnWriteArrayList.forEach(x-> System.out.println(x));

    }

}
