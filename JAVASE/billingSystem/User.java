package billingSystem;

public class User {
	
	String username;
    static String password;
	String name;
	String email;
	public User(String username,String password,String name,String email) {
		// TODO Auto-generated constructor stub
		this.username = username;
		this.password = password;
		this.name=name;
		this.email=email;
	}
	public User() {
		
	}
	public void setUser(String username,String password,String name,String email) {
		this.username = username;
		this.password = password;
		this.name=name;
		this.email=email;
	}
	public void getUser(String username,String password,String name,String email) {
		this.username = username;
		this.password = password;
		this.name=name;
		this.email=email;
	}

}
