
public class Task {
	private String taskID;
	private String name;
	private String description;
	
	
	public Task(String taskID, String name, String description) {
		
		if (taskID.length() > 10 || taskID == null) {
			throw new IllegalArgumentException ("ID cannot be null or longer than 10 characters");
		}
		
		if (name.length() > 20 || name == null) {
			throw new IllegalArgumentException ("name cannot be null or longer than 20 chaacters");
		}
		
		if (description.length() > 50 || description == null) {
			throw new IllegalArgumentException ("description cannot be null or longer than 50 characters");
		}
		
		this.taskID = taskID;
		this.name = name;
		this.description = description;
	}
	
	public String getID() {
		return taskID;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	/*public Task getTask(String taskID) {
		
	}*/
	
	public void setName(String name) throws Exception {
		if (name.length() > 20 || name == null) {
			throw new Exception ("name cannot be null or longer than 20 chaacters");
		}
		this.name = name;
	}
	
	public void setDescription(String description) throws Exception{
		if (description.length() > 50 || description == null) {
			throw new Exception ("description cannot be null or longer than 50 characters");
		}
		this.description = description;
	}
	
	
}
