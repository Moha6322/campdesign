package campsystem;

public class FeedCommand implements CampCommand {

    private final Dog targetDog;

    public FeedCommand(Dog dog) {
        this.targetDog = dog;
    }

    @Override
    public void execute() {
        // Implementation here
    }
}
