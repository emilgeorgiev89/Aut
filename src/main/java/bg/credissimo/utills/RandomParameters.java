package bg.credissimo.utills;

import java.util.Random;

public class RandomParameters {

    Random random = new Random();

    public int randomAmount (String product) {
        return (product.equals("Plus")) ? (random.nextInt(2400 - 200 + 1)) + 200 : (random.nextInt(600 - 100 + 1) + 100);
    }

    public int randomPeriod (String product) {
        return (product.equals("Plus")) ? (random.nextInt(24 - 3 + 1)) + 3 : (random.nextInt(30 - 15 + 1) + 15);
    }

}
