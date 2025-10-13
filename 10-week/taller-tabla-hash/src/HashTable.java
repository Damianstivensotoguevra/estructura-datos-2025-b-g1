public class HashTable<K, V> {

    private Entry<K, V>[] buckets;
    private int capacity;
    private int size;

    @SuppressWarnings("unchecked")
    public HashTable(int capacity) {
        this.capacity = capacity;
        /*creamos un arreglo de Entry sin tipos por limitación de Java*/
        this.buckets = (Entry<K, V>[]) new Entry[capacity];
        this.size = 0;
    }

    private int indexFor(K key) {
        return Math.abs(key.hashCode()) % capacity;
    }

    public V put(K key, V value) {
        int idx = indexFor(key);
        Entry<K, V> head = buckets[idx];

        /*verificar si ya existe la clave*/
        for (Entry<K, V> cur = head; cur != null; cur = cur.next) {
            if (cur.key.equals(key)) {
                V old = cur.value;
                cur.value = value;
                return old;
            }
        }

        /*insertar nueva entrada al inicio de la lista*/
        buckets[idx] = new Entry<>(key, value, head);
        size++;
        return null;
    }

    public V get(K key) {
        int idx = indexFor(key);
        for (Entry<K, V> cur = buckets[idx]; cur != null; cur = cur.next) {
            if (cur.key.equals(key)) {
                return cur.value;
            }
        }
        return null;
    }

    public V remove(K key) {
        int idx = indexFor(key);
        Entry<K, V> cur = buckets[idx];
        Entry<K, V> prev = null;

        while (cur != null) {
            if (cur.key.equals(key)) {
                if (prev == null) {
                    buckets[idx] = cur.next;
                } else {
                    prev.next = cur.next;
                }
                size--;
                return cur.value;
            }
            prev = cur;
            cur = cur.next;
        }
        return null;
    }

    public boolean containsKey(K key) {
        return get(key) != null;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{ ");
        for (int i = 0; i < capacity; i++) {
            Entry<K, V> cur = buckets[i];
            if (cur != null) {
                sb.append("[");
                while (cur != null) {
                    sb.append(cur.key).append("=").append(cur.value);
                    if (cur.next != null) sb.append(" -> ");
                    cur = cur.next;
                }
                sb.append("] ");
            }
        }
        sb.append("}");
        return sb.toString();
    }
}
