public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return this.width *this.length;
    }
    public double getDiagonal(){
        return Math.sqrt(this.width* this.width + this.length*this.length);
    }
    public boolean isSquare(){
        if(this.width==this.length){
            return true;
        }else{
            return false;
        }
    }

}
