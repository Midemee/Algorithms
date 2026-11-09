package lambdasAndStreams;

@FunctionalInterface
public interface Flyable {

    void fly(double distance);

    static int flyBack(){
        return 1;
    }
}
