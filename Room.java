/**
 * This class is a subclass of Entity.
 * It contains a room name String variable and a List of walls in the room.
 * It is made of the following:
 * 		Constructor
 * 		Getters
 * 		toString
 * 		Method to add walls
 * 		Method to get all Paintings in room
 * @author Sharon Shin
 */
package ShinICS372PA1;
import java.util.ArrayList;
import java.util.List;

public class Room extends Entity{
	
	protected String roomName;
	protected List<Wall> walls = new ArrayList<Wall>();
	
	/**
	 * Constructor that creates a Room object and names it
	 * @param name of room
	 */
	public Room(String roomName) {
		super(roomName);
		this.roomName = roomName;
	}
	
	/**
	 * This method returns the list of walls in order to grab all the paintings
	 * @return list of walls in the room
	 */
	public List<Wall> getPaintings(){
		return walls;
	}
	
	/**
	 * This adds a wall object to the list of walls in the room and names it
	 * @param name
	 * @return new wall added to room
	 */
	public Wall addWall(String name) {
		Wall newWall = new Wall(name);
		walls.add(newWall);
		return newWall;
	}
	
	/**
	 * Getter that returns the list of all walls in the room
	 * @return list of walls in the room
	 */
	public List<Wall> getWalls(){
		return walls;
	}
	
	/**
	 * Getter to return the name of the room
	 * @return name of room
	 */
	public String getName() {
		return this.roomName;
	}
	
	@Override
	public String toString() {
		String output = "";
		for(Wall wall : walls) {
			output += wall;
		}
		return output;
	}
	


	
}
