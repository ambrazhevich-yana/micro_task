public class Sleep extends State {
    @Override
    public String message() {
        return Sleep();
    }
    @Override
    public String Sleep() {
        return "Kitten is sleeping";
    }
    @Override
    public String Eat() {
        return "";
    }
    @Override
    public String Play() {
        return "";
    }
}
