public class Fourth {

    public static void main(String[] args) {

        Fourth prog = new Fourth();

        String table = prog.makeMultiplTable(15);

        System.out.println(table);

    }


    public String makeMultiplTable(int size) {

        String table = "";

        String num;

        for (int i = 0; i <= size; i++) {

            for (int j = 0; j <= size; j++) {

                if (i == 0) {
                    if (j == 0) {
                        num = "";
                    } else {
                        num = "\t" + j;
                    }
                } else if (j == 0) {
                    num = "\n" + i;
                } else {
                    num = "\t" + i * j;
                }

                table += num;
            }
        }

        return table;
    }
}
