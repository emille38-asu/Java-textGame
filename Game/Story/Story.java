package Story;

public class Story {
    final String ANSI_YELLOW = "\u001B[33m";
    final String ANSI_RESET = "\u001B[0m";
    final String ANSI_PURPLE = "\033[0;35m";
    final String ANSI_BLUE = "\033[0;34m";

    // TODO // this shouldnt be in story

    public void CharacterCreation() {
        System.out.println(ANSI_YELLOW  + "Choose your class" + ANSI_RESET);
        System.out.println(ANSI_PURPLE  + "Physical" + ANSI_RESET);
        System.out.println(ANSI_BLUE  + "Mental" + ANSI_RESET);
    }
}
