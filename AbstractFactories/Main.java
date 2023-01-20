public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Cat Black = factory.create("Black");
        Cat White = factory.create("White");
        Cat Red_headed = factory.create("Red_headed ");
        Cat Grey = factory.create("Gray");
        Black.feed();
        White.feed();
        Red_headed.feed();
    }
}
interface Cat {
    void feed();
}

class Black implements Cat{
    @Override
    public void feed() {
        System.out.println("Black cat!");
    }
}

class White implements Cat{
    @Override
    public void feed() {
        System.out.println("White cat!");
    }
}

class Red_headed implements Cat{
    @Override
    public void feed() {
        System.out.println("Red_headed cat!");
    }
}

class Factory{

    public Cat create(String TypeOfCat){
        switch (TypeOfCat) {
            case "Black" : return new Black();
            case "White" : return new White();
            case "Red_headed" : return new Red_headed();
            default : return null;
        }
    }
}