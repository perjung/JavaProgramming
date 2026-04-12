package HW3;

public class Diagonal {
	private int id;
	private int length;
	private char pattern;
	
	public Diagonal() {
		length = 5;
		pattern = '*';
	}
	
	public Diagonal(int _id, int len,char p) {
		this.id= _id;
		this.length = len;
		this.pattern= p;
	}
	
	public String toStirng() {
		String str;
		str = "Diagonal"+id+"("+length+","+pattern+")";
		
		return str;
	}
	
	public void draw() {
		for(int i=0; i<length; i++) {
			for(int j = 0; j<length; j++) {
				if(i==j)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public char getPattern() {
		return pattern;
	}
	public void setPattern (char pattern) {
		this.pattern = pattern;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
}
