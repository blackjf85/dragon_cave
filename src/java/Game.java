public class Game {
    public static void main(String[] args){
        Story.story();
        int choice = Choice.getChoice();
        if (choice == -1){
            System.out.println("The angry dragons exit their caves and gobble you down violently.");
        } else {
            Result.ending(choice);
        }
    }
}
