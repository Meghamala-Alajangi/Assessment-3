package Assessment;

public class TeacherTester {
	public static void main(String[] args) {
		Teacher teacher1 = new Teacher("Alex", "Java Fundamentals", 1200L);
	    Teacher teacher2 = new Teacher("John", "RDBMS", 800L);
	    Teacher teacher3 = new Teacher("Sam", "Networking", 900L);
	    Teacher teacher4 = new Teacher("Maria", "Python", 900L);

	    System.out.println(teacher1);
	    System.out.println(teacher2);
	    System.out.println(teacher3);
	    System.out.println(teacher4);
    }
}
