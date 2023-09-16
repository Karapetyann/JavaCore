package classwork.chapter6;

public class Box {
    double width;
    double height;
    double depth;




    double volume(){
        return width * height * depth;
    }

    Box(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }
}
