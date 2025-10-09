public class Main {
    public static void main(String[] args) {
        Book noapteBuna = new Book("Noapte buna, copii!");
        Author rpGheo = new Author("Radu Pavel Gheo");
        noapteBuna.addAuthor(rpGheo);

        Chapter cap1 = new Chapter("Capitolul 1");
        SubChapter cap11 = new SubChapter("Capitolul 1.1");
        SubChapter cap111 = new SubChapter("Capitolul 1.1.1");
        SubChapter cap1111 = new SubChapter("Capitolul 1.1.1.1");

        cap1111.addParagraph(new Paragraph("Multumesc celor care ..."));
        cap11.addParagraph(new Paragraph("Text from subchapter 1.1"));
        cap111.addParagraph(new Paragraph("Text from subchapter 1.1.1"));
        cap1111.addImage(new Image("Image subchapter 1.1.1.1"));

        cap111.addSubChapter(cap1111);
        cap11.addSubChapter(cap111);
        cap1.addSubChapter(cap11);

        noapteBuna.addChapter(cap1);

        noapteBuna.print();
    }
}