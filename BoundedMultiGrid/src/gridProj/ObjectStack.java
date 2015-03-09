package gridProj;

import java.util.ArrayList;

public class ObjectStack {
	
	private ArrayList list = new ArrayList();

	/**
	 * Adds an object on top of the stack
	 * @param obj the object to add
	 */
	public Object add(Object obj){
		list.add(obj);
		return obj;
	}
	
	/**
	 * Adds an object at a certain position and moves everything else up the stack
	 * @param position the position in the stack
	 * @param obj the object to add
	 */
	public Object add(int position, Object obj){
		list.add(position, obj);
		return obj;
		
	}
	
	/**
	 * Removes an object from the stack
	 * @param obj
	 */
	public void remove(Object obj){
		list.remove(obj);
	}
	
	/**
	 * Removes an object at a certain position and moves everything else up the stack
	 * @param position The position in the stack
	 */
	public void remove(int position)
	{
		ArrayList a = new ArrayList();
		for(int x = 0; x < list.size(); x++)
		{
			if(position != x)
				a.add(list.get(x));
		}
		list = a;
	}
	
	/**
	 * Removes the topmost object from the stack
	 */
	public Object remove(){
		return list.remove(size()-1);
	}
	
	/**
	 * @return returns the stack as an ArrayList
	 */
	public Object get(){
		return list.get(size() - 1);
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
