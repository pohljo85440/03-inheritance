package ohm.softa.a03;

public class HungryState extends State{

    State feed(Cat cat) {
        return this;
    }

    @Override
    State successor(Cat cat) {
        return null;
    }
}
