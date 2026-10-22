public class LSTM {

    public static void main(String[] args) {

        int[] prices = {250, 120, 450, 180, 450, 320};
        int[] targets = {450, 900, 320};

        for (int i = 0; i < targets.length; i++) {

            boolean found = false;

            for (int j = 0; j < prices.length; j++) {

                if (prices[j] == targets[i]) {
                    found = true;
                    System.out.println(
                        "Price " + targets[i] +
                        " found at index: " + j
                    );
                }
            }

            if (!found) {
                System.out.println(
                    "Price " + targets[i] + " not found"
                );
            }
        }
    }
}
