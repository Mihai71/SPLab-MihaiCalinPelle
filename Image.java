public class Image implements Element {
    private String imageName;

    public Image(String imageName) {
        this.imageName = imageName;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    @Override
    public void print() {
        System.out.println("Image: " + imageName);
    }

    @Override
    public void add(Element e) {
        throw new UnsupportedOperationException("Cannot add element to Image");
    }

    @Override
    public void remove(Element e) {
        throw new UnsupportedOperationException("Cannot remove element from Image");
    }

    @Override
    public Element get(int index) {
        throw new UnsupportedOperationException("Image has no child elements");
    }
}
