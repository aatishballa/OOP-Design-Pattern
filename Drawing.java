package compositepattern;

import java.util.ArrayList;

/**
 *
 * @author Aatish-PC
 */
public class Drawing implements Shape {
    
    private ArrayList<Shape> shapes= new ArrayList();
    
    public void add(Shape s){
        this.shapes.add(s);
    }
    
    public void remove(Shape s){
        this.shapes.remove(s);
    }
    
    public void clear(){
        System.out.println("Clearing all the shapes from drawing");
        this.shapes.clear();
    }
    
    @Override
    public void draw(String fillColor) {
        for(Shape s: shapes){
            s.draw(fillColor);
        }
    }
    
}
