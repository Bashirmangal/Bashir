package day1;

public class SwitchH {    // here project requirment is to hava char

	public static void main(String[] args) {
		char color = 'r';
		switch (color) {
		case 'r':;
			System.out.println("My favorite color is Red");
			break;

		case 'b':;
			System.out.println("Blue");
			break;

		case 'g':;
			System.out.println("Green");
			break;

		default:
			System.out.println("My favorite color is :" + color);
			break;
		}
	}

}
