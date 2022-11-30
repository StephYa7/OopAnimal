public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        System.out.println("Говорят");
        zoo.talkAnimals();
        System.out.println("Бегают");
        zoo.runAnimals();
        System.out.println("Летают");
        zoo.flyAnimals();
        System.out.println("Плавают");
        zoo.swimAnimals();
    }
}
   /*
   Вывод
    Говорят
        utya,krya
        vasya,mau
        sharik,gav
        Radio@1d81eb93,blablabla
        Бегают
        utya,5 km/h
        vasya,40 km/h
        sharik,50 km/h
        Летают
        utya,90 km/h
        Плавают
        utya,35 km/h
        riba,50 km/h

        Process finished with exit code 0 */