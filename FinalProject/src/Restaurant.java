import java.util.List;

public class Restaurant {

	private int id;
	private String name;
	private String description;
	private String menu;
	private String type;
	private String phoneNum;
	private String address;
	private List<Table> tables;
	
	public Restaurant(int id, String name, String description, String menu, String type, String phoneNum,
			String address, List<Table> tables) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.menu = menu;
		this.type = type;
		this.phoneNum = phoneNum;
		this.address = address;
		this.tables = tables;
	}
}
