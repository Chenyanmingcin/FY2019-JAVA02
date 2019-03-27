
public class test {
	private String username;
	private String password;
	private int id;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test user1 = new test("admin","admin");
		test user2 = new test("admin","123");
		
		//System.out.println(user1.hashCode());
		
		//System.out.println(user1);
		//System.out.println(user1.toString());
		
		byte[] b = {1,2,3};
		String ss=new String(b);
		System.out.println(ss.toCharArray());
		
		String s1=new String("abc");
		String s2=new String("abc");
		
		//System.out.println(s1==s2);
		//System.out.println(s1.equals(s2));
		
		String s3="abc";
		String s4="abc";
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		//jvm进行静态区优化
		
		String s=new String("abcabcabcd");
		System.out.println(s);
		
		
//		if(user1.equals(user2)) {
//			System.out.print("相等");
//		}else {
//			System.out.print("不相等");
//		}
	}
	
	public String toString() {
		return this.username+this.password;
	}
	
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
		}
		//向下转型
		test user=(test)obj;
		if(user.getUsername().equals(username)) {
			return true;
		}
		return false;
	}
	
	
	
	
	
	public test(String username,String password) {
		super();
		this.username=username;
		this.password=password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
