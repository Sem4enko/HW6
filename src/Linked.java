import java.util.*;

public class Linked {
    public static void main(String[] args) {

        //1
        System.out.println("Task1:");
        List<String> colors = new LinkedList<>();
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");
        colors.add("Brown");
        colors.add("Red");
        System.out.println(colors);

        //2
        System.out.println("\nTask2:");
        for (String color : colors) {
            System.out.println(color);
        }

        //3
        System.out.println("\nTask3:");
        Iterator number = colors.listIterator(2);
        while (number.hasNext()) {
            System.out.println(number.next());
        }
        //4
        System.out.println("\nTask4:");
        System.out.println(colors);
        Iterator reverseOrder = ((LinkedList<String>) colors).descendingIterator();
        System.out.println("\nElements in Reverse Order:");
        while (reverseOrder.hasNext()) {
            System.out.println(reverseOrder.next());
        }

        //5
        System.out.println("\nTask5:");
        System.out.println(colors);
        colors.add(0,"Yellow");
        System.out.println(colors);

        //6
        System.out.println("\nTask6:");
        System.out.println(colors);
        ((LinkedList<String>) colors).addFirst("Purple");
        ((LinkedList<String>) colors).addLast("Violet");
        System.out.println(colors);

        //7
        System.out.println("\nTask7:");
        ((LinkedList<String>) colors).offerFirst("Pink");
        System.out.println(colors);

        //8
        System.out.println("\nTask8:");
        System.out.println(colors);
        ((LinkedList<String>) colors).offerLast("Gray");
        System.out.println(colors);

        //9
        System.out.println("\nTask9:");
        System.out.println(colors);
        colors.add(3,"Orange");
        colors.add(4,"Gold");
        System.out.println(colors);

        //10
        System.out.println("\nTask10:");
        System.out.println(colors);
        System.out.println(((LinkedList<String>) colors).getFirst());
        System.out.println(((LinkedList<String>) colors).getLast());

        //11
        System.out.println("\nTask11:");
        for (int i=0; i<colors.size(); i++){
            System.out.println(i+": "+colors.get(i));
        }
        //12
        System.out.println("\nTask12:");
        colors.remove(8);
        for (int i=0; i<colors.size(); i++) {
            System.out.println(i + ": " + colors.get(i));
        }

        //13
        System.out.println("\nTask13:");
        System.out.println(colors);
        ((LinkedList<String>) colors).removeFirst();
        ((LinkedList<String>) colors).removeLast();
        System.out.println(colors);

        //14
        System.out.println("\nTask14:");
        List<String> colors1 = new LinkedList<>();
        colors1.add("Blue");
        colors1.add("White");
        colors1.add("Black");
        colors1.add("Brown");
        colors1.add("Red");
        System.out.println(colors1);
        colors1.clear();
        System.out.println(colors1);

        //15
        System.out.println("\nTask15:");
        System.out.println(colors);
        Collections.swap(colors,1,5);
        System.out.println(colors);

        //16
        System.out.println("\nTask16:");
        System.out.println(colors);
       Collections.shuffle(colors);
        System.out.println(colors);

        //17
        System.out.println("\nTask17:");
        List<String> colors2 = new LinkedList<>();
        colors2.add("Blue");
        colors2.add("White");
        colors2.add("Black");
        colors2.add("Brown");
        colors2.add("Red");
        System.out.println(colors);
        System.out.println(colors2);

        List<String> largeColors = new LinkedList<>();
        largeColors.addAll(colors);
        largeColors.addAll(colors2);
        System.out.println(largeColors);

        //18
        System.out.println("\nTask18:");
        System.out.println(colors);
        List clonedList= new LinkedList<>(colors);
        System.out.println(clonedList);

        //19
        System.out.println("\nTask19:");
        System.out.println(colors);
        System.out.println(((LinkedList<String>) colors).pop());

        //20
        System.out.println("\nTask20:");
        System.out.println(colors);
        System.out.println(((LinkedList<String>) colors).peekFirst());

        //21
        System.out.println("\nTask21:");
        System.out.println(colors);
        System.out.println(((LinkedList<String>) colors).peekLast());


        //22
        System.out.println("\nTask22:");
        System.out.println(colors);

        if (colors.contains("Grey")){
            System.out.println("List contains this color");
        }else {
            System.out.println("List not contains this color");
        }

        //23
        System.out.println("\nTask23:");
        List<String> arrayList = new ArrayList<String>(clonedList);

        for (String str : arrayList) {
            System.out.println(str);
        }

        //24
        System.out.println("\nTask24:");
        System.out.println(colors);
        System.out.println(colors2);
        System.out.println(colors.equals(colors2));

        //25
        System.out.println("\nTask25:");
        System.out.println(colors.isEmpty());
        System.out.println(colors1.isEmpty());

        //26
        System.out.println("\nTask26:");
        System.out.println(colors);
        colors.set(0,"Blue");
        System.out.println(colors);
    }
}
