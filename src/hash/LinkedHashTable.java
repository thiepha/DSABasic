package hash;

import java.util.LinkedList;
import java.util.List;

public class LinkedHashTable {
     List<StoredEmployee>[] buckets;
     int cap;

     public LinkedHashTable(int capacity) {
         cap = capacity;
         buckets = new List[capacity];
         for (int i = 0; i < buckets.length; i++) {
             buckets[i] = new LinkedList<>();
         }
     }

     public void put(String key, Employee value) {
         int pos = hash(key);
         buckets[pos].add(new StoredEmployee(key, value));
     }

     public Employee get(String key) {
         int pos = hash(key);
         for (int i = 0; i < buckets[pos].size(); i++) {
             if (buckets[pos].get(i).key.equals(key)) return buckets[pos].get(i).employee;
         }

         return null;
     }

     public Employee remove(String key) {
         int pos = hash(key);
         List<StoredEmployee> list = buckets[pos];
         int idx = -1;
         for (int i = 0; i < list.size(); i++) {
             if (list.get(i).key.equals(key)) {
                 idx = i;
                 break;
             }
         }

         if (idx == -1) return  null;
         StoredEmployee storedEmployee = list.remove(idx);
         return storedEmployee.employee;
     }

     public void print() {
         for (int i = 0; i < buckets.length; i++) {
             for (StoredEmployee se : buckets[i]) {
                 System.out.println("Pos: " + i + " : " + se.employee);
             }
         }
     }

     private int hash(String key) {
         return key.length() % cap;
     }
}
