package entities;

public class Retangulo {

	public double width;
	public double hight;
	
	public double area() {
		return width * hight;
	}
	public double perimeter() {
		return (width * 2) + (hight *2);
	}
	public double diagonal() {
		return Math.sqrt((width * width) + (hight * hight));
	}
	public String toString() {
		return "AREA = " + String.format("%.2f", area()) + "\nPERIMETER = " + String.format("%.2f", perimeter()) + 
		"\nDIAGONAL = " + String.format("%.2f", diagonal());
	}
}
