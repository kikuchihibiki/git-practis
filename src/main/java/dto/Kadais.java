package dto;

public class Kadais {
	private String name;
	private int age;
	private String gender;
	private String tell;
	private String mail;
	public Kadais(String name, int age, String gender, String tell, String mail) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.tell = tell;
		this.mail = mail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTell() {
		return tell;
	}
	public void setTell(String tell) {
		this.tell = tell;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
}
