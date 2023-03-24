package ohm.softa.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class State {
    protected static final Logger logger = LogManager.getLogger();
    private int t;
    private final int duration;

    State tick(Cat cat) {
        logger.info("tick()");
        t = t + 1;
        return successor(cat);
    }

    abstract State successor(Cat cat);

    int getTime() {
        return t;
    }

    int getDuration() {
        return duration;
    }

}
