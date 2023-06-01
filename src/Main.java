public class Main {
    public static void main(String[] args) {
        //task1
        int money = 15000;
        int total = 0;
        int i = 0;
        for (; total < 2_459_000; i++) {
            total = total + money;
            System.out.println("Месяц " + i + ",сумма накоплений равна " + total + " рублей");
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
        for(int p = 1; p <=10;p++ ){
            population += population * difference/1000;
            System.out.println("Год " + p + ", численность населения составляет " + population);


        }


    }
}