package HW5;

public class IntegerSet02_test {
    public static void main(String[] args) {
        IntegerSet02 set1 = new IntegerSet02();
        IntegerSet02 set2 = new IntegerSet02();

        set1.insertElement(10);
        set1.insertElement(20);
        set1.insertElement(50);
        set2.insertElement(20);
        set2.insertElement(40);

        System.out.println("Set 1: " + set1.toString());
        System.out.println("Set 2: " + set2.toString());

        IntegerSet02 unionSet = IntegerSet02.union(set1, set2);
        System.out.println("Union: " + unionSet.toString());

        IntegerSet02 intersectSet = IntegerSet02.intersection(set1, set2);
        System.out.println("Intersection: " + intersectSet.toString());

        if (set1.isEqualTo(set2)) {
            System.out.println("Set 1 is equal to Set 2");
        } else {
            System.out.println("Set 1 is not equal to Set 2");
        }
    }
}