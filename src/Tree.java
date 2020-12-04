import java.util.*;

public class Tree {
    public static void main(String[] args) {

        //1
        System.out.println("Task1:");
        Set<String> colors = new TreeSet<>();
        colors.add("Green");
        colors.add("Brown");
        colors.add("Yellow");
        colors.add("Blue");
        colors.add("Red");

        System.out.println(colors);

        //2
        System.out.println("\nTask2:");
        for (String value : colors) {
            System.out.println(value);
        }

        //3
        System.out.println("\nTask3:");
        Set<String> colors2 = new TreeSet<>();
        colors2.add("Black");
        colors2.add("White");

        colors2.addAll(colors);
        System.out.println(colors2);

        //4
        System.out.println("\nTask4:");
        System.out.println(colors2);

        Iterator reverseOrder = ((TreeSet<String>) colors2).descendingIterator();
        while (reverseOrder.hasNext()) {
            System.out.println(reverseOrder.next());
        }

        //5
        System.out.println("\nTask5:");
        System.out.println(colors2);
        System.out.println(((TreeSet<String>) colors2).first());
        System.out.println(((TreeSet<String>) colors2).last());

        //6
        System.out.println("\nTask6:");
        Set<String> colors3 = (Set<String>) ((TreeSet<String>) colors2).clone();
        System.out.println(colors3);

        //7
        System.out.println("\nTask7:");
        System.out.println(colors2.size());

        //8
        System.out.println("\nTask8:");

        for (String value: colors) {
            if (colors3.contains(value)) {
                System.out.println("True");
            } else {
                System.out.println("False");
            }
        }

        //9
        System.out.println("\nTask9:");
        Set<Integer> num = new TreeSet<>();
        num.add(11);
        num.add(2);
        num.add(3);
        num.add(4);
        num.add(55);
        num.add(32);
        num.add(8);
        num.add(6);
        num.add(77);
        num.add(91);

        System.out.println(num);
        Set<Integer> numbersLess7 = ((TreeSet<Integer>) num).headSet(7);
        System.out.println(numbersLess7);

        //10
        System.out.println("\nTask10:");
        System.out.println(num);
        System.out.println(((TreeSet<Integer>) num).ceiling(32));

        //11
        System.out.println("\nTask11:");
        System.out.println(num);
        System.out.println(((TreeSet<Integer>) num).floor(32));

        //12
        System.out.println("\nTask12:");
        System.out.println(num);
        System.out.println(((TreeSet<Integer>) num).higher(32));

        //13
        System.out.println("\nTask13:");
        System.out.println(num);
        System.out.println(((TreeSet<Integer>) num).lower(32));

        //14
        System.out.println("\nTask14:");
        System.out.println(num);
        ((TreeSet<Integer>) num).pollFirst();
        System.out.println(num);

        //15
        System.out.println("\nTask15:");
        System.out.println(num);
        ((TreeSet<Integer>) num).pollLast();
        System.out.println(num);

        //16
        System.out.println("\nTask16:");
        System.out.println(num);
        num.remove(11);
        System.out.println(num);

    }
}
