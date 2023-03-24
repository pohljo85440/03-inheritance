package ohm.softa.a03;

public class DigestingState extends State{
    private int timeDigesting = 0;

    @Override
    State successor(Cat cat) {

        if(timeDigesting == cat.getDigest()) {
            logger.info("Getting in a playful mood!");
        }
    }
}
