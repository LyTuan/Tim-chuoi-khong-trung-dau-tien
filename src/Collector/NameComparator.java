package Collector;

import java.util.Comparator;

public class NameComparator implements Comparator {
	
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Student s1 = (Student)o1;
		Student s2 = (Student)o2;
		return s1.getName().compareTo(s2.getName());
	}
}
