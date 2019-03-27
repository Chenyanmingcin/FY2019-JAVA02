package billingSystem;


public  class UserBizClass implements UserBiz {
		
	private User[] users = new User[5];
	
	public UserBizClass() {
		User user1 =new User("admin","admin","Administrator","admin@123.com");
		this.users[0] = user1;
		User user2 =new User("tom","cat","tomcat","tomcat@cat.com");
		this.users[1] = user2;
	}
//interface	
//	  登录 login 方法在以下两种情况下抛出异常：
//    1） username 不存在
	
	public boolean isusernameexists(String username) throws LoginException {
		// TODO Auto-generated method stub
		for(int i=0;i<users.length;i++) {
			
			User user=users[i];
			if(user==null) {
				continue;
			}
			
			String _username=user.getUsername();
			
			if(_username.equals(username)) {//用户名存在
				
			   return true;
			}
			
		}
		
		 throw new LoginException("用户名不存在");
		
	}

	
	
	
	
	
//    2） username 和password 不匹配
	public void login(String username, String password) 
			 throws LoginException {
		// TODO Auto-generated method stub
	
		boolean usernameexists=false;//默认用户名不存在
		for(int i=0;i<users.length;i++) {
			
			User user=users[i];
			if(user==null) {
				continue;
			}
			
			String _username=user.getUsername();
			String _password=user.getPassword();
			if(_username.equals(username)) {//用户名存在
				usernameexists=true;
				
				if(password.equals(_password)) {//登录成功
					System.out.println("登录成功!!!");
				}else {//username 和password 不匹配
					throw new LoginException("用户名与密码不匹配"); 
				}
			}
			
		}
		
		
		
		
		if(!usernameexists) {//用户名不存在
			
			throw new LoginException("用户名不存在");
		}
		
		
	
		
	}
	//for(int j = 0;j<user.length;j++) {

	@Override
	public void register(String username, String password, String password2) throws RegisterException {
		// TODO Auto-generated method stub
		
		
	}


		
		//if(username.equals(user[j].username)&&password.equals(user[j].password)) {
			//break;
			//}
		//}
	//System.out.println("登录成功！");

	
	
	
	//register注册
	//1） username 在数组中 中已存在	
	//2） 两次输入的password 不一致












}
