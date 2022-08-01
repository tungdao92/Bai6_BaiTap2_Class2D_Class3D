import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Lop2d lop1111 = new Lop2d(2,3);
        System.out.println(lop1111);
        Lop3d lop33333 = new Lop3d(lop1111.getX(), lop1111.getY(), 4);
        System.out.println(lop33333);
        System.out.println(Arrays.toString(lop33333.getXYZ()));
        lop33333.toString();

    }
}