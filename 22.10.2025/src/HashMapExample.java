import java.util.HashMap;
import java.util.Map;

class HashMapTester {
    public HashMapTester() {
        HashMap<String, Person> persons = new HashMap<>();

        persons.put("name1", new Person("Juha", 0));
        persons.put("name2", new Person("Jarkko", 100));

        System.out.println(persons);

        Person person = persons.get("name1");

        System.out.println(person);
        System.out.println(person.name);

        HashMap<String, String> names = new HashMap<>();
        names.put("juha", "Juha");


        HashMap<String, Person> names2 = new HashMap<>();

        Person person2 = new Person("New person", 0);
        names2.put("new person", person2);

        names2.put("key", new Person("New person", 0));

        names2.put("another value", new Person("New person", 0));

        //System.out.println(names2.get(person2));
        //System.out.println(names2.get(new Person("New person", 0)));

        System.out.println(names2);

        for (Map.Entry<String, Person> entry : names2.entrySet()) {
            Person person1 = entry.getValue();
            String name = entry.getKey();

            System.out.println("name " + name);
            System.out.println("object " + person1);
        }
    }

    public Person createPerson() {
        return new Person("Someone who was returned here", 0);
    }
}


public class HashMapExample {

    public static void main(String[] args) {
        new HashMapTester();

    }

}
