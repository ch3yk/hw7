public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int salary = 15000;
        int month = 0;
        int total = 0;
        while (total<2459000){
            total = total+ salary;
            month = month+1;
            System.out.println("Месяч "+month+" сумма накопления равна "+total+" рублей");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int number = 0;
        while (number<10){
            number++;
            System.out.print(" " +number+ " " );
        }
        System.out.println();
        int i = 10;
        for (;i>=1;i= i-1){
            System.out.print(" " +i+ " ");
        }
        System.out.println();
    }

    public static void task3 () {
        System.out.println("Задача 3");
        int population = 12000000;
        int birthInOneThousand = 17;
        int deathInOneThousand = 8;
        int year = 0;
        int birthInPopulation = (population/1000)*birthInOneThousand;
        int deathInPopulation = (population/1000)*deathInOneThousand;
        while (year<12){
            System.out.println("Год "+ year +", численность населения составляет "+population);
            population= population+birthInPopulation-deathInPopulation;
            year++;
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int money = 15000;
        int month = 0;
        int total = 0;
        while (total<12000000){
            total = (int) (total*0.07+total+money);
            month++;
            System.out.println("месяц "+month+" накопления "+total);
        }

    }
    public static void task5 () {
        System.out.println("Задача 5");
        int money = 15000;
        int month = 0;
        int total = 0;
        while (total<12000000){
            total = (int) (total*0.07+total+money);
            month++;
            if (month%6==0){
                System.out.println("месяц "+month+" накопления "+total);
            }
        }
    }
    public static void task6 () {
        System.out.println("Задача 6");
        int money = 15000;
        int month = 0;
        int total = 0;
        while (month<9*12){
            total = (int) (total*0.07+total+money);
            month++;
            if (month%6==0) {
                System.out.println("месяц " + month + " накопления " + total);
            }
        }
    }
    public static void task7 () {
        System.out.println("Задача 7");
        int date=1;
        int dayOfWeek=1;
        while (date<31){
            if (dayOfWeek==5){
                System.out.println("Сегодня пятница "+date+"-е число. Необходимо подготовить отчет");
            }
            date++;
            dayOfWeek++;
            if (dayOfWeek==8){
                dayOfWeek=1;
            }
        }
    }
    public static void task8 () {
        System.out.println("Задача 8");
        int year=2023;
        int start=year-200;
        int end = year+100;
        int comet= start;
        while (comet>=start&&comet<=end){
            comet++;
            if(comet%79==0){
                System.out.println(comet);
            }
        }

    }
}