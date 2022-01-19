/**
 	*This class is a subclass of Entity.
 	*It is made of the following:
 	*	Constructor
 	*	Getters
 	*	List of rooms in the Museum
 	*	toString
 	*	Method to return all paintings in the Museum 
 	*@author Sharon Shin
 */
package ShinICS372PA1;
import java.util.ArrayList;
import java.util.List;

public class Museum extends Entity{
	protected String museumName;
	/**
	 * Room objects are stored in a List
	 */
	protected List<Room> rooms = new ArrayList<Room>();

	/**
	 * Constructor that takes in the museum name and sets it
	 * @param museumName
	 */
	public Museum(String museumName) {
		super(museumName);
		this.museumName = museumName;
	}
	
	/**
	 * Method that returns the list of rooms in order to grab all paintings
	 * @return all rooms in the museum
	 */
	public List<Room> getPaintings(){
		return rooms;
	}
	
	/**
	 * Adds a room to the museum, names it, and adds it to the List of rooms
	 * @param name of room
	 * @return the room object that was created
	 */
	public Room addRoom(String name) {
		Room newRoom = new Room(name);
		rooms.add(newRoom);
		return newRoom;
	}
	
	/**
	 * Getter to get the list of all rooms in the museum
	 * @return all rooms in the museum
	 */
	public List<Room> getRooms() {
		return rooms;
	}
	
	/**
	 * Getter to return the name of the Museum
	 * @return name of the museum
	 */
	public String getName() {
		return this.museumName;
	}
	
	@Override
	public String toString() {
		String output = "";
		for(Room room : rooms) {
			output += room.getName();
		}
		return output;
	}
	
	
}
