public class Play extends State {
    @Override
    public String message() {
        return Play();
    }
    @Override
    public String Sleep() {
        return "";
    }
    @Override
    public String Eat() {
        return "";
    }
    @Override
    public String Play() {
        return "Kitten is playing";
    }
}
