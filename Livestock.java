
// Абстракт класс: Livestock (Мал)
abstract class Livestock {
    String name;
    int age;

    public Livestock(String name, int age) {
        this.name = name; // this ашиглан хувьсагчийг эхлүүлэх
        this.age = age;
    }

    // Абстракт арга - дэд классууд хэрэгжүүлнэ
    abstract String makeSound();

    // Энгийн graze арга
    void graze() {
        System.out.println(this.name + " talbaid belchene");
    }

    // Overloading - graze аргыг хэт ачаалалтай болгох
    void graze(String food) {
        System.out.println(this.name + " " + food + "-g belcheene");
    }
}