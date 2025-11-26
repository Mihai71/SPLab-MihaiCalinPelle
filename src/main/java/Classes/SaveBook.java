package Classes;

public class SaveBook implements Command {
    @Override
    public void execute() {
        System.out.println("Modificarile au fost salvate");
    }
}