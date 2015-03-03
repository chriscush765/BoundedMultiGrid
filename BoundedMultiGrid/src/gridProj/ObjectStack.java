package gridProj;

import java.util.ArrayList;

public class ObjectStack {
	
	private ArrayList list = new ArrayList();

	/**
	 * Adds an object on top of the stack
	 * @param obj the object to add
	 */
	public void add(Object obj){
		list.add(obj);
	}
	
	/**
	 * Adds an object at a certain position and moves everything else up the stack
	 * @param position the position in the stack
	 * @param obj the object to add
	 */
	public void add(int position, Object obj){
		list.add(position, obj);
	}
	
	/**
	 * Removes an object from the stack
	 * @param obj
	 */
	public void remove(Object obj){
		list.remove(obj);
	}
	
	/**
	 * Removes the topmost object from the stack
	 */
	public void remove(){
		list.remove(size());
	}
	
	/**
	 * @return returns the stack as an ArrayList
	 */
	public ArrayList get(){
		return list;
	}
	
	/**
	 * Clears the stack, leaving it empty
	 */
	public void clear(){
		list.clear();
	}
	
	/**
	 * @return the size of the stack
	 */
	public int size(){
		return list.size();
	}
	
	
}
