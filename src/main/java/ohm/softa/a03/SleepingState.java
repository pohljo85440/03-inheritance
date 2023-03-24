package ohm.softa.a03;

public class SleepingState extends State{
    @Override
    State successor(Cat cat) {
        if(getTime() == cat.getSleep()) {
            logger.info("Yoan... getting hungry!");
            return new HungryState();
        }
        return this;
    }
}
