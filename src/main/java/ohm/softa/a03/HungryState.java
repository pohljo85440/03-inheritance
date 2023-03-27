package ohm.softa.a03;

public class HungryState extends State{

    public HungryState(int duration) {
        super(duration, 0);
    }

    State feed(Cat cat) {
        if (!cat.isHungry())
            throw new IllegalStateException("Can't stuff a cat...");
        logger.info("You feed the cat...");
        return new DigestingState(cat.getDigesting(), getTime());
    }

    @Override
    State successor(Cat cat) {
        if(getTime() == getDuration()) {
            logger.info("I've starved for a too long time...good bye...");
            return new DeathState();
        }
        return this;
    }}
