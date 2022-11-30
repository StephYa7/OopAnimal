public class Fish extends Animal implements Swimmable{
    public Fish(String name, String breed, String color, Integer countLegs, Integer age) {
        super(name, breed, color, countLegs, age);
    }


    @Override
    public String swim() {
        return "50 km/h";
    }
}
