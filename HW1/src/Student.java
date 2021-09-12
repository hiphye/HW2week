import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{
	int no;
	String name;
	int age;
	
	public Student(int i, String string, int j) {
		no =i;
		name = string;
		age = j;
	}

	@Override
	public int compareTo(Student o) { 
		// 오름차순
		return name.compareTo(o.name);	
	}

 public static void main(String args[]) {
	 
	 List<Student> al =new ArrayList<Student>();
	 System.out.println("Student List (ordered by name)");
	 Student s1 = new Student(101,"Kim",23);
	 al.add(s1);
	 Student s2 = new Student(102,"Elen",23);
	 al.add(s2);
	 Student s3 = new Student(103,"Park",23);
	 al.add(s3);
	 Student s4 = new Student(104,"Lee",23);
	 al.add(s4);
	 Student s5 = new Student(105,"Tony",23);
	 al.add(s5);
	 Student s6 = new Student(106,"Stark",23);
	 al.add(s6);
	 Student s7 = new Student(107,"Ularf",23);
	 al.add(s7);
	 Student s8 = new Student(108,"Udir",23);
	 al.add(s8);
	 Student s9 = new Student(109,"Amumu",23);
	 al.add(s9);
	 Student s10 = new Student(111,"Elsa",23);
	 al.add(s10);
	 
	 Collections.sort(al);
	 
	 for (Student s : al) {
		 System.out.println(s.toString());
	 }
	System.out.println("Student List (reverse ordered by name)");
	
	Collections.sort(al, Collections.reverseOrder());
	
	for(int i=0; i<al.size(); i++) {
		System.out.println(al.get(i).toString());
	}
 }

@Override
public String toString() {
	return "Student [no=" + no + ", name=" + name + ", age=" + age + "]";
}
 }
