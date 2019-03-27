package billingSystem;

public interface UserBiz {

	public void register(String username, String password, String password2
	) throws RegisterException; //用户注册
	
	
	public void login(String username, String password) 
	throws LoginException; //用户密码判断
	
	public boolean isusernameexists(String username) 
	throws LoginException;//用户名判断
		
		
}
