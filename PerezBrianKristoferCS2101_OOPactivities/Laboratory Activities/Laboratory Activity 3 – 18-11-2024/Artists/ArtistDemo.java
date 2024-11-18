public class ArtistDemo {
    public static void main(String[] args) {

        Artist artist = new Artist("Leonardo Da Vinci", "Italian", 67, "Engineering");
        artist.displayInfo();

        System.out.println();

        Singer singer = new Singer("Rick Astley", "British",58, "Music", Genre.POP);
        singer.displayInfo();

        System.out.println();

        Painter painter = new Painter("Bob Ross", "American",52, "Painting", Medium.OIL);
        painter.displayInfo();

        System.out.println();

        Writer writer = new Writer("Jose Rizal", "Filipino",28, "Writing", WritingStyle.POETRY);
        writer.displayInfo();

        System.out.println();

        Dancer dancer = new Dancer("Michael Jackson", "American",50, "Dancing", DanceStyle.CONTEMPORARY);
        dancer.displayInfo();
    }
}
