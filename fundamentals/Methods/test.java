public class test {

    public static void main(String[] arg) {
        String name = "Hanz";
        int age = 34;
        hello(name, age);
    }

    static void hello(String name, int age) {
        System.out.println("Hello!" + name);
        System.out.println("you are " + age);
    }
}