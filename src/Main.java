public class Main {
    public static void main(String[] args) {
        Author pushkin = new Author("Aleksander", "Pushkin");
        Author kuzmin = new Author("Pavel", "Kuzmin");
        Book avengers = new Book("Avengers", pushkin, 1932);
        Book vremyarik = new Book("Vremyarik", kuzmin, 2012);
        System.out.println("avengers.getReleaseYear() = " + avengers.getReleaseYear());
        avengers.setReleaseYear(2000);
        System.out.println("avengers.getReleaseYear() = " + avengers.getReleaseYear());
    }
}