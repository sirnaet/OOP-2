import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySortReverse {
    public static void main(String[] args) {
        String[] pallets = {"B14", "A11", "B12", "A13", "B15", "A10", "B16", "A14", "B17", "A15"};

        System.out.println("SortedMap...");
        Arrays.sort(pallets);
        for (String pallet : pallets) {
            System.out.println("--" + pallets);
        }

        System.out.println("\nReversed ...");
        List<String> palletList = Arrays.asList(pallets);
        Collections.reverse(palletList);
        for (String pallet : palletList) {
            System.out.println("--" + pallets);
        }
    }
    
}
