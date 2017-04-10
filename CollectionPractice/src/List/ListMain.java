package List;

import Common.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Alfie on 4/10/2017.
 * ListMain.class
 */
public class ListMain {

    /*
     * List Practice using object class
     */

    public static void main(String Args[]) {
        List<Person> plist = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        // plist
        plist.add(new Person("John", 27, "Software Engineer"));
        plist.add(new Person("Rad", 35, "Professional Soccer Player"));

        //List of Strings
        stringList.add("String1");
        stringList.add("String2");

        //traverse List using for condition
        System.out.println("Person Class list using for loop: ");
        for (Person person : plist) {
            System.out.println(person.getName() + ", " + person.getAge() + ", " + person.getProfession());
        }

        System.out.println("\nPerson Class list using using iterator: ");
        Iterator iterator = plist.iterator();
        while (iterator.hasNext()) {
            Person person = (Person) iterator.next();
            System.out.println(person.getName() + ", " + person.getAge() + ", " + person.getProfession());
        }

        //Print list of string
        System.out.println("\nPrint list of strings:");

        iterator = stringList.iterator();

        while (iterator.hasNext()) {
            Object element = iterator.next();
            System.out.println(element);
        }
    }
}
