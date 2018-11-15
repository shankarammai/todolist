import java.util.ArrayList;
import java.util.List;

public class TodoList {
    /*
     * Add a new item to the list, given a description and priority.
     */
	List<TodoListItem> listofitems=new ArrayList<>();
    public void addItem(String description, int priority) {
        // TODO
    	TodoListItem item = new TodoListItem(description,priority );
    	listofitems.add(item);
    }
    
    /*
     * Get the item at a given index.
     */
    public TodoListItem getItem(int i) {
        // TODO
        return listofitems.get(i);
    }
    
    /*
     * Get the number of items in the list.
     */
    public int size() {
        // TODO
        return listofitems.size();
    }
    
    /*
     * Find the first item in the list which is not marked "done".
     * If all items are marked "done", this method returns null.
     */
    public TodoListItem findFirstNotDone() {
        // TODO
    	TodoListItem myitem = null;
    	for (int i=0; i<listofitems.size();i++) {
    		myitem=listofitems.get(i);
    		if(myitem.isDone()) {
    			myitem=null;
    			continue;}
    		else {
    			break;
    		}
    	}
    	return myitem;
    }
    
    /*
     * Find the highest-priority item which is not marked "done".
     * If all items are marked "done", this method returns null.
     */
    public TodoListItem findHighestPriorityNotDone() {
        // TODO
    	TodoListItem myitem = null;
    	TodoListItem currenthighestnotdone= null;
    	int highestpriority=0;
    	for (int i=0; i<listofitems.size();i++){
    		myitem=listofitems.get(i);
    		if(myitem.isDone()) {
    			myitem=currenthighestnotdone;
    			continue;}
    		else {
    			
    			if (myitem.getPriority()>highestpriority) {
    				System.out.println(myitem.getPriority());
    				highestpriority=myitem.getPriority();
    				currenthighestnotdone=myitem;
    			}
    		}
    		}
        return myitem;
    }
    
    /*
     * Search for items whose description contains the given text.
     * The descriptions are returned in a list.
     */
    public List<String> search(String text) {
        // TODO
        return null;
    }
}
