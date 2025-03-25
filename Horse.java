class Horse extends Livestock implements WorkRole {
    public Horse(String name, int age) {
        super(name, age); // super ашиглан эцэг классын конструкторыг дуудна
    }
        @Override
    String makeSound() {
        return "Yantsgaana!";
    }

    // WorkRole интерфейсийн арга
    @Override
    public String performTask() {
        return "Mori dawhine";
    }
}