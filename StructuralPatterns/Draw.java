package Structural;

import java.util.ArrayList;
import java.util.List;

public class Draw implements Shape{
private List<Shape> shapes = new ArrayList<Shape>();
	
	@Override
	public void drawShape(String fillColor) {
		for(Shape sh : shapes)
		{
			sh.drawShape(fillColor);
		}
	}
	
	//adding shape to drawing
	public void add(Shape s){
		this.shapes.add(s);
	}
	
	//removing shape from drawing
	public void remove(Shape s){
		shapes.remove(s);
	}
	
	//removing all the shapes
	public void clear(){
		System.out.println("Clearing all the shapes");
		this.shapes.clear();
	}

}
