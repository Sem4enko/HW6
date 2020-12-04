import java.util.*;

public class Hash {
    public static void main(String[] args) {

        //1
        System.out.println("Task1:");
        HashSet<String> listOfCountries = new HashSet<String>();
        listOfCountries.add("Ukraine");
        listOfCountries.add("Italy");
        listOfCountries.add("France");
        listOfCountries.add("Germany");
        System.out.println(listOfCountries);

        //2
        System.out.println("\nTask2:");
        Iterator<String> c = listOfCountries.iterator();
        while (c.hasNext()){
            System.out.println(c.next()+";");
        }

        //3
        System.out.println("\nTask3:");
        System.out.println(listOfCountries);
        System.out.println(listOfCountries.size());

        //4
        System.out.println("\nTask4:");
        HashSet<String> listOfCountries2 = new HashSet<String>();
        listOfCountries2.add("Ukraine");
        listOfCountries2.add("Russia");
        listOfCountries2.add("Argentina");
        listOfCountries2.add("Moldova");

        System.out.println(listOfCountries2);
        listOfCountries2.clear();
        System.out.println(listOfCountries2);

        //5
        System.out.println("\nTask5:");
        System.out.println(listOfCountries);
        System.out.println(listOfCountries2);
        System.out.println(listOfCountries.isEmpty());
        System.out.println(listOfCountries2.isEmpty());

        //6
        System.out.println("\nTask6:");
        System.out.println(listOfCountries);
        Set<String> cloneCountries = new HashSet<>(listOfCountries);
        System.out.println(cloneCountries);

        //7
        System.out.println("\nTask7:");
        System.out.println(listOfCountries);
        String[] arr = new String[listOfCountries.size()];
        listOfCountries.toArray(arr);
        for (String a:arr) {
            System.out.println(a);
        }

        //8
        System.out.println("\nTask8:");
        System.out.println(listOfCountries);
        Set<String> tree = new TreeSet<String>(listOfCountries);

        for (String t: tree) {
            System.out.println(t);
        }
        //9
        System.out.println("\nTask9:");
        System.out.println(listOfCountries);
        List<String> list = new ArrayList<String>(listOfCountries);
        System.out.println(list);

        //10
        System.out.println("\nTask10:");
        HashSet<String> listOfCountries3 = new HashSet<String>();
        listOfCountries3.add("Ukraine");
        listOfCountries3.add("Russia");
        listOfCountries3.add("Argentina");
        listOfCountries3.add("Moldova");

        System.out.println(listOfCountries);
        System.out.println(listOfCountries3);

        for (String value: listOfCountries3) {
            if (listOfCountries.contains(value)){
                System.out.println("True");
            }else {
                System.out.println("False");
            }
        }

        //11
        System.out.println("\nTask11:");
        System.out.println(listOfCountries);
        System.out.println(listOfCountries3);

        listOfCountries.retainAll(listOfCountries3);
        System.out.println(listOfCountries);

        //12
        System.out.println("\nTask12:");
        listOfCountries.clear();
        listOfCountries3.clear();
        System.out.println(listOfCountries + " " + listOfCountries3);

    }
}
