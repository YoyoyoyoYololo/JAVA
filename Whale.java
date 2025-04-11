class Whale extends Livestock {
    public Whale (String name, int age) {
        super(name, age);
    }

    @Override
    String makeSound() {
        return "Moo!";
    }
    public String performTask() {
        return name +  "gedeg nertei halim dalaid selj bna";
    }
}
