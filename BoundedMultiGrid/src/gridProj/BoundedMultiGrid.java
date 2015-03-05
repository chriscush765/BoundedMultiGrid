package gridProj;

import info.gridworld.grid.*;

public class BoundedMultiGrid extends BoundedGrid {

	public BoundedMultiGrid(int rows, int cols) 
	{
		super(rows, cols);
	}
	
	public void add(Object o, int row, int col)
	{
		Location loc = new Location(row, col);
		if(get(loc) == null)
			put(loc, new ObjectStack());
		Object r = get(loc);
		if(r instanceof ObjectStack)
			((ObjectStack) r).add(o);
	}
	
}
