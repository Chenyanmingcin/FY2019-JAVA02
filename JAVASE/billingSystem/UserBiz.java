package billingSystem;

public interface UserBiz {

	void register(String username, String password, String password2
	) throws RegisterException; //�û�ע��
	
	
	void login(String username, String password) 
	throws LoginException; //�û���¼
}
