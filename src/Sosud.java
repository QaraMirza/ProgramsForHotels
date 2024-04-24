public class Sosud {

    public static void main(String[] args) throws Exception {

        int current = 0;
        int iter = 0;
        int step = 0;
        int startStep;

        for (startStep = 0; current < 5000;) {

            iter++;
            current += step;

            if (step == 0) {
                System.out.println("Шаг " + startStep + " слишком маленький");
                current = 0;
                iter = 0;
                startStep++;
                step = startStep;
                continue;
            }

            System.out.println("iter=" + iter + " step=" + step + " current=" + current);
            step--;

        }

        //Если остаток в последней итерации слишком мал, то необходимости в ней нет
        if (5000 - (current - step) < step) {
            iter--;
        }

        System.out.println("Длина шага в начале = " + startStep + ", шаг уменьшался на 1 каждую итерацию" + ". Суммарно нужно " + (iter + step) + " итераций");

    }

}
