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
//	  ��¼ login ��������������������׳��쳣��
//    1�� username ������
	
	public boolean isusernameexists(String username) throws LoginException {
		// TODO Auto-generated method stub
		for(int i=0;i<users.length;i++) {
			
			User user=users[i];
			if(user==null) {
				continue;
			}
			
			String _username=user.getUsername();
			
			if(_username.equals(username)) {//�û�������
				
			   return true;
			}
			
		}
		
		 throw new LoginException("�û���������");
		
	}

	
	
	
	
	
//    2�� username ��password ��ƥ��
	public void login(String username, String password) 
			 throws LoginException {
		// TODO Auto-generated method stub
	
		boolean usernameexists=false;//Ĭ���û���������
		for(int i=0;i<users.length;i++) {
			
			User user=users[i];
			if(user==null) {
				continue;
			}
			
			String _username=user.getUsername();
			String _password=user.getPassword();
			if(_username.equals(username)) {//�û�������
				usernameexists=true;
				
				if(password.equals(_password)) {//��¼�ɹ�
					System.out.println("��¼�ɹ�!!!");
				}else {//username ��password ��ƥ��
					throw new LoginException("�û��������벻ƥ��"); 
				}
			}
			
		}
		
		
		
		
		if(!usernameexists) {//�û���������
			
			throw new LoginException("�û���������");
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
	//System.out.println("��¼�ɹ���");

	
	
	
	//registerע��
	//1�� username �������� ���Ѵ���	
	//2�� ���������password ��һ��












}
