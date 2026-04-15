package HW5;

public class IntegerSet_test {
	public static void main(String[] args) {
		IntegerSet set1 = new IntegerSet();
		IntegerSet set2 = new IntegerSet();
		
		set1.insertElement(1);
		set1.insertElement(5);
		set1.insertElement(70);
		set2.insertElement(1);
		set2.insertElement(70);
		set2.insertElement(99);
		
		System.out.println("Set 1 : "+set1);
		System.out.println("Set 2 : "+set2);
		
		IntegerSet unionSet = IntegerSet.union(set1,set2);
		System.out.println("union : "+unionSet);
		
		IntegerSet interSet = IntegerSet.intersection(set1, set2);
		System.out.println("Intersection : "+interSet);
	}
}
