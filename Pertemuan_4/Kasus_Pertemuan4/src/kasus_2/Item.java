package kasus_2;

public class Item {
	private String name;
	

	private Item() {
		name = "Ipin";
	}

	public Item(String name) {
		this();
		System.out.println(this.name);
	}

}
