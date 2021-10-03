package hash;

public class Main {
    public static void main(String[] args) throws Exception {
        HashTable ht = new HashTable(10);

        ht.put("Mary", new Employee("Mary", "Moon", 123));
        ht.put("Willson", new Employee("Willson", "More", 332));
        ht.put("Bob", new Employee("Bob", "Keylab", 546));
        ht.put("Bob1", new Employee("Bob1", "Keylab1", 546));
        ht.put("Bob2", new Employee("Bob2", "Keylab2", 546));
        ht.put("Bob3", new Employee("Bob3", "Keylab3", 546));

        ht.print();

        System.out.println(ht.get("Bob"));
        System.out.println(ht.get("Mary"));
        System.out.println(ht.get("Willson"));
        System.out.println(ht.get("Sony"));
        System.out.println(ht.get("Bob3"));

        System.out.println(ht.remove("Bob1"));
        ht.print();
    }
}
