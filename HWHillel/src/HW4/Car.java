package HW4;

//
//Создать класс машина с полями
//        объем бака
//        остаток в баке
//        расход топлива на 100 км

//        создать методы:

//        залить полный бак с учетом объема остатка
//        определить остаток топлива по преодолении N км
//        определить сколько надо до заправить топлива при преодолении N км
//
//
//        в классе Мейн надо определить и вывести на экран сколько надо долить топлива и его стоимость если маршрут у нас Одесса - Киев
//
//        + 2 обязательные остановки для дозаправки Кривое Озеро и Жашков
//
//        + сколько будет стоить полная поездка   - одесса - киев
//
//        + остаток топлива в пункте назначения   - в киеве

//        стоимость топлива передавать как аргумент программы + результаты выполнения приложить скриншотом


public class Car {
    private float tank  ;  //общий обьем бака
    public float remain; // остаток в баке
    private float consumption ; //потребление на 100 км литров
//        залить полный бак с учетом объема остатка
//        определить остаток топлива по преодолении N км
//        определить сколько надо до заправить топлива при преодолении N км

    public Car(float tank, float remain, float consumption) {
        this.tank = tank;
        this.remain = remain;
        this.consumption = consumption;
    }

    //        залить полный бак с учетом объема остатка
    private void FullFill(float liters) {
        if (liters == tank-remain) {
            remain = liters;
        }
    }

    //        определить остаток топлива по преодолении N км
    private float getRemain (float distance) {
        float res;
        res = remain - distance/100 * consumption;
        return res;
    }

    //        определить сколько надо до заправить топлива при преодолении N км
    private float getNeed (float distance){
        float res;
        res = distance/100 * consumption;
        System.out.println("Нужно дозаправить "+ res);
        return res;
    }

//  в классе Мейн надо определить и вывести на экран сколько надо долить топлива и его стоимость если маршрут у нас Одесса - Киев
//
//        + 2 обязательные остановки для дозаправки Кривое Озеро и Жашков
//
//        + сколько будет стоить полная поездка
//
//        + остаток топлива в пункте назначения

    //        стоимость топлива передавать как аргумент программы + результаты выполнения приложить скриншотом


    public static void main(String[] args) {
        System.out.println("Fuel Price (for one liter)  " + args[0]);
//        for (int i = 0; i < args.length; i++) {
//            System.out.println(args[i]);
//        }
        float price = Float.valueOf(args[0]);
        Car lancer = new Car (80,0,15);
        float distance1 = 180; //  Odessa - Krive Ozero - 180
        float distance2 = 150; // Krive Ozero - Jashkov - 150
        float distance3 = 150; // Jashkov - Kiev 150
        float allFuel = 0F;
        System.out.println("Odessa");
        lancer.FullFill(80); //Заправили до полного бака
        allFuel += 80;
        System.out.println("Krive Ozero");
        // Driving driving....to Krive Ozero
        lancer.FullFill(lancer.getNeed(180)); //full
        allFuel += lancer.getNeed(180); //plus fuel to all cost
        System.out.println("Jashkov");
        //Driving to Jashkov
        lancer.FullFill(lancer.getNeed(150));
        allFuel += lancer.getNeed(150);
        System.out.println("Kiev");
        //Driving to Kiev
        lancer.remain -= lancer.getNeed(150);
        allFuel -= lancer.remain;
        System.out.println("Остаток топлива в Киеве " + lancer.remain);
        System.out.println("Надо долить в общем(всего потратили) " + allFuel);
        System.out.println("Общая стоимость использованного топлива " + allFuel*price);


    }

}