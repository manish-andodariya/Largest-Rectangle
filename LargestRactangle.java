public class LargestRactangle {
    static int getMax(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int total = 0;
            int current = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] >= current) {
                    total++;
                    System.out.println("Left" + total);
                } else {
                    break;
                }
            }
            for (int k = i + 1; k < arr.length; k++) {
                if (arr[k] >= current) {
                    total++;
                    System.out.println("Right" + total);
                } else {
                    System.out.println("Skipped");
                    break;
                }
            }
            int temp = (total + 1) * arr[i];
            System.out.println("Max of " + i + "is" + temp);
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] building = { 3, 5, 2, 1, 1 };
        int result = getMax(building);
        System.out.println(result);
    }
}
