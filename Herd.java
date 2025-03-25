import java.util.ArrayList;

class Herd {
    private ArrayList<Livestock> livestock = new ArrayList<>();

    // Мал нэмэх
    void addLivestock(Livestock animal) {
        livestock.add(animal);
    }

    // Өдөр тутмын ажлыг гүйцэтгэх - полиморфизм
    void dailyRoutine() {
        for (Livestock animal : livestock) {
            System.out.println(animal.name + ": " + animal.makeSound());
            // instanceof ашиглан WorkRole-ийг шалгаж, casting хийнэ
            if (animal instanceof WorkRole) {
                System.out.println(((WorkRole) animal).performTask());
            }
            animal.graze(); // Энгийн graze дуудлага
            animal.graze("uvs"); // Хэт ачаалалтай graze
            System.out.println("---");
        }
    }
}