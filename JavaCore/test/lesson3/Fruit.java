package JavaCore.test.lesson3;

/**
 * @author Dmitry Tkachenko
 * @version 1.0 5/7/17
 */
public abstract class Fruit {

    private float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    float getWeight() {
        return weight;
    }
}