package HW3;

public class Straight {
	private int id;
	private int length;
	private char pattern;
	
	public Straight() {
		length =5;
		pattern = '*';
	}
	
	public Straight(int _id, int len, char p) {
		this.id = _id;
		this.length = len;
		this.pattern = p;
	}
	
	public String toString() {
		String str;
		str = "Straight"+id+"("+length+","+pattern+")";
		
		return str;
	}

	
	public void draw() {
		for(int i= 0; i<length; i++)
			System.out.print(pattern);
	}
	
	public char getPattern() {
		return pattern;
	}
	public void setPattern(char pattern) {
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
