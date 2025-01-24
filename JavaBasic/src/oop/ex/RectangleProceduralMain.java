package oop.ex;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        int width = 5;
        int height = 8;
        int area = calculateArea(width, height);
        System.out.println("output : " + area);

        int perimeter = calculatePerimeter(width, height);
        System.out.println(perimeter);

        boolean sqare = isSquare(width, height);
        System.out.println(sqare);


    }
    static int calculateArea(int width, int height){
        int area;
        area = width * height;
        return area;
    }
    static int calculatePerimeter(int width, int height){
        int perimeter;
        perimeter = 2 * (width+height);
        return perimeter;
    }
    static boolean isSquare(int width, int height){
        boolean square;
        if (width == height){
            square = true;
        }else {
            square = false;
        }
        return square;
    }
}
