package physics;

public class Vector {

    private double x;
    private double y;
    private double z;
    private static final double EPS = 1e-9;

    public Vector(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public  Vector(double x, double y, double z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector (double x1 , double x2 , double y1 , double y2)
    {
        this.x = x2 - x1;
        this.y = y2 - y1;
    }

    public Vector (double x1 , double x2 , double y1 , double y2, double z1, double z2)
    {
        this.x = x2 - x1;
        this.y = y2 - y1;
        this.z = z2 - z1;
    }

    public double getX()
    {
        return x;
    }

    public double getY()
    {
        return y;
    }

    public double getZ()
    {
        return z;
    }

    public  Vector add(Vector vector2 )
    {
        return new Vector(this.x + vector2.getX(),
                this.y + vector2.getY(),
                this.z + vector2.getZ());
    }

    public Vector sub(Vector vector2 )
    {
        return new Vector(this.x - vector2.getX(),
                this.y - vector2.getY(),
                this.z - vector2.getZ());
    }

    public double magnitude()
    {
        return Math.sqrt(x*x + y*y + z*z);
    }

    public double dotProduct(Vector vector2 )
    {
        return x * vector2.getX()
                + y * vector2.getY() +
                z * vector2.getZ();
    }

    public double dotProduct(Vector vector2 , double angle)
    {
        return this.magnitude() * vector2.magnitude() * Math.cos(angle);
    }

    @Override
    public String toString()
    {
        String jSign = (y < 0)?"" : "+";
        String kSign = (z < 0)?"" : "+";
        return String.format("%.2fî  %s%.2fĵ  %s%.2fk̂\n",x, jSign,  y, kSign, z);
    }

    public void printCompForm()
    {
        System.out.printf("<%.2f  , %.2f  , %.2f>\n", x, y, z);
    }

    public boolean isEqual(Vector v2) {
        return Math.abs(this.x - v2.x) < EPS &&
                Math.abs(this.y - v2.y) < EPS &&
                Math.abs(this.z - v2.z) < EPS;
    }

    public Vector crossProduct(Vector v2)
    {
        double xPrime = this.y * v2.z - this.z * v2.y;
        double yPrime = this.z * v2.x - this.x * v2.z;
        double zPrime = this.x * v2.y - this.y * v2.x;
        return new Vector(xPrime, yPrime, zPrime);
    }

    public double crossProduct(Vector v2, double angle)
    {
        return this.magnitude() * v2.magnitude() * Math.sin(angle);
    }

    public Vector scale(double num)
    {
        return new Vector(this.x * num, this.y * num, this.z * num);
    }

    public double angleBetween(Vector v2)
    {
        double mag1 = this.magnitude();
        double mag2 = v2.magnitude();
        if (mag1 < EPS || mag2 < EPS){
        throw new ArithmeticException("Negative or zero magnitude error");
    }
        return Math.acos(
                this.dotProduct(v2) /
                        (mag1 * mag2)
        );
    }

    public boolean isOrthogonal(Vector v2) {

        return Math.abs(this.dotProduct(v2)) < EPS;
    }

    public Vector unitVector()
    {
        double length = magnitude();
        if (length < EPS){
            throw new ArithmeticException("Vector length zero");
        }
        return new Vector(x/length, y/length, z/length);
    }
}