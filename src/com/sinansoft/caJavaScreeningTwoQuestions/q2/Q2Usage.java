package com.sinansoft.caJavaScreeningTwoQuestions.q2;

/**
 * @author Pezhman Jahanmard
 */
public class Q2Usage {
	private ListSorter listSorter;

	public static void runAll() {
		Q2Usage q2Usage = new Q2Usage();
		q2Usage.printSortedList();
	}

	private Q2Usage() {
		listSorter = new ListSorter();
		listSorter.add("car");
		listSorter.add("truck");
		listSorter.add("8");
		listSorter.add("4");
		listSorter.add("bus");
		listSorter.add("6");
		listSorter.add("1");
	}

	private void printSortedList() {
		System.out.println(listSorter.sort());
	}
}
