public class JavaConstructors {
    public int modelyear;
    public String color;

    public JavaConstructors(String color, int modelyear) {   // creating a constructors witha parameters
        this.modelyear = modelyear;
        this.color = color;
    }
}

class Constructors{
    public static void main(String[] args) {
        JavaConstructors obj = new JavaConstructors("RED",2024);
        System.out.println(obj.modelyear);
        System.out.println(obj.color);
    }
}
