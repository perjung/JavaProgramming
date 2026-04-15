package HW5;

public class IntegerSet {
	private boolean[] a = new boolean[101];
	public IntegerSet() {
		
	}
	
	public void insertElement (int k ) {
		if(k>= 0&&k<=100) {
			a[k] = true;
		}
	}
	
	public void deleteElement(int k) {
		if(k>=0&&k<=100) {
			a[k] = false;
		}
	}
	
	public static IntegerSet union(IntegerSet set1, IntegerSet set2) {
		IntegerSet result = new IntegerSet();
		
		for( int i=0; i<=100;i++) {
			if(set1.a[i]||set2.a[i]) {
				result.a[i] = true;
			}
		}
		
		return result; 
	}
	
	public static IntegerSet intersection(IntegerSet set1, IntegerSet set2) {
		IntegerSet result = new IntegerSet();
		
		for(int i=0; i<= 100; i++) {
			if(set1.a[i]&&set2.a[i]) {
				result.a[i]=true;
			}
		}
		
		return result;
	}
	
	public String toString() {
		String result = "";
		boolean isEmpty = true;
		
		for( int i=0; i<=100; i++) {
			if(a[i]) {
				result +=i+" ";
				isEmpty = false;
			}
		}
		return isEmpty ? "---" : result; 
	}
	
	public boolean isEqualTo(IntegerSet otherSet) {
		for( int i= 0; i<= 100; i++) {
			if( this.a[i] != otherSet.a[i])
				return false;
		}
		return true;
	}
}
