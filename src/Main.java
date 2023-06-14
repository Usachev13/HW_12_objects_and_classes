public class Main {
    public static void main(String[] args) {
        Author huxley = new Author("Олдос", "Хаксли");
        Author orwell = new Author("Джордж", "Оруэлл");
        Book braveNewWorld = new Book("Дивный новый мир", huxley, 1932);
        Book oneNineEightFour = new Book("1984", orwell, 1949);
        System.out.println(braveNewWorld);
        System.out.println(oneNineEightFour);

        braveNewWorld.setYear(1935);
        System.out.println(braveNewWorld);
    }
}