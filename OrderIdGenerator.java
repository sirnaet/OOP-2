import java.util.Random;

public class OrderIdGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        String[] orderIds = new String[5];

        for (int i = 0; i < orderIds.length; i++) {
            char prefix = (char)(random.nextInt(5) + 'A');

            int number = random.nextInt(999) + 1;
            String suffix = String.format("%3d", number);

            orderIds[i] = prefix + suffix;
        }

        for (String orderID : orderIds) {
            System.out.println(orderID);
        }
    }
    
}
