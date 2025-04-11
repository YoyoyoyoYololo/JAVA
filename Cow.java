class Cow extends Livestock {
    public Cow(String name, int age) {
        super(name, age);
    }

    @Override
    String makeSound() {
        return "Moo!";
    }

    public String performTask() {
        return "Tal nutagt uvs ideh";
    }
}
