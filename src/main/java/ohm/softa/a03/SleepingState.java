package ohm.softa.a03;

public class SleepingState extends State {
    public SleepingState(int duration) {
        super(duration, 0);
    }

    @Override
    State successor(Cat cat) {
        if(getTime() == getDuration()) {
            logger.info("Yoan... getting hungry!");
            return new HungryState(cat.getAwake());
        }
        return this;
    }
}
