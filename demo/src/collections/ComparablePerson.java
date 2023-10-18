package collections;

public class ComparablePerson extends Person implements Comparable<Person> {
	public ComparablePerson(String name, int age) { // constructor
		super(name, age);
	}

	// Order by the name strings, case insensitive
	@Override
	public int compareTo(Person p) {
		return this.getName().compareTo(p.getName()); // via String's compareToIgnoreCase()
	}
}
