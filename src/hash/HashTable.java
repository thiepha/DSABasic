package hash;

public class HashTable {
    private StoredEmployee buckets[];
    private int cap;
    private int size;

    public HashTable(int capacity) {
        this.cap = capacity;
        buckets = new StoredEmployee[capacity];
    }

    public void put(String key, Employee employee) throws Exception {
        if (key == null) throw new NullPointerException("Key is null");
        int pos = key.length() % cap;
        int lastPos = (pos - 1) % cap;
        while (buckets[pos] != null && pos != lastPos) {
            pos = (pos + 1) % cap;
        }
        if (buckets[pos] != null) {
            throw new Exception("Cannot put new data");
        }
        buckets[pos] = new StoredEmployee(key, employee);
    }

    public Employee get(String key) {
        if (key == null) return null;
        int pos = key.length() % cap;
        int lastPos = (pos - 1) % cap;
        while (pos != lastPos &&
                (buckets[pos] == null || !buckets[pos].key.equals(key))) {
            pos = (pos + 1) % cap;
        }
        if (buckets[pos] == null || !buckets[pos].key.equals(key)) {
            return null;
        }

        return buckets[pos].employee;
    }

    public Employee remove(String key) throws Exception {
        if (key == null) return null;
        int pos = (key.length() % cap);
        int lastPos = (pos - 1) % cap;
        while (pos != lastPos &&
                (buckets[pos] == null || !buckets[pos].key.equals(key))) {
            pos = (pos + 1) % cap;
        }
        if (buckets[pos] == null || !buckets[pos].key.equals(key)) {
            return null;
        }
        Employee employee = buckets[pos].employee;
        buckets[pos] = null;

        StoredEmployee[] oldBuckets = buckets;
        buckets = new StoredEmployee[cap];
        for (int i = 0; i < cap; i++) {
            if (oldBuckets[i] != null) {
                put(oldBuckets[i].key, oldBuckets[i].employee);
            }
        }

        return employee;
    }

    public void print() {
        for (int i = 0; i < cap; i++) {
            if (buckets[i] != null) {
                System.out.println("pos: " + i + ": " + buckets[i].employee);
            }
        }
        System.out.println(" ------------------ ");
    }
}
