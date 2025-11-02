class Answer4 {
    public static void main(String args[]) {
        // create shapes using various constructors
        ThreeDimensionShape shape1 = new ThreeDimensionShape(5, 6, 7);
        ThreeDimensionShape shape2 = new ThreeDimensionShape();
        ThreeDimensionShape shape3 = new ThreeDimensionShape(8);

        double volume;

        // get volume of first box
        volume = shape1.volume();
        System.out.println("Volume of shape1 is " + volume);

        // get volume of second box
        volume = shape2.volume();
        System.out.println("Volume of shape2 is " + volume);

        // get volume of cube
        volume = shape3.volume();
        System.out.println("Volume of shape3 is " + volume);
    }
}

class ThreeDimensionShape {
    double width, height, depth;

    // constructor when all dimensions are defined
    ThreeDimensionShape(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // constructor when one dimension is defined (cube)
    ThreeDimensionShape(double l) {
        width = height = depth = l;
    }

    // constructor when no dimensions are specified
    ThreeDimensionShape() {
        width = height = depth = 0;
    }

    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}