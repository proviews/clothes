package cn.clothes.biz;

public class StorageJson{
	private Integer value;
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public StorageJson() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StorageJson(String name, Integer value) {
		super();
		this.name = name;
		this.value = value;
	}
}
