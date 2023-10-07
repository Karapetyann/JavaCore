package classwork.chapter8;

public class RefDemo {
    public static void main(String[] args) {
        BoxWeight weightbox = new BoxWeight( 3,5, 7, 8.37);
        Box plainbox = new Box();
        double vol;

        vol = weightbox.volume();
        System.out.println("Обем weightbox равен :" + vol);
        System.out.println("вес weightbox равен :" + weightbox.weight);
        System.out.println();

        plainbox = weightbox;
        vol = plainbox.volume();
        System.out.println("Обем plainbox равен :" + vol);
        //System.out.println("вес plainbox равен :" + plainbox.weight);


    }
}
