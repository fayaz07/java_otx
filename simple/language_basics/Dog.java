public class Dog {
    String name;
    String says;

    public Dog(String name, String says) {
        this.name = name;
        this.says = says;
    }

    public void speak() {
        System.out.println(name + " says " + says);
    }

    public void bark() {
        System.out.println(this.says);
    }

    public void bark(String bark) {
        System.out.println(bark);
    }
}
