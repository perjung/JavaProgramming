package HW3;

public class Diamond {
	private int id;
	private int length;
	private char pattern;
	
	public Diamond() {
		length = 5;
		pattern = '*';
	}
	
	public Diamond(int _id, int len, char p) {
		this.id =_id;
		this.length = len;
		this.pattern = p;
	}
	
	public String toString() {
		String str;
		str = "Diamond"+id+"("+length+","+pattern+")";
		
		return str;
	}
	
	public void draw () {
		 for (int i = 1; i <= length; i++) {
		        for (int j = 1; j <= length - i; j++)
		            System.out.print(" ");
		        for (int j = 1; j <= 2 * i - 1; j++)
		            System.out.print(pattern);
		        System.out.println();
		    }

		 for (int i = length - 1; i >= 1; i--) {
			 for (int j = 1; j <= length - i; j++) 
				 System.out.print(" ");
		     for (int j = 1; j <= 2 * i - 1; j++) 
		    	 System.out.print(pattern);

		     System.out.println();
		    }
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
	public int getlength() {
		return length;
	}
	public void setlength(int length) {
		this.length = length;
	}
	
}
