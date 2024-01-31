abstract class Shape implements Drawable {

    public void displayShapeType() {
        System.out.println("Type: " + getClass().getSimpleName());
    }
}