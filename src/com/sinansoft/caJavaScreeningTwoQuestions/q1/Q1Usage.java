package com.sinansoft.caJavaScreeningTwoQuestions.q1;

import java.util.Iterator;

public class Q1Usage {
	SortedMap<String, String> sortedMap;

	private Q1Usage() {
		sortedMap = new SortedMap<String, String>() {{
			add("C", "three");
			add("B", "two");
		}};

		//add some items in old way!
		sortedMap
				.add("A", "one")
				.add("E", "twelve")
				.add("D", "ten");
	}

	/**
	 * Start point! only visible method from outside.
	 */
	public static void runAll() {
		Q1Usage q1Usage = new Q1Usage();
		q1Usage.printListOfKeys();
		q1Usage.printItems();
		q1Usage.printItemsReversedOrder();
	}

	/**
	 * Prints out list of keys in their sorted order
	 */
	private void printListOfKeys() {
		System.out.println("---------- list of keys:");
		System.out.println(sortedMap.getKeys());
	}

	/**
	 * Prints out available items in ascending order
	 */
	private void printItems() {
		System.out.println("---------- iterate through items:");
		for (String key : sortedMap) {
			System.out.println(
					sortedMap.get(key));
		}
	}

	/**
	 * Prints out available items in descending order
	 */
	private void printItemsReversedOrder() {
		System.out.println("---------- iterate through items (reversed order):");
		Iterator<String> reversedIterator = sortedMap.reversedIterator();
		while (reversedIterator.hasNext()) {
			System.out.println(
					sortedMap.get(reversedIterator.next()));
		}
	}
}