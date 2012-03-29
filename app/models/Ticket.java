package models;

import javax.persistence.Entity;
import javax.persistence.Id;

import play.data.validation.Required;
import play.db.jpa.Model;

@Entity
public class Ticket extends Model {
    
    @Required
    public String name;
    
    @Required
    public String description;
    
    @Required
    public Project project;
    
    public int firstBuildSeen;
    
    public int mostRecentSeen;
    
    @Required
    public User requestor;
    
    @Required
    public User assignedTo;
}
