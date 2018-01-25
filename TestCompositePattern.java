package compositepattern;

/**
 *
 * @author Aatish-PC
 */
public class TestCompositePattern {
    
    public static void main(String[]args){
        Shape tri = new Triangle();
        Shape sqr= new Square();
        Shape cir = new Circle();

        Drawing drawing1 = new Drawing();
        drawing1.add(tri);
        drawing1.add(sqr);

        Drawing main=  new Drawing();
        main.add(drawing1);
        main.add(cir);

        main.draw("Red");
                                
    }
}
