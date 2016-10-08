public class Main {

    public static void main(String [] args){
        Notebook n = new Notebook();
        System.out.println("Numbers of notes in the notebook is "+n.getSize());
        n.addNote();
        n.addNote();
        n.addNote();
        n.showAllNotes();
        n.editNote(1);
        n.showAllNotes();
        n.removeNote(2);
        n.showAllNotes();

    }
}
