public class Main {
    public static void main(String[] args) {

        // call class array test 1
        ArrayTest1 at1 = new ArrayTest1();
        String[][] retrievMatrix = at1.getMatrix();

        // set size of 2D arrays
        String[][] cars = new String[3][3];
        cars[0][0] = "Benz";
        cars[0][1] = "AUdi";
        cars[0][2] = "Toyota";
        cars[1][0] = "Marzda";
        cars[1][1] = "Tesla";
        cars[1][2] = "Suzuki";
        cars[2][0] = "subaru";
        cars[2][1] = "Ferrari";
        cars[2][2] = "Mustang";

        // read arrays
        // run x-ray
        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            // read the index
            // run y-ray
            for (int j = 0; j < cars[i].length; j++) {
                System.out.println(cars[i][j] + " ");
            }

        }

        for (int i = 0; i < retrievMatrix.length; i++) {
            System.out.println();
            // read the index
            // run y-ray
            for (int j = 0; j < retrievMatrix[i].length; j++) {
                System.out.println(cars[i][j] + " ");
            }

        }

    }
}
