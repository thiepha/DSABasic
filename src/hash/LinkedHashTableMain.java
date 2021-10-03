package hash;

public class LinkedHashTableMain {
    public static void main(String[] args) {
        Employee john = new Employee("John", "Dave", 123);
        Employee adam = new Employee("Adam", "Jehn", 3222);
        Employee smith = new Employee("Smith", "Garah", 98);
        Employee bob = new Employee("Bob", "Dylan", 666);
        Employee jenifer = new Employee("Jenifer", "Now", 8768);
        Employee anna = new Employee("Anna", "Sorha", 6989);

        LinkedHashTable lht = new LinkedHashTable(10);
        lht.put(john.getFirstName(), john);
        lht.put(adam.getFirstName(), adam);
        lht.put(smith.getFirstName(), smith);
        lht.put(bob.getFirstName(), bob);
        lht.put(jenifer.getFirstName(), jenifer);
        lht.put(anna.getFirstName(), anna);

        lht.print();

        System.out.println(lht.get(john.getFirstName()));
        System.out.println(lht.get("Seven"));
        System.out.println(lht.get(anna.getFirstName()));

        System.out.println(lht.remove(jenifer.getFirstName()));
        System.out.println(lht.get(jenifer.getFirstName()));
    }
}
