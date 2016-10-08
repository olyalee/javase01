import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Olya Lee
 * @since 0.1.1
 */

public class Notebook {
    ArrayList<Note> notes;

    Notebook(){
        notes = new ArrayList<Note>();
        System.out.println("The notebook was created.");
    }
    /**
     * @return a size of the ArrayList notes
     */
    public int getSize(){
        if(notes.size()>0)
        {return notes.size();}
        else return 0;
    }

    /**
     * Allows to add a new note to the Notebook.
     * @return true - if the note was successfully added, otherwise false.
     */
    public boolean addNote(){
        Scanner sc = new Scanner(System.in);
        System.out.println("You can create a new note now:");
        Note n = new Note();
        n.setS(sc.nextLine());
        if(notes.add(n)){
        System.out.println("Your note was successfully added.");
        return true;}
        else return false;
    }

    /**
     * Allows to remove the note from Notebook. Gives an opportunity to the user to choose to remove the note by typing "yes" in a console.
     * @param i - the index of the note which should be removed.
     * @return true - if the note was successfully removed, otherwise false.
     */
    public boolean removeNote(int i){
        System.out.println("Are you sure you want to delete the note below?");
        System.out.println(notes.get(i).getS());
        System.out.println("Please type 'yes' if you do:");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        if(answer.equalsIgnoreCase("yes"))
        {
            notes.remove(i);
            return true;
        }
        else return false;
    }

    /**
     * Allows to edit the note from Notebook by rewriting something new instead. Gives an opportunity to the user to choose to edit the note by typing "yes" in a console.
     * @param i - the index of the not which should be edited.
     * @return true - if the note was successfully edited, otherwise false.
     */
    public boolean editNote(int i){
        System.out.println("Do you want to edit the note below?");
        System.out.println(notes.get(i).getS());
        System.out.println("Please type 'yes' if you do:");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        if(answer.equalsIgnoreCase("yes"))
        {
            System.out.println("Go ahead:");
            notes.get(i).setS(sc.nextLine());
            return true;
        }
        else return false;
    }

    /**
     * Allows to see notes from notebook all at once
     */
    public void showAllNotes(){
        System.out.println("The notebook currently have following notes:");
        for(Note n: notes) {
            System.out.println(n.getS());
        }
    }

}

/**
 * Class was designed for usage in Notebook and allows to write one note.
 */
class Note {
    private String s= "";

    void setS(String s){
        this.s = s;
    }

    String getS(){
        return s;
    }
}