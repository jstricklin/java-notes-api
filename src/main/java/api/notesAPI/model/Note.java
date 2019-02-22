package api.notesAPI.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name = "note")
@XmlAccessorType(XmlAccessType.FIELD)
public class Note {
 
    private Integer id;
    private String body;
 
 
    // This default constructor is required if there are other constructors.
    public Note() {
 
    }
 
    public Note(Integer id, String body) {
        this.id = id;
        this.body = body;
    }
 
    public Integer getid() {
        return id;
    }
 
    public Integer setid(Integer id) {
        this.id = id;
        return id;
    }
 
    public String getbody() {
        return body;
    }
 
    public void setbody(String body) {
        this.body = body;
    }
 
}