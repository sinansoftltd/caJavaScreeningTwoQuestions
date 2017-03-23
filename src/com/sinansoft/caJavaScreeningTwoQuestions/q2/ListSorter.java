package com.sinansoft.caJavaScreeningTwoQuestions.q2;

import java.util.*;

/**
 * It takes a list of strings containing integers and words and returns a sorted version of the list.
 * The goal is to sort this list in such a way that all words are in alphabetical order and all integers are in numerical order.
 *
 * Also if the nth element in the list is an integer it must remain an integer, and if it is a word it will remain a word.
 *
 *
 * #### Describing Algorithm: ####
 * We have 3 arrayList to store list of wordList(String), integerList(Integer) and the inputStream(InputType:WORD/INTEGER)
 * Every call to add method will result in adding one item to inputSteam which would be inputType and one item to
 * wordList OR integerList.
 *
 * By calling sort method, wordList and integerList will get sorted, then we iterate through inputStream and pick one from
 * wordList OR integerList based on what type we have stored in inputSteam.
 *
 * We've changed the code to accept duplicates, otherwise we can use SortedSet (TreeSet) for wordList and integerList
 * to avoid duplicates.
 *
 * @author Pezhman Jahanmard
 */
public class ListSorter {
	//We've changed the code to accept duplicates, otherwise we can use SortedSet (TreeSet) to avoid duplicates.
	private ArrayList<String> wordList = new ArrayList<>();
	private ArrayList<Integer> integerList = new ArrayList<>();
	private ArrayList<InputType> inputStream = new ArrayList<>();

	/**
	 * Simply adds item to the list
	 */
	public void add(String item) {
		Integer i = null;
		InputType inputType = InputType.INTEGER;
		try {
			i = Integer.parseInt(item);
		} catch (NumberFormatException e) {
			inputType = InputType.WORD;
		}

		inputStream.add(inputType);
		if (inputType.equals(InputType.INTEGER)) {
			integerList.add(i);
		} else {
			wordList.add(item);
		}
	}

	/**
	 * @return sorted input items
	 */
	public ArrayList<String> sort() {
		ArrayList<String> list = new ArrayList<>();
		Collections.sort(wordList);
		Collections.sort(integerList);

		int wordSetIndex = 0;
		int integerSetIndex = 0;

		for (InputType type : inputStream) {
			if (type.equals(InputType.WORD)) {
				list.add(
						wordList.get(wordSetIndex++));
			} else {
				list.add(
						integerList.get(integerSetIndex++).toString());
			}
		}

		return list;
	}
}
