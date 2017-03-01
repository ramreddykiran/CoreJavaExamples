package comparatorsorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorStudentSort {
	public static void main(String args[]) {
		List<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));
		nameSorting(al);
		ageSorting(al);
		rollnoSorting(al);
	}

	private static void rollnoSorting(List<Student> al) {
		System.out.println("rollnoSorting");
		Collections.sort(al, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return (s1.getRollno()< s2.getRollno()) ? -1 : (s1.getRollno()> s2.getRollno()) ? 1: 0 ;
			}
		});
		for (Student st : al) {
			System.out.println(st.getAge() + " " + st.getName() + " "
					+ st.getRollno());
		}
	}

	private static void ageSorting(List<Student> al) {
		System.out.println("ageSorting");
		Collections.sort(al, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return (s1.getAge()< s2.getAge()) ? -1 : (s1.getAge()> s2.getAge()) ? 1: 0 ;
			}
		});
		for (Student st : al) {
			System.out.println(st.getAge() + " " + st.getName() + " "
					+ st.getRollno());
		}

	}

	private static void nameSorting(List<Student> al) {
		System.out.println("nameSorting");
		// sorting based on name
		Collections.sort(al, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s1.getName().compareTo(s2.getName());
			}
		});
		for (Student st : al) {
			System.out.println(st.getAge() + " " + st.getName() + " "
					+ st.getRollno());
		}
	}
}