package ru.itis;

/**
 * 15.03.2018
 * HashMapImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class HashMapImpl<K, V> implements Map<K, V> {

    private V map[];

    public HashMapImpl() {
        map = (V[]) new Object[0];
    }

    private static class Node<Key, Value> {
        Key key;
        Value value;

        public Node() {

        }
    }

    private Node<K, V> map[] = new Node[10];

    @Override
    public void put(K key, V value) {
        int position = Math.abs(key.hashCode() % 10);
        map[position] = value;
    }

    @Override
    public V get(K key) {
        int position = Math.abs(key.hashCode() % 10);
        return map[position];
    }
}
