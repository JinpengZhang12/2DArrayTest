import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {

        ArrayList<String> car = new ArrayList<String>();

        // add array in array list
        car.add("Aqua ");
        car.add("MX-5 ");
        car.add("CX-5 ");

        // set method in arraylist. Change the String under the index
        car.set(1, "Markx");

        car.remove(0);
        for (int i = 0; i < car.size(); i++) {
            System.out.println(car.get(i));
        }
    }
}
