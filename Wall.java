/**
 * This class is a subclass of Entity.
 * It contains a wall name String variable and a list of all Paintings
 * on each wall.
 * It contains the following:
 * 		Constructor
 * 		Getters
 * 		Method to add paintings to the wall
 * 		toString
 * @author Sharon Shin
 */
package ShinICS372PA1;
import java.util.ArrayList;
import java.util.List;

public class Wall extends Entity{
	
	protected String wallName;
	protected List<Painting> paintings = new ArrayList<Painting>();
	
	/**
	 * Constructor that creates a wall object and sets its name
	 * @param wallName
	 */
	public Wall(String wallName) {
		super(wallName);
		this.wallName = wallName;
	}
	
	/**
	 * Getter that returns list of paintings on wall
	 * @return list of paintings
	 */
	public List<Painting> getPaintings(){
		return paintings;
	}
	
	/**
	 * Method that adds a painting object to the list of paintings
	 * on this wall object
	 * @param painting object
	 * @return returns the painting object added
	 */
	public Painting addPainting(Painting painting) {
		paintings.add(painting);
		return painting;
	}
	
	/**
	 * Getter that return the name of the wall
	 * @return name of wall
	 */
	public String getName() {
		return this.wallName;
	}
	
	@Override
    public String toString() {
        String temp = "";
        for(Painting painting : paintings) {
            temp += painting;
        }
        return temp;
    }
}
