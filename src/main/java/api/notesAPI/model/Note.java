package api.notesAPI.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name = "note")
@XmlAccessorType(XmlAccessType.FIELD)
public class Note {
 
    private Integer id;
    private String body;
 
 

    public Note() {
 
    }
 
    public Note(Integer id, String body) {
        this.id = id;
        this.body = body;
    }
 
    public Integer getid() {
        return id;
    }
 
    public Integer setId(Integer id) {
        this.id = id;
        return id;
    }
 
    public String getBody() {
        return body;
    }
 
    public void setBody(String body) {
        this.body = body;
    }
 
}