//Ivan
public class Rectangle {

    public int width;
    public int length;
    public int area;
    public int perimeter;

    public void setInfo (int rWidth, int rLength){

        width = rWidth;
        length = rLength;
        area = rWidth * rLength;
        perimeter = rWidth * 2 + rLength * 2;


    }
    public void calculateArea (){
        System.out.println("Area is : " + area);
    }
    public void calculatePerimeter () {
        System.out.println("Perimeter is : " + perimeter);
    }

    public void getInfo(){
        System.out.println("Rectangle Dimensions");
        System.out.println("Width : " + width);
        System.out.println("Length : " + length );
        System.out.println("Area : " + area);
        System.out.println("Perimeter : " + perimeter);
    }

}
