package billingSystem;

public interface UserBiz {

	public void register(String username, String password, String password2
	) throws RegisterException; //�û�ע��
	
	
	public void login(String username, String password) 
	throws LoginException; //�û������ж�
	
	public boolean isusernameexists(String username) 
	throws LoginException;//�û����ж�
		
		
}
