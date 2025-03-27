import java.util.SortedSet;

public class Main {
    public static void main(String[] args) {
            Point p = new Point(3, 4);
//            Rectangle r1 = new Rectangle(p, 3, 4);
        /*System.out.println(r1.counterforobject);
        System.out.println(Rectangle.counter);
        Rectangle r2 = new Rectangle(p, 5, 6);
        System.out.println(r1.counterforobject);
        System.out.println(r2.counterforobject);
        System.out.println(Rectangle.counter);
        System.out.println(Integer.max(3,4));
        System.out.println(Integer.parseInt("1"));
        String a = new String("aaa");
        System.out.println(a);
        System.out.println(r1);
        */
        Triangle myTriangle = new Triangle("Red", 5.0, 3.0);

        // Print triangle info
        System.out.println("Triangle Info:");
        System.out.println(myTriangle);
        System.out.println("Area: " + myTriangle.getArea());

        // Change properties
        myTriangle.setColor("Blue");
        System.out.println("\nUpdated color: " + myTriangle.getColor());


    }
}