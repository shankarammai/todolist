public class TodoListItem {
private String description;
private int priority;
private boolean isdone;
	public TodoListItem(String description, int priority) {
		// TODO Auto-generated constructor stub
		this.description=description;
		this.priority=priority;
		this.isdone=false;
	}

	public String getDescription() {
		// TODO Auto-generated method stub
		return this.description;
	}

	public int getPriority() {
		// TODO Auto-generated method stub
		return this.priority;
	}

	public boolean isDone() {
		// TODO Auto-generated method stub
		return this.isdone;
	}

	public void markDone() {
		// TODO Auto-generated method stub
		this.isdone=true;
		
	}

}
