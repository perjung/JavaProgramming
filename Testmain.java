package HW3;
import java.util.Scanner;

public class Testmain {
	public static final int QUIT = 0;
	
	public static void printMenu() {
		System.out.println();
		System.out.println("*************");
		System.out.println("1. Rectangle ");
		System.out.println("2. Triangle ");
		System.out.println("3. Straight ");
		System.out.println("4. Diamond ");
		System.out.println("5. Diagonal ");
		System.out.println("9.Show All Rectangles");
		System.out.println("8.Show All Triangle");
		System.out.println("7.Show All Straight");
		System.out.println("6.Show All Diamond");
		System.out.println("10.Show All Diagonal");
		System.out.println("11.Print All ");
		System.out.println("12.Delete ");
		System.out.println("0. Quit ");
		System.out.println("*************");
		System.out.println("Enter your choice : ");
	}
	
	public static Rectangle createRect() {
		Rectangle rect;
		int id, length, height;
		char pattern;
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter ID: ");
		id = input.nextInt();
		System.out.print("Enter length: ");
		length = input.nextInt();
		System.out.print("Enter height: ");
		height = input.nextInt();
		System.out.print("Enter pattern ");
		pattern = input.next().charAt(0);
		
		rect = new Rectangle(id, length, height,pattern);
		
		return rect;
	}
	
	public static Triangle createTri() {
		Triangle tri;
		int id, height;
		char pattern;
		Scanner input = new Scanner (System.in);
		
		System.out.print("Enter ID:");
		id = input.nextInt();
		System.out.print("Enter height: ");
		height = input.nextInt();
		System.out.print("Enter pattern ");
		pattern = input.next().charAt(0);
		
		tri = new Triangle(id, height, pattern);
		
		return tri;
	}
	
	public static Straight createStr() {
		Straight str;
		int id, length;
		char pattern;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter ID : ");
		id= input.nextInt();
		System.out.print("Enter length : ");
		length = input.nextInt();
		System.out.print("Enter pattern");
		pattern = input.next().charAt(0);
		
		str = new Straight(id, length,pattern);
		
		return str;
	}
	
	public static Diamond createDia() {
		Diamond dia;
		int id, length;
		char pattern;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter ID : ");
		id = input.nextInt();
		System.out.print("Enter length : ");
		length = input.nextInt();
		System.out.print("Enter pattern");
		pattern = input.next().charAt(0);
		
		dia = new Diamond(id, length, pattern);
		
		return dia;
	}
	
	public static Diagonal createDiag() {
		Diagonal diag;
		int id, length;
		char pattern;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter ID : ");
		id = input.nextInt();
		System.out.print("Enter length : ");
		length = input.nextInt();
		System.out.print("Enter pattern");
		pattern = input.next().charAt(0);
		
		diag = new Diagonal(id, length, pattern);
		
		return diag;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int select;
		Rectangle rect; Triangle tri; Straight str; Diamond dia; Diagonal diag;
		Rectangle[] rectArr = new Rectangle[100];
		Triangle[] triArr = new Triangle[100];
		Straight[] strArr = new Straight[100];
		Diamond[] diaArr = new Diamond[100];
		Diagonal[] diagArr = new Diagonal[100];
		int rectCount = 0, triCount = 0, strCount=0, diaCount=0, diagCount=0;
		
		printMenu();
		
		select = input.nextInt();
		while(select !=QUIT) {
			if(select == 1) {
				rect = createRect();
				rect.draw();
				rectArr[rectCount]= rect;
				rectCount++;
			}
			else if(select == 2) {
				tri = createTri();
				tri.draw();
				triArr[triCount]=tri;
				triCount++;
			}
			else if(select == 3) {
				str= createStr();
				str.draw();
				strArr[strCount]=str;
				strCount++;
			}
			else if(select == 4) {
				dia = createDia();
				dia.draw();
				diaArr[diaCount]= dia;
				diaCount++;
			}
			else if(select == 5) {
				diag = createDiag();
				diag.draw();
				diagArr[diagCount]= diag;
				diagCount++;
			}
			else if(select == 9) {
				for( int i =0; i<rectCount; i++) 
					rectArr[i].draw();
			}
			else if (select == 8) {
				for(int i = 0; i<triCount; i++) 
					triArr[i].draw();
			}
			else if (select == 7) {
				for(int i = 0; i<strCount;i++) 
					strArr[i].draw();
			}
			else if(select == 6) {
				for(int i =0; i<diaCount;i++) 
					diaArr[i].draw();
			}
			else if(select ==10) {
				for(int i=0; i<diagCount; i++) 
					diagArr[i].draw();
			}
			else if(select == 11) {
				for( int i =0; i<rectCount; i++) 
					rectArr[i].draw();
				for(int i = 0; i<triCount; i++) 
					triArr[i].draw();
				for(int i = 0; i<strCount;i++) 
					strArr[i].draw();
				for(int i =0; i<diaCount;i++) 
					diaArr[i].draw();
				for(int i=0; i<diagCount; i++) 
					diagArr[i].draw();
			}
			else if(select == 12) {
				rectCount = 0;
				triCount = 0;
				strCount = 0;
				diaCount = 0;
				diagCount = 0;
				
			}
			printMenu();
			select = input.nextInt();
		}
		System.out.println("Bye!!");
	}
}
