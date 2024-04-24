import java.util.ArrayList;

public class Third {

    public static void main(String[] args) {

        Third program = new Third();

        int[] primes = program.getPrimes(1, 20);

        for (int i = 0; i < primes.length; i++) {
            System.out.print(primes[i] + " ");
        }

    }


    public int[] getPrimes(int min, int max) {

        ArrayList<Integer> primesList = new ArrayList<>();

        int countOfAll;
        int countOfPassed;

        for (int num = min; num <= max; num++) {


            //Количество итераций над каждым проверяемым числом
            countOfAll = num / 2 - 1;

            //Количество итераций до нахождения делителя
            countOfPassed = 0;

            for (int i = 2; i <= num / 2; i++) {

                if (num % i == 0) {
                    break;
                } else {
                    countOfPassed++;
                }
            }

            //Выполнение условия означает что делителей у num нет
            if (countOfPassed == countOfAll) {
                primesList.add(num);
            }
        }

        int[] primesArray = primesList.stream().mapToInt(Integer::intValue).toArray();

        return primesArray;
    }
}
