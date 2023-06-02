public class Main {
    public static void main(String[] args) {
        //task1
        int money = 15000;
        int total = 0;
        int target = 2459000;
        for (int month = 0; total < target; month++) {
            total = total + money;
            System.out.println("Месяц " + month + ",сумма накоплений равна " + total + " рублей");
        }
        System.out.println();
        //task2
        int l = 0;
        while (l < 10) {
            l++;
            System.out.print(l + " ");
        }
        System.out.println();
        for (; l > 0; l--) {
            System.out.print(l + " ");
        }
        System.out.println();
        //task3
        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        int difference = fertility - mortality;
        for (int year = 1; year <= 10; year++) {
            population += population * difference / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population);
        }
        System.out.println();
        //task4
        int target1 = 12_000_000;
        float sum = 15000f;
        float accumulation = 0.07f;
        for (int c = 1; sum < target1; c++) {
            sum = sum * accumulation + sum;
            System.out.println("Месяц " + c + ",сумма накоплений равна " + (int) sum + " рублей");
            //task5
            if (c % 6 == 0) {
                System.out.println("Месяц " + c + ",сумма накоплений равна " + (int) sum + " рублей");
            }

        }
        System.out.println();
        //task6
        int age = 9;
        int month = age * 12;
        int sumMoney = 15000;
        float accumulation2 = 0.07f;
        for (int j = 1; j <= month; j++) {
            sumMoney = (int) (sumMoney * accumulation2 + sumMoney);
            if (j % 6 == 0) {
                System.out.println("Месяц " + j + ",сумма накоплений равна " + (int) sumMoney + " рублей");
            }
        }
        //task7
        int firstFriday = 4;
        int totalDays = 31;
        for (; firstFriday < totalDays; firstFriday = firstFriday + 7) {
            System.out.println("Сегодня пятница " + firstFriday + " число. Необходимо подготовить отчет");
        }
        //task8
        int cometTimeInterval = 200;
        int cometsTimeIntervalInTheFuture = 100;
        int cometStart = 0;
        int cometActivityInterval = 79;
        int startTiming = 1823;
        int totalTime = startTiming + cometTimeInterval + cometsTimeIntervalInTheFuture;
        for (; cometStart < totalTime; cometStart = cometStart + cometActivityInterval) {
            if (cometStart >= startTiming && cometActivityInterval % cometActivityInterval == 0) {
                System.out.println(cometStart);
            }
        }
    }
}
