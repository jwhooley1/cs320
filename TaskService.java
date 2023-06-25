import java.util.ArrayList;

public class TaskService {
	static ArrayList<Task> tasks = new ArrayList<Task>(0);
	
	public static Task addTask(String taskID, String name, String description) throws Exception {
		Task task = new Task(taskID, name, description);
		return task;
	}
	
	public static void deleteTask(String taskID) {
		for (int i = 0; i<tasks.size(); i++) {
			if (tasks.get(i).getID() == taskID) {
				int position = i;
				tasks.remove(position);
			}
		}
	}
	
	public void updateTask(String taskID, String name, String description) throws Exception {
		
		for (int i = 0; i<tasks.size(); i++) {
			if (tasks.get(i).getID() == taskID) {
				tasks.get(i).setName(name);
				tasks.get(i).setDescription(description);
			}
		}
		
	}

}
