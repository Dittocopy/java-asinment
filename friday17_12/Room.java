package friday17_12;

class Room {
	private int roomNum;
	private int roomArea;
	private String roomType;
	private boolean acMachine;

	public Room() {
		// TODO Auto-generated constructor stub
	}

	public Room(int roomNum, int roomArea, String roomType, boolean acMachine) {
		this.roomNum = roomNum;
		this.roomArea = roomArea;
		this.roomType = roomType;
		this.acMachine = acMachine;
	}

	public int getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(int roomNum) {
		this.roomNum = roomNum;
	}

	public int getRoomArea() {
		return roomArea;
	}

	public void setRoomArea(int roomArea) {
		this.roomArea = roomArea;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public boolean isAcMachine() {
		return acMachine;
	}

	public void setAcMachine(boolean acMachine) {
		this.acMachine = acMachine;
	}

	void displayData() {
		System.out.println(getRoomNum());
		System.out.println(getRoomArea());
		System.out.println(getRoomType());
		String s = (acMachine) ? "Yes" : "No";
		System.out.println(s);
	}

	public static void main(String[] args) {
		Room r1 = new Room();
		r1.setRoomNum(101);
		r1.setRoomArea(550);
		r1.setRoomType("delux");
		r1.setAcMachine(true);

		r1.displayData();
	}
}