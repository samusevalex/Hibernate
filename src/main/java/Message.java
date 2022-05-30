import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Message {

    @Id
    @GeneratedValue
    private int id;
    
    private String text;
    
    public String getText(){
        return this.text;
    }
    public void setText(String text){
        this.text = text;
    }
}
