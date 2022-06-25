package et.gov.moa.model;
import javax.persistence.*;
 
@Entity
@Table(name = "role")
public class Role {
    @Id
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
     
    private String name;
    public Integer getId() {
        return id;
    }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(Integer id) {
		this.id = id;
	}
 
    
}