public class TestTriangle {

    public static void main(String[] args)
    {
        triangle t1 = new triangle(1, 2, 3, 4, 2, 1);
        triangle t2 = new triangle(new Point(0, 0), new Point(1, 1), new Point(-1, -1));
        System.out.println(t1);
        System.out.println(t1.getPerimeter());
        t1.printType();
        System.out.println("============================");
        System.out.println(t2);
        System.out.println(t2.getPerimeter());
        t2.printType();
    }
}