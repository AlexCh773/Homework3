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

    public static void task1() {
        System.out.println("task1");
        byte b = 1;
        short s = 2;
        int i = 3;
        long l = 4L;
        float f = 5.2f;
        double d = 6.4;
        System.out.println("Значение переменной 'b' с типом byte равно " + b);
        System.out.println("Значение переменной 's' с типом short равно " + s);
        System.out.println("Значение переменной 'i' с типом int равно " + i);
        System.out.println("Значение переменной 'l' с типом long равно " + l);
        System.out.println("Значение переменной 'f' с типом float равно " + f);
        System.out.println("Значение переменной 'd' с типом double равно " + d);
    }

    public static void task2() {
        System.out.println();
        System.out.println("task2");
        byte b = 67;
        short s1 = 569;
        short s2 = -159;
        short s3 = 27897;
        long l = 987678965549L;
        float f1 = 27.12f;
        float f2 = 2.786f;
    }

    public static void task3() {
        System.out.println();
        System.out.println("task3");
        int sheetsPerStudent,
                sheetsCount = 480,
                firstTeacherStudents = 23,
                secondTeacherStudents = 27,
                thirdTeacherStudents = 30;
        sheetsPerStudent = sheetsCount /(firstTeacherStudents + secondTeacherStudents + thirdTeacherStudents);
        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");
    }

    public static void task4() {
        System.out.println();
        System.out.println("task4");
        int machinePerformance1Min = 16 / 2;
        int machinePerformans20Min = machinePerformance1Min * 20;
        int machinePerformans24Hours = machinePerformance1Min * 60 * 24;
        int machinePerformans3Days = machinePerformans24Hours * 3 ;
        int machinePerformans1Month = machinePerformans24Hours * 30 ;
        System.out.println("За 20 минут машина произвела " + machinePerformans20Min + " штук бутылок");
        System.out.println("За 24 часа машина произвела " + machinePerformans24Hours + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + machinePerformans3Days + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + machinePerformans1Month + " штук бутылок");
    }

    public static void task5() {
        System.out.println();
        System.out.println("task5");
        int needCansOfPainTotal = 120;
        int needCansOfBrownPainForOneOffice = 4;
        int needCansOfWhitePainForOneOffice = 2;
        int officesTotal = needCansOfPainTotal / (needCansOfBrownPainForOneOffice + needCansOfWhitePainForOneOffice);
        int needCansOfWhitePainTotal = officesTotal * needCansOfWhitePainForOneOffice;
        int needCansOfBrownPainTotal = needCansOfPainTotal - needCansOfWhitePainTotal;
        System.out.println("В школе, где " + officesTotal + " классов, нужно " + needCansOfWhitePainTotal + " банок белой краски и " + needCansOfBrownPainTotal + " банок коричневой краски");
    }

    public static void task6() {
        System.out.println();
        System.out.println("task6");
        int bananasCount = 5;
        int oneBananaWeight = 80;
        int milkVolume = 200;
        int milkWeightPer100Milliliters = 105;
        int iceCreamCount = 2;
        int oneIceCreamWeight = 100;
        int eggsCount = 4;
        int oneEggWeight = 70;
        double weightTotalInGrams;
        double weightTotalInKilograms;
        weightTotalInGrams = bananasCount * oneBananaWeight + milkVolume / 100.0 * milkWeightPer100Milliliters + iceCreamCount * oneIceCreamWeight + eggsCount * oneEggWeight;
        weightTotalInKilograms = weightTotalInGrams / 1000;
        System.out.println("вес спортзавтрака в граммах составляет " + weightTotalInGrams);
        System.out.println("вес спортзавтрака в килограммах составляет " + weightTotalInKilograms);
    }

    public static void task7() {
        System.out.println();
        System.out.println("task7");
        int weightToLose = 7;
        int weightLosePerDayMin = 250;
        int weightLosePerDayMax = 500;
        int numberOfDaysDietMin;
        int numberOfDaysDietMax;
        int numberOfDaysDietAverage;
        numberOfDaysDietMax = weightToLose * 1000 / weightLosePerDayMin;
        numberOfDaysDietMin = weightToLose * 1000 / weightLosePerDayMax;
        numberOfDaysDietAverage = (numberOfDaysDietMin + numberOfDaysDietMax) / 2;
        System.out.println("минимальное количество дней для похудения на 7 кг составит - " + numberOfDaysDietMin);
        System.out.println("максимальное количество дней для похудения на 7 кг составит - " + numberOfDaysDietMax);
        System.out.println("среднее количество дней для похудения на 7 кг составит - " + numberOfDaysDietAverage);
    }

    public static void task8() {
        System.out.println();
        System.out.println("task8");
        double mashaSalaryAmount = 67760;
        double denisSalaryAmount = 83690;
        double kristinaSalaryAmount = 76230;
        int percentageIncrease = 10;
        double newMashaSalaryAmount;
        double newDenisSalaryAmount;
        double newKristinaSalaryAmount;
        double mashaSalaryIncreaseSize;
        double denisSalaryIncreaseSize;
        double kristinaSalaryIncreaseSize;

        newMashaSalaryAmount = mashaSalaryAmount + mashaSalaryAmount / 100 * percentageIncrease;
        mashaSalaryIncreaseSize = newMashaSalaryAmount - mashaSalaryAmount;
        System.out.println("Маша теперь получает " + newMashaSalaryAmount + " рублей. Годовой доход вырос на " + mashaSalaryIncreaseSize + " рублей");
        newDenisSalaryAmount = denisSalaryAmount + denisSalaryAmount / 100 * percentageIncrease;
        denisSalaryIncreaseSize = newDenisSalaryAmount - denisSalaryAmount;
        System.out.println("Денис теперь получает " + newDenisSalaryAmount + " рублей. Годовой доход вырос на " + denisSalaryIncreaseSize + " рублей");
        newKristinaSalaryAmount = kristinaSalaryAmount + kristinaSalaryAmount / 100 * percentageIncrease;
        kristinaSalaryIncreaseSize = newKristinaSalaryAmount - kristinaSalaryAmount;
        System.out.println("Кристина теперь получает " + newKristinaSalaryAmount + " рублей. Годовой доход вырос на " + kristinaSalaryIncreaseSize + " рублей");
    }
}