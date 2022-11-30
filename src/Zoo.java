import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zoo {

    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>(Arrays.asList(new Duck("utya", "kryakva", "red", 0, 2),
                new Fish("riba", "gold", "gold", 0, 1),
                new Cat("vasya", "dvornyaga", "black & white", 4, 8),
                new Dog("sharik", "doberman", "brown", 4, 3)));
    }

    public void talkAnimals() {
        for (Speakable i : getSpeakable()) {
            System.out.printf("%s,%s\n", i.toString(), i.speak());
        }
    }

    public List<Speakable> getSpeakable() {
        List<Speakable> result = new ArrayList<Speakable>();
        for (Animal i : animals) {
            if (i instanceof Speakable) {
                result.add((Speakable) i);
            }
        }
        result.add(new Radio());
        return result;

    }

    public List<Runable> getRunable() {
        List<Runable> result = new ArrayList<Runable>();
        for (Animal i : animals) {
            if (i instanceof Runable) {
                result.add((Runable) i);
            }
        }
        return result;


    }

    public List<Flyable> getFlyable() {
        List<Flyable> result = new ArrayList<Flyable>();
        for (Animal i : animals) {
            if (i instanceof Flyable) {
                result.add((Flyable) i);
            }
        }
        return result;
    }

    public void runAnimals() {
        for (Runable i : getRunable()) {
            System.out.printf("%s,%s\n", i.toString(), i.run());
        }
    }

    public void flyAnimals() {
        for (Flyable i : getFlyable()) {
            System.out.printf("%s,%s\n", i.toString(), i.fly());
        }
    }
}