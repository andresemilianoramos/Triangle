public class triangle
{
    private Point v1;
    private Point v2;
    private Point v3;

    public triangle(int x1, int y1, int x2, int y2, int x3, int y3)
    {
        this.v1 = new Point(x1, y1);
        this.v2 = new Point(x2, y2);
        this.v3 = new Point(x3, y3);
    }

    public triangle(Point v1, Point v2, Point v3)
    {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public double getPerimeter()
    {
        return v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
    }

    public void printType()
    {
        if (v1.distance(v2) == v2.distance(v3) && v2.distance(v3) == v3.distance(v1))
        {
            System.out.println("equilateral");
        }
        else if (v1.distance(v2) == v2.distance(v3) || v2.distance(v3) == v3.distance(v1) || v3.distance(v1) == v1.distance(v2))
        {
            System.out.println("isosceles");
        }
        else
        {
            System.out.println("scalene");
        }
    }

    public String toString()
    {
        return "Triangle @ ("+ v1.getX() + ", " + v1.getY() + "), (" + v2.getX() + ", " + v2.getY() + "), (" + v3.getX() + ", " + v3.getY() + ")";
    }
}