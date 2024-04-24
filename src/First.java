public class First {

    public static void main(String[] args) {

        First func = new First();
        System.out.println(func.checkMessage(1));
        System.out.println(func.checkMessage(13));
        System.out.println(func.checkMessage(74));
        System.out.println(func.checkMessage(98));
    }


    public String checkMessage(int num) {

        String message = num + " компьютер";

        if (num > 10 && num < 15) {
            message = message + "ов";
        } else if (num % 10 > 1 && num % 10 < 5) {
            message += "а";
        } else if (num % 10 > 4 || num == 0) {
            message += "ов";
        }

        return message;
    }
}
