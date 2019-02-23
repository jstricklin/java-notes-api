package api.notesAPI.dao;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
import api.notesAPI.model.Note;
 
public class NoteDAO {
 
    private static final Map<Integer, Note> noteMap = new HashMap<Integer, Note>();
 
    static {
        initNotes();
    }
 
    private static void initNotes() {
        Note note1 = new Note(1, "Ask Larry about those TPS reports!");
        Note note2 = new Note(2, "Pick up milk!");
        Note note3 = new Note(3, "Do some other stuff.");
 
        noteMap.put(note1.getid(), note1);
        noteMap.put(note2.getid(), note2);
        noteMap.put(note3.getid(), note3);
    }
 
    public static Note getNote(Integer id) {
        return noteMap.get(id);
    }
 
    public static Note addNote(Note note) {
    	Integer newId = noteMap.values().toArray(new Note[0]).length + 1;
        noteMap.put(note.setId(newId), note);
        return note;
    }
 
    public static Note updateNote(Integer id, Note note) {
        noteMap.put(note.setId(id), note);
        return note;
    }
 
    public static void deleteNote(Integer id) {
        noteMap.remove(id);
    }
 
    public static List<Note> getAllNotes() {
        Collection<Note> c = noteMap.values();
        List<Note> list = new ArrayList<Note>();
        list.addAll(c);
        return list;
    }
     
    List<Note> list;
 
}