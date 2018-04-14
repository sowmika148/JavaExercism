/***
 * Understands a 4 side closed figure.
 */
class Rectangle {
    private int length;
    private int breadth;

    Rectangle(int length, int breadth) {
        this.breadth = breadth;
        this.length = length;
    }

    int calculateArea() {
        return this.length * this.breadth;
    }
}
