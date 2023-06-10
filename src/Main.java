public class Main {
    public static void main(String[] args) {
        Author huxley = new Author("Олдос", "Хаксли");
        Author orwell = new Author("Джордж", "Оруэлл");
        Book braveNewWorld = new Book("Дивный новый мир", huxley, 1932);
        Book oneNineEightFour = new Book("1984", orwell, 1949);
        System.out.println(braveNewWorld.getName() + " - " + braveNewWorld.getAuthor().getName() + " " + braveNewWorld.getAuthor().getSurname() + " - " + braveNewWorld.getYear());
        System.out.println(oneNineEightFour.getName() + " - " + oneNineEightFour.getAuthor().getName() + " " + oneNineEightFour.getAuthor().getSurname() + " - " + oneNineEightFour.getYear());

        braveNewWorld.setYear(1935);
        System.out.println(braveNewWorld.getYear());
    }
}