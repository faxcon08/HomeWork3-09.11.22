public class Main {
    public static void main(String[] args) {
        final String ANSI_RESET = "\u001B[0m"; // черный цвет в консоле
        final String ANSI_GREEN = "\u001B[32m"; // зеленый цвет консоли

        // First Task
        System.out.println(ANSI_GREEN + "First TASK" + ANSI_RESET);

        byte myByte = 127;
        short myShort = 32670;
        int myInt = 2123456789;
        long myLong = 9123456789123456789L;
        float myFloat = 1234.1234567F;
        double myDouble= 1234.123456789;

        System.out.println("Значение переменной "+"myByte"+ " c типом "+"byte"+" равно "+myByte);
        System.out.println("Значение переменной "+"myShort"+ " c типом "+"short"+" равно "+myShort);
        System.out.println("Значение переменной "+"myInt"+ " c типом "+"int"+" равно "+myInt);
        System.out.println("Значение переменной "+"myLong"+ " c типом "+"long"+" равно "+myLong);
        System.out.println("Значение переменной "+"myFloat"+ " c типом "+"float"+" равно "+myFloat);
        System.out.println("Значение переменной "+"myDouble"+ " c типом "+"double"+" равно "+myDouble);

        // Second Task
        System.out.println(ANSI_GREEN+"Second TASK"+ANSI_RESET);
        double myDouble2 = 27.12;
        long myLong2 = 987678965549L;
        float myFloat2 = 2.786F;
        boolean myBoolean2 = false;
        int myInt2  = 569;
        short myShort2 = -159;
        int myInteger = 27897;
        byte myByte2 = 67;
    }
}