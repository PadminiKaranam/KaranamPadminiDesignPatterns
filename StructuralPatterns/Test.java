package Structural;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape tri = new Triangle();
		Shape tri1 = new Triangle();
		Shape cir = new Circle();
		
		Draw drawing = new Draw();
		drawing.add(tri1);
		drawing.add(tri1);
		drawing.add(cir);
		
		drawing.drawShape("Red");
		
		drawing.clear();
		
		drawing.add(tri);
		drawing.add(cir);
		drawing.drawShape("Green");

	}

}
