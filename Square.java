package compositepattern;

/**
 *
 * @author Aatish-PC
 */
public class Square implements Shape{

    @Override
    public void draw(String fillColor) {
        System.out.println("Drawing Square with color " + fillColor);
    }
    
}
