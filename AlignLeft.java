public class AlignLeft implements AlignStrategy {
    @Override
    public void render(String text) {
        System.out.println("[Left aligned] " + text);
    }
}
