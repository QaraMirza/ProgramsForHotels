import java.util.ArrayList;

public class Second {
    public static void main(String[] args) {

        Second program = new Second();

        int[] numbers = {42, 12, 18};

        int[] dividers = program.findDividers(numbers);

        for (int i = 0; i < dividers.length; i++) {
            System.out.print(dividers[i] + " ");
        }

    }


    public int[] findDividers(int[] numArray) {

        int min = numArray[0];
        int count = 0;

        for (int i = 0; i < numArray.length; i++) {
            if (numArray[i] < min) {
                min = numArray[i];
            }
        }

        ArrayList<Integer> dividersList = new ArrayList<>();

        for (int j = 2; j <= min / 2; j++) {

            count = 0;

            for (int k = 0; k < numArray.length; k++) {

                if (numArray[k] % j != 0) {
                    break;
                }

                count++;
            }

            if (count == numArray.length) {
                dividersList.add(j);
            }
        }

        int[] dividersArray = dividersList.stream().mapToInt(Integer::intValue).toArray();

        return dividersArray;
    }
}
