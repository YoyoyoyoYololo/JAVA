class Monkey extends Livestock {
    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    String makeSound() {
        return "Yakikikikiki yahuuuuu yahiiii";
    }

    public String performTask() {
        return "Monkey" + name + " banana idej baina";
    }
}
