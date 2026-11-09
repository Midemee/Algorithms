package lambdasAndStreams;

public class Main2 {
    static void main(String[] args) {

        Flyable jet = (distance)-> {

            IO.println("I am a jet that flies at distance " + distance+" mph");
        };

        jet.fly(117);

        Flyable bird = (distance)-> {
            IO.println("I am a bird that flies at distance " + distance + " mph");
        };

            bird.fly(11);

    }
}
