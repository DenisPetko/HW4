public class Main {
    public static void main(String[] args) {
        //Задача 1
        int age = 17;
        if (age >= 18) {
            System.out.println("Он совершеннолетний");
        } else {
            System.out.println("Он не достиг совершеннолетия, нужно немного подождать");
        }
        //Задача 2
        int temp = 4;
        if (temp < 5) {
            System.out.println("нужно надеть шапку");
        } else {
            System.out.println("можно идти без шапки");
        }
        //Задача 3
        int speed = 70;
        if (speed > 60) {
            System.out.println("придется заплатить штраф");
        } else {
            System.out.println("можно ездить спокойно");
        }
        //Задача 4
        int skill = 6;
        if (skill >= 2 && skill <= 6) {
            System.out.println("нужно ходить в детский сад");
        } else if (skill >= 7 && skill < 18) {
            System.out.println("нужно ходить в школу");
        } else if (skill >= 18 && skill < 24) {
            System.out.println("нужно ходить в университет");
        } else {
            System.out.println("пора ходить на работу");
        }
        //Задача 5
        int childAge = 4;
        if (childAge < 5) {
            System.out.println("нельзя кататься на аттракционе");
        } else if (childAge >= 5 && childAge < 14) {
            System.out.println("можно кататься в сопровождении взрослого");
        } else {
            System.out.println("можно кататься без сопровождения");
        }
        //Задача 6
        int seat = 59;
        if (seat >= 0 && seat < 60) {
            System.out.println("есть сидячее место");
        } else if (seat >= 60 && seat < 102) {
            System.out.println("есть стоячее место");
        } else if (seat >= 102) {
            System.out.println("мест нет");
        }
        //Задача 7
        int one = 1;
        int two = 10;
        int three = 8;
        if(one >two &&one >three)
        {
            System.out.println(one);
        }   else if(two >one &&two >three)
        {
            System.out.println(two);
        }   else if(three >one &&three >two)
        {
            System.out.println(three);
        }
    }
}


