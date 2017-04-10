package Hashmap;

import Common.Person;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Alfie on 4/10/2017.
 * HashMapMain.class
 */
public class HashMapMain {
    /*
     * Create a Hashmap for Personal which contains the following
     * ID           - Integer
     * Name         - String
     * Age          - Integer
     * Profession   - String
     */

    public static void main(String Args[]) {
        HashMap<Integer, Person> hash = new HashMap<>();

        hash.put(1, new Person("John", 27, "Software Engineer"));
        hash.put(2, new Person("Rad", 35, "Professional Soccer Player"));

        //Set
        Set set = hash.entrySet();


        //Traverse
        for (Object aSet : set) {
            Map.Entry entry = (Map.Entry) aSet;

            Person person = (Person) entry.getValue();
            System.out.println(person.getName() + ", " + person.getAge() + ", " + person.getProfession());
        }
    }
}
