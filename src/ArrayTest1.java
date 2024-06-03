public class ArrayTest1 {

    private String[][] matrix;

    public ArrayTest1() {

        // initialize 2D arrays
        matrix = new String[][] {
                { "Benz", "Audi", "Toyota" },
                { "Marzda", "Tesla", "Suzuki" },
                { "Subaru", "Ferrari", "Mustang" }
        };
    }

    // get method to access the array
    public String[][] getMatrix() {

        return matrix;
    }

}
