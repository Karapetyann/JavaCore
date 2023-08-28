package classwork.chapter3;

public class ThreeDMatrix {
    public static void main(String[] args) {
        int[][][] threed = new int[3][4][5];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    threed[i][j][k] = i* j* k;

                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 5; k++) {
                    System.out.print(threed[i][j][k]+" ");
                }
                System.out.println();
            }
        }
    }
}
