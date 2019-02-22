package api.notesAPI.service;

import java.util.List;
 
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
 
import api.notesAPI.dao.NoteDAO;
import api.notesAPI.model.Note;
 
@Path("/")
public class NoteService {

    // URI:
    // /contextPath/servletPath/Notes
    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<Note> getNotes_JSON() {
        List<Note> listOfNotes = NoteDAO.getAllNotes();
        return listOfNotes;
    }
 
    // URI:
    // /contextPath/servletPath/Notes/{id}
    @GET
    @Path("/{id}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Note getNote(@PathParam("id") Integer id) {
        return NoteDAO.getNote(id);
    }
 
    // URI:
    // /contextPath/servletPath/Notes
    @POST
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Note addNote(Note note) {
        return NoteDAO.addNote(note);
    }
 
    // URI:
    // /contextPath/servletPath/Notes
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
