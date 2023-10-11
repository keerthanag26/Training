package encapsulation;

public class EncapsulationEx {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("vijay");
		s.setId(101);
		System.out.println("Name : "+s.getName()+" Id : "+s.getId());
	}
}
