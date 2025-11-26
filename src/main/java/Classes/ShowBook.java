package Classes;

public class ShowBook implements Command {
    @Override
    public void execute() {
        System.out.println("Cartea a fost afisata");
    }
}