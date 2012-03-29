package models;

import javax.persistence.Entity;
import javax.persistence.Lob;

import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Project extends Model {
	
	@Required
	public String name;
	
	@Required
	public User manager;
	
	@Lob
	public String description;
}
