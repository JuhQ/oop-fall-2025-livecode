import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Person> persons = new ArrayList<>();

        Person person1 = new Person("Juha", 0);

        persons.add(person1);
        persons.add(person1);

        System.out.println(persons);

        System.out.println(persons.get(0));

        System.out.println(persons.get(0).name);

        ArrayList<String> names = new ArrayList<>();
        names.add("Matti");
        names.add("Jarkko");


        System.out.println(names);

        // accessing directly with index does not work
        //System.out.println(persons[0].name);
        System.out.println(persons.get(0).name);

        names.remove(0);
        //names.remove("Matti");

        System.out.println(names);

        names.add(0, "Juha");

        System.out.println(names);


        // add item to the end
        names.add("Juha");

        // add item specific location
        names.add(1, "Value to index 1");

        System.out.println(names);


        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);

            System.out.println(name);
        }

        System.out.println("-----");
        System.out.println("In reverse");
        // print in reverse order
        for (int i = names.size() - 1; i >= 0; i--) {
            String name = names.get(i);
            System.out.println(" " + name);

        }


        System.out.println("-----");
        System.out.println("Values before edit");

        // edit values inside the loop
        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            System.out.println(" " + name);
            names.set(i, "new name");
        }

        System.out.println("Values after edit");
        System.out.println(names);

        System.out.println("-----");
        for (String name : names) {
            System.out.println(name);
        }

    }
}