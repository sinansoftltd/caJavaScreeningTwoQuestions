package com.sinansoft.caJavaScreeningTwoQuestions.q1;

import java.util.*;

/**
 * @author Pezhman Jahanmard
 */
public class SortedMap<K, V> implements Iterable<K> {
	private HashMap<K, V> map= new HashMap<>();
	private SortedSet<K> keys;

	public SortedMap() {
		keys = new TreeSet<>();
	}

	public SortedMap(Comparator<K> comparator) {
		keys = new TreeSet<>(comparator);
	}

	public SortedMap add(K key, V value) {
		V oldValue = map.get(key);
		if (oldValue == null) {
			map.put(key, value);
			keys.add(key);
		}

		return this;
	}

	public SortedSet<K> getKeys() {
		return keys;
	}

	public V get(K key) {
		return map.get(key);
	}

	@Override
	public Iterator<K> iterator() {
		return keys.iterator();
	}

	public Iterator<K> reversedIterator() {
		List<Object> list = Arrays.asList(keys.toArray());
		Collections.reverse(list);
		return (Iterator<K>) (list).iterator();
	}

	/*@Override
	public void forEach(Consumer<? super K> action) {
	//TODO
	}

	@Override
	public Spliterator<K> spliterator() {
		return null;
	}*/
}
