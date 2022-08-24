package Exercise_1_and_2;

import Exercise_1_and_2.Person;

public class PersonCreator {
    public static void main(String[] args) {
        Person Person01 = new Person("James Peterson", 34, 180, 73.5);
        Person Person02 = new Person("Bob Thornley", 25, 171, 68.2);

        System.out.println("Person01 - Name: " + Person01.getName());
        System.out.println("Person01 - Age: " + Person01.getAge());
        System.out.println("Person01 - Height: " + Person01.getHeight() + "cm");
        System.out.println("Person01 - Weight: " + Person01.getWeight() + "lbs");
        System.out.println();
        System.out.println("Person02 - Name: " + Person02.getName());
        System.out.println("Person02 - Age: " + Person02.getAge());
        System.out.println("Person02 - Height: " + Person02.getHeight() + "cm");
        System.out.println("Person02 - Weight: " + Person02.getWeight() + "lbs");
        System.out.println();
        Person01.growOlder();
        System.out.println("Person01 - Name: " + Person01.getName());
        System.out.println("Person01 - Age: " + Person01.getAge());
        System.out.println("Person01 - Height: " + Person01.getHeight() + "cm");
        System.out.println("Person01 - Weight: " + Person01.getWeight() + "lbs");

    }
}
