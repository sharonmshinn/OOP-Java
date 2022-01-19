	/**
	 	*Entity is the wrapper or super class of Museum, Room, Wall, and Painting
	 	*It is made of the following:
	 	*	Constructor
	 	*	Getter and setter
	 	*@author Sharon Shin
	 */
package ShinICS372PA1;
public class Entity {
	protected String entityName;
	
	/**
	 * This method is a constructor that sets the entity name
	 * @param name
	 */
	public Entity(String name) {
		this.entityName = name;
	}
	
	/**
	 * Setter for the entity name
	 * @param name
	 */
	public void setName(String name) {
		this.entityName = name;
	}
	
	/**
	 * Getter for entity name
	 * @return entity name
	 */
	public String getName() {
		return this.entityName;
	}
}
