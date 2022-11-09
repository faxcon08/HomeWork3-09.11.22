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

        // Third Task
        System.out.println(ANSI_GREEN+"Third TASK"+ANSI_RESET);
        int studentNumber1 = 23, studentNumber2 = 27, studentNumber3 = 30;
        int totalPaperSheets = 480;
        int numberSheetsPerStudent =totalPaperSheets / (studentNumber1+studentNumber2+studentNumber3);
        System.out.println("На каждого ученика рассчитано "+numberSheetsPerStudent+" листов бумаги");

        // Fourth Task
        System.out.println(ANSI_GREEN+"Fourth TASK"+ANSI_RESET);
        int efficiencyPer2min = 16;
        int twoMinutes = 2;
        int twentyMinutes = 20;
        int day = twentyMinutes*3*24;
        int threeDays = day*3;
        int month = day*30;
        int efficiencyPer1min = efficiencyPer2min / twoMinutes;

        System.out.println("За "+"20 минут"+" машина произвела бутылок "+(efficiencyPer1min*twentyMinutes)+" штук");
        System.out.println("За "+"сутки"+" машина произвела бутылок "+(efficiencyPer1min*day)+" штук");
        System.out.println("За "+"3 дня"+" машина произвела бутылок "+(efficiencyPer1min*threeDays)+" штук");
        System.out.println("За "+"1 месяц"+" машина произвела бутылок "+(efficiencyPer1min*month)+" штук");

        // Fifth Task
        System.out.println(ANSI_GREEN+"Fifth TASK"+ANSI_RESET);
        int totalNumberBanks = 120;
        int witeBanksPer1Class = 2;
        int brownbanksPer1Class = 4;
        int numberOfClass = totalNumberBanks / (witeBanksPer1Class+brownbanksPer1Class);
        int totalWiteBanks = numberOfClass * witeBanksPer1Class;
        int totalBrownBanks= numberOfClass * brownbanksPer1Class;

        System.out.println("В школе, где "+numberOfClass+" классов, нужно "+totalWiteBanks+" банок белой краски и "+totalBrownBanks+" банок коричневой краски");

        // Sixth Task
        System.out.println(ANSI_GREEN+"Sixth TASK"+ANSI_RESET);

        int bananaCount = 5;
        int oneBananaWeight = 80;
        int milkCount = 2;
        int oneMilkWeight = 105;
        int icecreamCount = 2;
        int oneIceCreamWeight = 100;
        int eggsCount = 4;
        int oneEggsWeight = 70;

        int totalGramWeight = bananaCount*oneBananaWeight + milkCount*oneMilkWeight+icecreamCount*oneIceCreamWeight+eggsCount*oneEggsWeight;
        double totalKiloWeight = (double)totalGramWeight / 1000;

        System.out.println("Общий вес спорт-завтрака в граммах: "+totalGramWeight+" грамм");
        System.out.println("Вес того же спорт-завтрака в килограммах: "+totalKiloWeight+" кг.");



        //  Seventh
        System.out.println(ANSI_GREEN+"Seventh TASK"+ANSI_RESET);


        // Eighth Task
        System.out.println(ANSI_GREEN+"Eighth TASK"+ANSI_RESET);

    }
}