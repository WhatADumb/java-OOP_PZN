public class ShapeApp {
    public static void main(String[] args) {
        var shape = new Shape();
        System.out.println("Shape Corner: " + shape.getCorner());

        var rec = new Rectangle();
        System.out.println("Rectangle Corner: " + rec.getCorner());
        System.out.println("Parant Class Rectangle Corner: " + rec.getParentCorner());
    }
}
