import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Array {
    public static void main(String[] args) {

        //1
        System.out.println("Task1:");
        List<String> colors1 = new ArrayList<>();
        colors1.add("White");
        colors1.add("Black");
        colors1.add("Green");
        colors1.add("Red");

        System.out.println(colors1);

        //2
        System.out.println("\nTask2:");
        for (String color: colors1) {
            System.out.println(color+";");
        }
        //3
        System.out.println("\nTask3:");
        colors1.add(0,"Yellow");
        System.out.println(colors1);

        //4
        System.out.println("\nTask4:");
        System.out.println(colors1.get(2));
        
        //5
        System.out.println("\nTask5:");
        colors1.set(4,"Blue");
        System.out.println(colors1);

        //6
        System.out.println("\nTask6");
        colors1.remove(2);
        System.out.println(colors1);

        //7
        System.out.println("\nTask7");
            if(colors1.contains("Purple")){
                System.out.println("List contains Purple color");
            }else {
                System.out.println("List not contains Purple color");
            }

         //8
        System.out.println("\nTask8");
        Collections.sort(colors1);
        System.out.println(colors1);

        //9
        System.out.println("\nTask9");
        List<String> colors2 = new ArrayList<>();
        colors2.add("White");
        colors2.add("Black");
        colors2.add("Green");
        colors2.add("Red");

        Collections.copy(colors2, colors1);
        System.out.println("First List:"+colors1);
        System.out.println("Second List:"+colors2);

        //10
        System.out.println("\nTask10");
        System.out.println(colors1);
        Collections.shuffle(colors1);
        System.out.println(colors1);

        //11
        System.out.println("\nTask11");
        System.out.println(colors1);
        Collections.reverse(colors1);
        System.out.println(colors1);

        //12
        System.out.println("\nTask12");
        System.out.println(colors1);
        System.out.println(colors1.subList(1,3));

        //13
        System.out.println("\nTask13");
        Collections.sort(colors1);
        Collections.sort(colors2);
        System.out.println(colors1.equals(colors2));

        //14
        System.out.println("\nTask14");
        System.out.println(colors1);
        Collections.swap(colors1, 1,3);
        System.out.println(colors1);

        //15
        System.out.println("\nTask15");
        System.out.println("List1: " + colors1);
        System.out.println("List2: " + colors2);

        List<String> colors = new ArrayList<>();
        colors.addAll(colors1);
        colors.addAll(colors2);
        System.out.println("Main List: " + colors);

        //16
        System.out.println("\nTask16");
        System.out.println(colors1);
        List<String> colors3 = new ArrayList<>(colors1);
        System.out.println(colors3);

        //17
        System.out.println("\nTask17");
        System.out.println(colors3);
        colors3.clear();
        System.out.println(colors3);

        //18
        System.out.println("\nTask18");
        System.out.println(colors);
        colors.clear();
        System.out.println(colors.isEmpty());

        //19
        System.out.println("\nTask19");
        System.out.println(colors1);
        ((ArrayList<String>) colors1).trimToSize();

        //20
        System.out.println("\nTask20");
        ArrayList<String> colors4= new ArrayList<String>(3);
        colors4.add("Purple");
        colors4.add("Green");
        colors4.add("Black");

        System.out.println(colors4);

        colors4.ensureCapacity(6);
        colors4.add("White");
        colors4.add("Blue");
        colors4.add("Yellow");
        System.out.println(colors4);

        //21
        System.out.println("\nTask21");
        System.out.println(colors4);
        colors4.set(0,"Violet");
        System.out.println(colors4);

        //22
        System.out.println("\nTask22");
        for (String c: colors4) {
            System.out.print(c+", ");
        }
    }
    }

