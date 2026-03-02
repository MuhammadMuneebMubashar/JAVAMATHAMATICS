package physics;

public class Vector {

    private Coordinate coordinate;
    private static final double EPS = 1e-9;

    public Vector(double x, double y)
    {
        coordinate = new Coordinate(x, y);
    }

    public  Vector(double x, double y, double z)
    {
        coordinate = new Coordinate(x, y);
    }

    public Vector (double x1 , double x2 , double y1 , double y2)
    {
        coordinate = new Coordinate(x2 - x1, y2 - y1);
    }

    public Vector (double x1 , double x2 , double y1 , double y2, double z1, double z2)
    {
        coordinate = new Coordinate(x2 - x1, y2 - y1,  z2 - z1);
    }

    public double getX()
    {
        return coordinate.getX();
    }

    public double getY()
    {
        return coordinate.getY();
    }

    public double getZ()
    {
        return coordinate.getZ();
    }

    public  Vector add(Vector vector2 )
    {
        return new Vector(this.getX() + vector2.getX(),
                this.getY() + vector2.getY(),
                this.getZ() + vector2.getZ());
    }

    public Vector sub(Vector vector2 )
    {
        return new Vector(this.getX() - vector2.getX(),
                this.getY() - vector2.getY(),
                this.getZ() - vector2.getZ());
    }

    public double magnitude()
    {
        double x = this.getX();
        double y = this.getY();
        double z = this.getZ();

        return Math.sqrt(x*x + y*y + z*z);
    }

    public double dotProduct(Vector vector2 )
    {
        double x = this.getX();
        double y = this.getY();
        double z = this.getZ();

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
        double x = this.getX();
        double y = this.getY();
        double z = this.getZ();

        String jSign = (y < 0)?"" : "+";
        String kSign = (z < 0)?"" : "+";
        return String.format("%.2fî  %s%.2fĵ  %s%.2fk̂\n",x, jSign,  y, kSign, z);
    }

    public void printCompForm()
    {
        double x = this.getX();
        double y = this.getY();
        double z = this.getZ();

        System.out.printf("<%.2f  , %.2f  , %.2f>\n", x, y, z);
    }

    public boolean isEqual(Vector v2) {
        return Math.abs(this.getX() - v2.getX()) < EPS &&
                Math.abs(this.getY() - v2.getY()) < EPS &&
                Math.abs(this.getZ() - v2.getZ()) < EPS;
    }

    public Vector crossProduct(Vector v2)
    {
        double xPrime = this.getY() * v2.getZ() - this.getZ() * v2.getY();
        double yPrime = this.getZ() * v2.getX() - this.getX() * v2.getZ();
        double zPrime = this.getX() * v2.getY() - this.getY() * v2.getX();
        return new Vector(xPrime, yPrime, zPrime);
    }

    public double crossProduct(Vector v2, double angle)
    {
        return this.magnitude() * v2.magnitude() * Math.sin(angle);
    }

    public Vector scale(double num)
    {
        return new Vector(this.getX() * num, this.getY() * num, this.getZ() * num);
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
        return new Vector(this.getX()/length, this.getY()/length, this.getZ()/length);
    }
}