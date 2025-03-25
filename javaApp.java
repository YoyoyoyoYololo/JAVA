// Үндсэн программ
public class javaApp {
    public static void main(String[] args) {
        // Herd объект үүсгэх
        Herd herd = new Herd();

        // Төрөл бүрийн мал үүсгэх
        Horse horse = new Horse("Bor", 5);
        Sheep sheep = new Sheep("Hurel", 2);
        Camel camel = new Camel("Tsenher", 7);

        // Сүргэнд мал нэмэх
        herd.addLivestock(horse);
        herd.addLivestock(sheep);
        herd.addLivestock(camel);

        // Өдөр тутмын ажлыг эхлүүлэх
        System.out.println("Surgiin ajil ehelle");
        herd.dailyRoutine();
    }
}
