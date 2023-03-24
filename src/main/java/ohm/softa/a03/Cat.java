package ohm.softa.a03;


public class Cat {
	private int sleep;
	private int awake;
	private int digest;
	private State current;

	private String  name;

	public Cat(String name, int sleep, int awake, int digest) {
		this.name = name;
		this.sleep = sleep;
		this.awake = awake;
		this.digest = digest;
		this.current = new SleepingState();
	}

	public void feed() {
		if (!isHungry())
			throw new IllegalStateException("Can't stuff a cat...");
		((HungryState) current).feed(this);
	}

	public void tick() {
		current.tick(this);
	}

	public boolean isAsleep() {
		return current.getClass() == SleepingState.class;
	}

	public boolean isPlayful(){
		return current.getClass() == PlayfulState.class;
	}

	public boolean isHungry() {
		return current.getClass() == HungryState.class;
	}

	public boolean isDead(){
		return current.getClass() == DeathState.class;
	}

	public int getSleep() {
		return sleep;
	}

	public int getDigest() {
		return digest;
	}

	public int getAwake() {
		return awake;
	}

	public String getName() {
		return name;
	}
}
