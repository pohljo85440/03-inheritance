package ohm.softa.a03;

public class DigestingState extends State{

    private int timeDigesting = 0;

    public DigestingState(int duration, int time) {
        super(duration, time);
    }

    @Override
    State successor(Cat cat) {
        timeDigesting = timeDigesting + 1;
        if(timeDigesting== getDuration()) {
            logger.info("Getting in a playful mood!");
            return new PlayfulState(cat.getAwake(), getTime());
        }
        return this;
    }
}
