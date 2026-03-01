package physics;

public class Coordinate {

    private double x;
    private double y;
    private double z;
    private int coordinates;

    public Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
        this.coordinates = 2;
    }

    public Coordinate(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.coordinates = 3;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        int xPrime = (int) this.x;
        int yPrime = (int) this.y;
        int zPrime = (int) this.z;

        if (this.coordinates == 2) {
            if ((xPrime != this.x ||
                    yPrime != this.y)) {
                return String.format("(%.2f, %.2f)", this.x, this.y);
            } else {
                return String.format("(%d, %d)", xPrime, yPrime);
            }
        }

        if ((xPrime != this.x ||
                yPrime != this.y ||
                zPrime != this.z)) {
            return String.format("(%.2f, %.2f, %.2f)", this.x, this.y, this.z);
        }
        return String.format("(%d, %d, %d)", xPrime, yPrime, zPrime);
    }

    public double distance(Coordinate c) {

        double xPrime = c.getX() - this.x;
        double yPrime = c.getY() - this.y;
        double zPrime = c.getZ() - this.z;

        return Math.sqrt(xPrime * xPrime +
                yPrime * yPrime +
                zPrime * zPrime);
    }


}