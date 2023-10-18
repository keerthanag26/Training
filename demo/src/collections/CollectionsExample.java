package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsExample {
	// ArrayList

	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<String>();

		/// ADD elements
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");

		/// Access an element
		cars.get(0);

		/// change an element
		cars.set(0, "Benz");

		/// remove an element
		cars.remove(0);

		/// size of list

		cars.size();

		/// search

		cars.contains("BMW");

		/// Traversing list using Iterator

		System.out.println("LIST");
		Iterator itr = cars.iterator();

		while (itr.hasNext()) {

			System.out.println(itr.next());

		}

		// LinkedList
		LinkedList<String> ll = new LinkedList<String>();

		ll.add("Ravi");
		ll.add("Vijay");
		ll.add("Ajay");
		ll.add("Anuj");
		ll.add("Gaurav");
		ll.add("Harsh");
		ll.add("Virat");
		ll.add("Gaurav");
		ll.add("Harsh");
		ll.add("Amit");

		System.out.println("Initial list of elements: " + ll);

		// Removing specific element from linkedlist

		ll.remove("Vijay");

		System.out.println("After invoking remove(object) method: " + ll);

		// Removing element on the basis of specific position

		ll.remove(0);

		System.out.println("After invoking remove(index) method: " + ll);

		LinkedList<String> ll2 = new LinkedList<String>();

		ll2.add("Ravi");

		ll2.add("Hanumat");

		// Adding new elements to arraylist

		ll.addAll(ll2);

		System.out.println("Updated list : " + ll);

		// Removing all the new elements from arraylist
		ll.addFirst("Ravi");
		ll.addLast("Manju");
		System.out.println("Updated list : " + ll);
		ll.removeAll(ll2);

		System.out.println("After invoking removeAll() method: " + ll);

		// Removing first element from the list

		ll.removeFirst();

		System.out.println("After invoking removeFirst() method: " + ll);

		// Removing first element from the list

		ll.removeLast();

		System.out.println("After invoking removeLast() method: " + ll);

		// Removing first occurrence of element from the list

		ll.removeFirstOccurrence("Gaurav");

		System.out.println("After invoking removeFirstOccurrence() method: " + ll);

		// Removing last occurrence of element from the list

		ll.removeLastOccurrence("Harsh");

		System.out.println("After invoking removeLastOccurrence() method: " + ll);

		// Removing all the elements available in the list

		ll.clear();

		System.out.println("After invoking clear() method: " + ll);

		// LIST

		List<String> al = new ArrayList<String>();

		al.add("Amit");

		al.add("Vijay");

		al.add("Kumar");

		al.add(1, "Sachin");
		Collections.sort(al);

		ListIterator<String> itr1 = al.listIterator();

		System.out.println("Traversing elements in forward direction");

		while (itr1.hasNext()) {

			System.out.println("index:" + itr1.nextIndex() + " value:" + itr1.next());

		}

		System.out.println("Traversing elements in backward direction");

		while (itr1.hasPrevious()) {
			if((itr1.previous()).equals("Sachin")) {
				itr1.set("Anu");
			}
		}
		for(String str : al) {
			System.out.println(str);
		}
//		while(itr1.hasPrevious()) {
//			System.out.println("index:" + itr1.previousIndex() + " value:" + itr1.previous());
//		}

//	HASHSET - DOES NOT MAINTAIN INSERTION ORDER, UNIQUE ELEMENTS

//	LINKEDHASHSET - MAINTAIN INSERTION ORDER, UNIQUE ELEMENTS
		System.out.println("\n\nSET");

		Set<String> set = new HashSet<String>();

		set.add("Ravi");

		set.add("Vijay");

		set.add("Arun");

		set.add("Sumit");

		set.add("Sumit");

		System.out.println("An initial list of elements: " + set);

		// Removing specific element from HashSet

		set.remove("Ravi");

		System.out.println("After invoking remove(object) method: " + set);

		HashSet<String> set1 = new HashSet<String>();

		set1.add("Ajay");

		set1.add("Gaurav");

		set.addAll(set1);

		System.out.println("Updated Set: " + set);

		// Removing all the new elements from HashSet

		set.removeAll(set1);

		System.out.println("After invoking removeAll() method: " + set);

		// Removing elements on the basis of specified condition

		set.removeIf(str -> str.contains("Vijay"));

		System.out.println("After invoking removeIf() method: " + set);

		// Removing all the elements available in the set

		set.clear();

		/// TREESET -- unique, 

		TreeSet<String> set2 = new TreeSet<String>();

		set2.add("A");

		set2.add("B");

		set2.add("C");

		set2.add("D");

		set2.add("E");

		set2.add("D");

		set2.add("E");
		System.out.println("Intial Set: " + set2);

		System.out.println("Head Set: " + set2.headSet("C"));

		System.out.println("SubSet: " + set2.subSet("A", "E"));

		System.out.println("TailSet: " + set2.tailSet("C"));

		// QUEUE

		System.out.println("QUEUE");
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

		// add
		queue.add(10);
		queue.add(3);
		queue.add(11);
		queue.add(1);
		queue.add(4);

		// peek - obtain head of queue
		System.out.println("QUeue: " + queue);
		queue.peek(); // --1

		// poll - remove the head
		queue.poll(); // --boolean

		queue.peek(); // --3
		System.out.println("QUeue: " + queue);

		/// HASHMAP

		System.out.println("\n\n\nMAP");
		Map<Integer, String> map = new HashMap<Integer, String>();

		// Creating HashMap

		map.put(1, "Mango");
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(1, "Grapes"); // trying duplicate key

		System.out.println("Iterating Hashmap...");

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());

		}

		// SET - NO DUPLICATE ELEMENT
		// hashset treeset
		
		List<Person> persons = new ArrayList<>();
		Person person = new Person("Anu",23,52,155);
		Person person1 = new Person("Ravi",23,52,155);
		Person person2 = new Person("Varsha",23,52,155);
		
		persons.add(person2);
		persons.add(person1);
		persons.add(person);
		for(Person per : persons) {
			System.out.println(per);
		}
	}

}
