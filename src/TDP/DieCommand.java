package TDP;

public class DieCommand extends LifeCommand {

    public DieCommand(Cell cell) {
        super(cell);
    }

    @Override
    public void execute() {
        target.die();
    }
}
