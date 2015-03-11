package gridProj;

import java.security.InvalidParameterException;
import java.util.ArrayList;

import info.gridworld.grid.*;

public class BoundedMultiGrid extends BoundedGrid {

	public BoundedMultiGrid(int rows, int cols) 
	{
		super(rows, cols);
	}
	
	public void add(Object ObjectToAdd, int row, int col)
	{
		Location LocationToAdd = new Location(row, col);
		Object CurrentObject = get(LocationToAdd);
		if(CurrentObject == null)
			put(LocationToAdd, new ObjectStack());
		if(CurrentObject instanceof ObjectStack)
			((ObjectStack) CurrentObject).add(ObjectToAdd);
	}
	
	public Object get(Location locationToGet)
	{
		if(super.get(locationToGet) == null)
			super.put(locationToGet, new ObjectStack());
		
		if(!isValid(locationToGet))
			throw new InvalidParameterException();
		
		ObjectStack stack = (ObjectStack) super.get(locationToGet);
		
		return stack.get();
	}
	
	public Object put(Location locationToPut, Object objectToPut)
	{
		ObjectStack stack = (ObjectStack) get(locationToPut);
		return stack.add(objectToPut);
	}
	
	public boolean isValid(Location locationToCheck)
	{
		return get(locationToCheck) instanceof ObjectStack;
	}
	
	public Object remove(Location locationToRemove)
	{
		ObjectStack stack = (ObjectStack) get(locationToRemove);
		return stack.remove();
		
	}
	
	//Chris I don't know what this does!! no joovaduck = bad
	//TODO put some freaking documentation
	public ArrayList getOccupiedLocations()
	{
		ArrayList locations = super.getOccupiedLocations();
		for(ObjectStack stack : locations){
			//using get() will return a Location object
			//not sure how to get the ObjectStack from there. maybe instanceof, but I'm too lazy
			if(stack.get().get())
				
		}
	}
	
	

}
