import java.util.Arrays;

public class ArrayCleardemo{
    public static void main(String[] args) {
        String[] pallets = {"B14", "A14", "B12", "A13", "B15", "A10", "B16", "A14", "B17", "A15"};

        System.out.println();

        System.out.println("Before: " + pallets[0].toLowerCase());

        Arrays.fill(pallets, 0, 2, null);

        if (pallets[0] != null) {
            System.out.println("After: " + pallets[0].toLowerCase());
        } else {
            System.out.println("After: null");
        }

        System.out.println("Clearing 2 ... count: " + pallets.length);
        for (String pallet : pallets) {
            System.out.println("--" + pallet);
        }
            
    }
    
}
