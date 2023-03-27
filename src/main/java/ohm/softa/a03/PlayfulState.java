package ohm.softa.a03;

public class PlayfulState extends State{
    public PlayfulState(int duration,  int time) {
        super(duration, time);
    }

    @Override
    State successor(Cat cat) {
        if(getTime() >= getDuration()) {
            logger.info("Yoan... getting tired!");
            return new SleepingState(cat.getSleep());
        }
        return this;
    }}
