import java.util.*;
class rectangle {
    double length;
    double breadth;
    double area;
}
public class OOPS{
    public static void main(String args[]){
        rectangle r1 = new rectangle();
        r1.length = 4;
        r1.breadth = 2.5;
        r1.area =  r1.length *  r1.breadth;
        System.out.println(r1.area);
    }
}