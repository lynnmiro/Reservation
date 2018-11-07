public class Table {
	
	private int id;
	private int resturantid;
	private int capacity;
	private boolean reservedSW;
	
	public Table(int id, int resturantid, int capacity, boolean reservedSW) {
		this.id = id;
		this.resturantid = resturantid;
		this.capacity = capacity;
		this.reservedSW = reservedSW;
	}
}
