public class Main {
    public static void main(String[] args) {
        System.out.println(" Привет МИР !" );

//    Задание 1
        System.out.println(" Задача 1");

        byte pen = 2;
        System.out.println( " Значение переменной (ручка) с типом byte равно " + pen + " шт ");
        short papers = 354;
        System.out.println( " Значение переменной  (бумага) c типом short равно " + papers + " листов ");
        int steel = 35999;
        System.out.println( " Значение переменной (сталь) c типом int равно " + steel + " тонн ");
        long people = 5567779986L;
        System.out.println( " Значение переменной (люди) c типом long равно " + people + " жителей ");
        float apples = 3.5f;
        System.out.println( " Значение переменной (яблоки) c типом float равно " + apples + " кг ");
        double flour = 13.3456;
        System.out.println( " Значение переменной (мука) c типом double равно " + flour + " кг ");

 //    Задание 2
        System.out.println(" Задача 2");

       float x =  27.12f;
        System.out.println(x);
       long x1 =  987678965549L;
        System.out.println(x1);
       double x2 = 2.786;
        System.out.println(x2);
        boolean x3  = false;
        System.out.println(x3);
        char x4 = 569;
        System.out.println(x4);
        short x5 = -159;
        System.out.println(x5);
        int x6 = 27897;
        System.out.println(x6);
        byte x7 = 67;
        System.out.println(x7);

  // Задание 3
        System.out.println(" Задача 3");
        var luda = 23;
        var anna = 27;
        var Katy = 30;
        var students = luda + anna + Katy;
        System.out.println( " Всего учеников " + students + " человек ");
         var allPapers = 480;
         var paper = allPapers / 80;
         System.out.println( " На каждого ученика расситано " + paper + " листов бумаги ");

  //   Задание 4
        System.out.println(" Задача 4 ");

        var bottles = 16;
        var minutes = 2;
        var oneMinuteBottles = bottles / minutes;
        System.out.println( " За одну минуту машина произвела бутылок " +  oneMinuteBottles + " шт ");
        var twentyMinutes = 20 ;
        System.out.println(" За " + twentyMinutes + " минут машина произвела бутылок " + oneMinuteBottles * twentyMinutes + " штук " );
        var minutesInDay = 24*60 ;
        System.out.println(" За " + minutesInDay + " минут машина произвела бутылок " + oneMinuteBottles * minutesInDay + " штук " );
        var minutesInThreeDay = 3 * minutesInDay ;
        System.out.println(" За " +minutesInThreeDay + " минут машина произвела бутылок " + oneMinuteBottles * minutesInThreeDay+ " штук " );
        var minutesInMonth = 10 * minutesInThreeDay; // в месяце 30 дней
        System.out.println(" За " + minutesInMonth + " минут машина произвела бутылок " + oneMinuteBottles * minutesInMonth+ " штук " );

//        Задача 5
        System.out.println(" Задача 5");
        var allPot = 120;
        var whitePot = 2;
        var brownPot = 4;
        var oneClass = whitePot + brownPot;
        var allClasses = allPot / oneClass;
        System.out.println ( " В школе всего " + allClasses+ " классов ");
        var allWhitePots = whitePot * allClasses;
        var allBrownPots = brownPot * allClasses;
        System.out.println( " В школе , где " + allClasses + " классов , нужно " + allWhitePots + " белой краски и "
                + allBrownPots + " банок коричневой краски ");

 //  Задача 6
        System.out.println(" Задача 6 ");
        var weightBanana = 80;
        var weightMilk = 200;
        var weightIceCream = 100;
        var weightEggs = 70;
        var  allWeight = weightBanana * 5 + weightMilk * 1.05 + weightIceCream * 2 + weightEggs * 4;
        System.out.println( " Вес всех продуктов " + allWeight + " грамм " );
        var result = allWeight / 1000;
        System.out.println( " вес всех продуктов " + result + " кг ");

//    Задание 7
        System.out.println(" Задача 7 ");
        var weight = 7;
        double a = 0.25;
        double b = 0.5;
        var weightA = weight / a;
        var weightB = weight / b;
        System.out.println(  ++ weightA +" Дней понадобится  ,  если спортсмен будет худеть на 250 гр в день  и "
                +  weightB + " дней понадобится , если спортсмен будет худеть на 500 гр в день");
        var averageQuantity = (weightA + weightB) / 2;
        System.out.println(" Среднее количество дней " + averageQuantity );

//       Задание 8
        System.out.println(" Задача 8 ");

        var masha = 67760;
        var raiseMasha = (masha / 100 * 10) * 11 ;
        var inYearMasha = (raiseMasha * 12) - (masha * 12);
        System.out.println(" Маша теперь получает " + raiseMasha +  " рублей . Годовой доход вырос на " + inYearMasha +
                " рублей ");
        int kristina = 76230;
        int raiseKristina = (kristina / 100 * 10) * 11;
        int inYearKristina = (raiseKristina * 12) - (kristina * 12);
        System.out.println(" Кристина теперь получает " + raiseKristina +  " рублей . Годовой доход вырос на " + inYearKristina +
                " рублей ");
         int denis = 83690;
        int raiseDenis = (denis /100 * 10) * 11;
        int inYearDenis = (raiseDenis * 12) - (denis * 12);
        System.out.println( " Денис теперь получает " + raiseDenis +  " рублей . Годовой доход вырос на " + inYearDenis +
                " рублей ");

    }
}