/**
 * This class is a subclass of Entity.
 * It contains a painting name and wall name String variable
 * It contains the following methods:
 * 		Constructors
 * 		Method to set the wall that a painting is on
 * 		Getters
 * 		toString
 * @author Sharon Shin
 */
package ShinICS372PA1;

public class Painting extends Entity{

	protected String paintingName;
	protected String wallName;
	
	/**
	 * Constructor that creates a painting object and names it
	 * @param paintingName
	 */
	public Painting(String paintingName) {
		super(paintingName);
		this.paintingName = paintingName;
	}
	
	/**
	 * This method sets the wall that this painting is on
	 * and sets the wall name variable in this class
	 * @param wall object
	 */
	public void setWall(Wall wall) {
		wall.addPainting(this);
		wallName = wall.getName();
	}
	
	/**
	 * Getter that returns the painting name
	 * @return painting name
	 */
	public String getName() {
		return this.paintingName;
	}
	
	/**
	 * Getter that returns the wall name
	 * @return wall name
	 */
	public String getWallName() {
		return this.wallName;
	}
	
	@Override
	public String toString() {
		return "Painting " + this.paintingName + " on wall " + this.wallName;
	}



}
