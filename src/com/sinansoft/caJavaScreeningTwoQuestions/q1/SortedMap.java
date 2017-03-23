package com.sinansoft.caJavaScreeningTwoQuestions.q1;

import java.util.*;

/**
 * SortedMap provides:
 * - Iteration over items by ascending order of keys
 * - Iteration over items by descending order of keys
 * - Find an item as quick as O(1)
 *
 * @author Pezhman Jahanmard
 */
public class SortedMap<K, V> implements Iterable<K> {
	private HashMap<K, V> map = new HashMap<>();
	private SortedSet<K> keys;

	public SortedMap() {
		keys = new TreeSet<>();
	}

	/**
	 * @param comparator You can pass it for the TreeSet, otherwise use the other constructor
	 */
	public SortedMap(Comparator<K> comparator) {
		keys = new TreeSet<>(comparator);
	}

	/**
	 * If key not exists, will add to the list
	 * @return self
	 */
	public SortedMap add(K key, V value) {
		V oldValue = map.get(key);
		if (oldValue == null) {
			map.put(key, value);
			keys.add(key);
		}

		return this;
	}

	/**
	 * Looks for an item in list as quick as O(1)
	 *
	 * @return found item
	 */
	public V get(K key) {
		return map.get(key);
	}

	/**
	 * Returns list of keys, changes to this list will not affect to original list
	 */
	public List<K> getKeys() {
		return keysAsList();
	}

	/**
	 * @return Iterator based on keys
	 */
	@Override
	public Iterator<K> iterator() {
		return keys.iterator();
	}

	/**
	 * @return Iterator based on keys by reverse order
	 */
	public Iterator<K> reversedIterator() {
		List<Object> list = keysAsList();
		Collections.reverse(list);
		return (Iterator<K>) (list).iterator();
	}

	private List keysAsList() {
		return Arrays.asList(keys.toArray());
	}
}
