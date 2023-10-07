package classwork.chapter8;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight mybox3 = new BoxWeight();
        BoxWeight mycube = new BoxWeight(3, 2);
        BoxWeight myclone = new BoxWeight(mybox1);
        double vol = mybox1.volume();
        System.out.println("Обем mybox1 равен :" + vol);
        System.out.println();
        System.out.println("вес myBox1 равен :" + mybox1.weight);
        System.out.println();
        vol = mybox2.volume();
        System.out.println("Обем mybox2 равен :" + vol);
        System.out.println();
        System.out.println("вес myBox2 равен :" + mybox2.weight);
        System.out.println();
        vol = mybox3.volume();
        System.out.println("Обем mybox3 равен :" + vol);
        System.out.println();
        System.out.println("вес myBox3 равен :" + mybox3.weight);
        System.out.println();
        vol = myclone.volume();
        System.out.println("Обем myclone равен :" + vol);
        System.out.println();
        System.out.println("вес myclone равен :" + myclone.weight);
        System.out.println();
        vol = mycube.volume();
        System.out.println("Обем mycube равен :" + vol);
        System.out.println();
        System.out.println("вес mycube равен :" + mycube.weight);
        System.out.println();


    }
}
