package intellij;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
//        Enums - enumeration
//        used when you have something that has predefined set of values that don't change
//        Example - days of the week
        DaysOfTheWeek day = DaysOfTheWeek.THURSDAY;
        System.out.println("It's almost Friday");

        for(DaysOfTheWeek myDay : DaysOfTheWeek.values()){
            System.out.println(myDay);
        }

        System.out.println(Cereals.CAPATAIN_CRUNCH.deliciousness);
        System.out.println(Cereals.FROOT_LOOPS.price);


    }
}