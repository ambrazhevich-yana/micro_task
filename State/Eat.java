public class Eat extends State {
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
        return "Kitten is eating";
    }
    @Override
    public String Play() {
        return "";
    }
}
