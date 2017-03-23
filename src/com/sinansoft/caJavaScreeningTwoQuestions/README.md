## Question 1
Create a custom data structure with following characteristics and using data structures already available in java:
1.	Stores keys and values.
2.	Keys are unique
3.	Allows for iteration in the sort order of the key
4.	Allows for iteration in the reverse sort order of the key
5.	Provides near O(1) access time for any given key

Write code for the below cases:
1) Search for an element in the data structure; please ensure that the search is O(1).
2) Return an iterator from the function that iterates through elements in ascending order of keys.
3) Return an iterator that iterates over the elements in descending order of the keys.

Hint: Try to use a combination of various data structures in the java collections.

#### Solution:
We have implemented `SortedMap<K, V>` which is using a HashMap and a SortedSet(TreeSet).<br />
It supports:
- Iteration over items by ascending order of keys
- Iteration over items by descending order of keys
- Find an item as quick as O(1)

To see the usage, please checkout `Q1Usage` class. 

## Question 2
Write a program that takes a list of strings containing integers and words and returns a sorted version of the list. The goal is to sort this list in such a way that all words are in alphabetical order and all integers are in numerical order.  Furthermore, if the nth element in the list is an integer it must remain an integer, and if it is a word it must remain a word. <br />
Example <br />
Input:<br />
car truck 8 4 bus 6 1<br />
Output:<br />
bus car 1 4 truck 6 8

#### Solution:
We have 3 arrayList to store list of `wordList`(String), `integerList`(Integer) and the `inputStream`(InputType:`WORD`/`INTEGER`)
Every call to add method will result in adding one item to _inputSteam_ which would be inputType and one item to
_wordList_ OR _integerList_.

By calling sort method, _wordList_ and _integerList_ will get sorted, then we iterate through _inputStream_ and pick one from
_wordList_ OR _integerList_ based on what type we have stored in _inputSteam_.

We've changed the code to accept duplicates, otherwise we can use SortedSet (TreeSet) for _wordList_ and _integerList_
to avoid duplicates.

To see the usage, please checkout `Q2Usage` class. 