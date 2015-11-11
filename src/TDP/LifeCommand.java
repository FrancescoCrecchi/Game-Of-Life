package TDP;

public abstract class LifeCommand {

    protected Cell target;

    public LifeCommand(Cell cell) {
        target = cell;
    }

    public abstract void execute();
}
