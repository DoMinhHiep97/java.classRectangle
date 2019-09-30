import java.util.Scanner;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(){
    }
    private Rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    private double getArea(){
        return this.width*this.height;
    }
    private double getPerimeter(){
        return (this.width+this.height)*2;
    }
    private String display(){
        return "Rectangle{"+"width="+width+", height="+height+"}";
    }
    public static class Ex14_1{
        public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            System.out.print("Enter the width:");
            double width=scanner.nextDouble();
            System.out.print("Enter the height:");
            double height=scanner.nextDouble();
            Rectangle rectangle=new Rectangle(width,height);
            System.out.println("your Rectangle \n"+rectangle.display());
            System.out.println("Perimeter of the Rectangle:"+rectangle.getPerimeter());
            System.out.println("Are of the rectangle:"+rectangle.getArea());

        }
    }
}
