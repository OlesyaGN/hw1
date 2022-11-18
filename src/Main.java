public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задание 1");
        int salary = 15000;
        int cash = 0;
        int i = 0;
        while (cash < 2_459_000) {
            cash = cash + cash / 100;
            cash = cash + salary;
            i++;
        }
        System.out.println("Месяц " + i + ", сумма накоплений равна " + cash + " рублей");
        //Задание 2
        System.out.println("Задание 2.");
        int r = 1;
        while (r <= 10) {
            System.out.print(r);
            r++;
        }
        System.out.println();
        for (int t = 10; t >= 1; t--) {
            System.out.print(t);
        }
        System.out.println();
        //Задание 3
        System.out.println("Задание 3. ");
        int population = 12000000;
        int born = 17;
        int death = 8;
        int dif = born - death;
        int u = 0;
        while (u < 10) {
            population += population * dif / 1000;
            u++;

            System.out.println("Год " + u + ", численность населения составляет " + population);
        }
        //Задание 4
        System.out.println("Задание 4.");
        int part = 15000;
        double money = 0;
        int month = 0;
        double proc = 0.07;
        while (money <= 12000000) {
            money = (money + part) * (1 + proc);
            month++;
            System.out.println("Месяц " + month + " Сумма " + money);
        }
        //Задание 5
        System.out.println("Задание 5.");
        int sum = 15_000;
        double coin = 0;
        int time = 0;
        double percent = 0.07;
        while (coin <= 12_000_000) {
            coin = (coin + sum) * (1 + percent);
            time++;
            {
                if (time % 6 == 0)
                    System.out.println("Месяц " + time + " Сумма " + coin);
            }
        }
        //Задание 6
        System.out.println("Задание 6.");
        int one = 15_000;
        double tot = 0;
        int p = 0;
        double pr = 0.07;
        while (p <= 9 * 12) {
            tot = (tot + one) * (1 + pr);
            p++;
            {
                if (p % 6 == 0)
                    System.out.println("Месяц " + p + " Сумма " + tot);
            }
        }
        //Задание 7
        System.out.println("Задание 7.");
        for (int x = 7; x <= 31; x++) {
            if (x % 7 == 0)
                System.out.println("Сегодня пятница," + x + "-е число. Необходимо подготовить отчет.");
        }
        //Задание 8
        System.out.println("Задание 8.");
        int now = 2022;
        int will = now + 100;
        int then = now - 200;
        for (int e=0; e > then; e=e+will) {

            if (e % 79 == 0)
                System.out.println(e);
        }

    }
}