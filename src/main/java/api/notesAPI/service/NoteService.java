package api.notesAPI.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
 
import api.notesAPI.dao.NoteDAO;
import api.notesAPI.model.Note;
 
@Path("/")
public class NoteService {

    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<Note> getNotes_JSON(@QueryParam("query") String query) {
		List<Note> listOfNotes = NoteDAO.getAllNotes();
    	if (query != null) {
    		List<Note> filteredNotes = new ArrayList<Note>();
    		for (Note note: listOfNotes) {
    			Boolean match = Pattern.compile(Pattern.quote(query), Pattern.CASE_INSENSITIVE).matcher(note.getBody()).find();
    			if (match) {
    				filteredNotes.add(note);
    			}
    		}
    		return filteredNotes;
    	} else {
    		return listOfNotes;
    	}
    }
 
    @GET
    @Path("/{id}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Note getNote(@PathParam("id") Integer id) {
        return NoteDAO.getNote(id);
    }
 
    @POST
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Note addNote(Note note) {
        return NoteDAO.addNote(note);
    }
 
    @PUT
    @Path("/{id}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Note updateNote(@PathParam("id") Integer id, Note note) {
        return NoteDAO.updateNote(id, note);
    }
 
    @DELETE
    @Path("/{id}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public void deleteNote(@PathParam("id") Integer id) {
        NoteDAO.deleteNote(id);
    }
 
}
