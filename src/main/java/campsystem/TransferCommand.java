package campsystem;

public class TransferCommand implements CampCommand {

    private final Dog targetDog;
    private final PlayArea newArea;

    public TransferCommand(Dog dog, PlayArea newArea) {
        this.targetDog = dog;
        this.newArea = newArea;
    }

    @Override
    public void execute() {
        // Implementation here
    }
}
