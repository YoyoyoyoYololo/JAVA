class Camel extends Livestock implements WorkRole {
    public Camel(String name, int age) {
        super(name, age);
    }

    @Override
    String makeSound() {
        return "duugarna!";
    }

    @Override
    public String performTask() {
        return "Temeeg gobid unana";
    }
}