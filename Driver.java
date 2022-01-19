package ShinICS372PA1;

public class Driver {

	public static void main(String[] args) {
		Museum museum = new Museum("M1");
		 Room room1 = museum.addRoom("r1");
		 Room room2 = museum.addRoom("r2");
		 Painting painting1 = new Painting("p1");
		 Painting painting2 = new Painting("p2");
		 Wall wall1 = room1.addWall("w1");
		 Wall wall2 = room2.addWall("w2");
		 painting1.setWall(wall1);
		 painting2.setWall(wall2);
		 System.out.println(wall1.getPaintings());
		 System.out.println(wall2.getPaintings());
		 System.out.println(room1.getPaintings());
		 System.out.println(room2.getPaintings());
		 System.out.println(museum.getPaintings());

	}
}
