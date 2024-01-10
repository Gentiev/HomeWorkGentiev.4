public class Main {
    public static void main(String[] args) {
//Задача.1
        int age = 27;
        if (age >= 18) {
            System.out.println("The age of a person is over 18 years old");
        }
        if (age < 18) {
            System.out.println("The age of a person is less than 18 years old");
        }
//Задача.2
        int outdoorTemp = -16;
        if (outdoorTemp < 5) {
            System.out.println("It's " + outdoorTemp + " degrees outside, you need to put on a hat.");
        }
        if (outdoorTemp >= 5) {
            System.out.println("It's " + outdoorTemp + " degrees outside, you can go without a hat");
        }
//Задача.3
        int speedDriver = 72;
        if (speedDriver > 60) {
            System.out.println("If the speed is " + speedDriver + ", you will have to pay a fine.");
        }
        if (speedDriver <=60) {
            System.out.println("If the speed is " + speedDriver + ", you can drive calmly.");
        }
//Задача.4
        int ageHuman = 7;
        if (ageHuman >= 2 && ageHuman <= 6)
        {
            System.out.println("If a person's age is " + ageHuman + ", then he needs to go to kindergarten.");
        }else {
            if (ageHuman >= 7 && ageHuman < 18)
            {
                System.out.println("If a person's age is " + ageHuman + ", then he needs to go to school.");
            }else{
                if (ageHuman >= 18 && ageHuman <= 24)
                {
                    System.out.println("If a person's age is " + ageHuman + ", then he needs to go to university.");
                }else{
                    if (ageHuman < 2)
                    {
                        System.out.println("Ну кому приходит в голову проверять куда нужно ходить ребенку в 1 год?");
                    } else {
                        System.out.println("If a person's age is " + ageHuman + ", then he needs to go to work.");
                    }
                }
            }
        }
//Задача.5
        int ageChildren = 15;
        if (ageChildren < 5) {
            System.out.println("If the child's age is " + ageChildren +", he is not allowed to ride on the attraction.");
        }else {
            if (ageChildren < 14 && ageChildren >= 5) {
                System.out.println("If the child's age is " + ageChildren + ", he can ride an amusement ride accompanied by an adult.");
            } else {
                System.out.println("If the child's age is " + ageChildren + ", he can ride the attraction without an adult accompanying him.");
            }
        }
//Задача.6
        int placesTotal = 102;
        int placesSitting = 60;
        int passengersTotal = 59;
        if (passengersTotal < 60) {
            System.out.println("There are " + (placesSitting - passengersTotal) + " seats left.");
        } else {
            if (passengersTotal >= 60 && passengersTotal <= 102) {
                System.out.println("There are " + (placesTotal - passengersTotal) + " standing places left.");
            } else {
                System.out.println("There are no places.");
            }
        }
//Задача.7
        int one = 48;
        int two = 1516;
        int three = 2342;
        if (one > two && one > three) {
            System.out.println("The largest number " + one);
        } else {
            if (two > one && two > three) {
                System.out.println("The largest number " + two);
            } else {
                System.out.println("The largest number " + three);
            }
        }
        System.out.println("If you understood the reference with the last digits, then respect!");
    }
}