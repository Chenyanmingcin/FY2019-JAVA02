package billingSystem;

public  class UserBizClass implements UserBiz {
		
	User[] user = new User[5];
	
	public static void initData(User[] user){
		User user1 =new User("admin","admin","Administrator","admin@123.com");
		user[0] = user1;
		User user2 =new User("tom","cat","tomcat","tomcat@cat.com");
		user[1] = user2;
		
		
	}

	//interface
	//register
	//1�� username �������� ���Ѵ���
	//2�� ���������password ��һ��
	public void register(String username,String password,String password2)
					throws RegisterException {
				// TODO Auto-generated method stub
			 for(int i = 0;i<user.length;i++) {
				 if(username.equals(user[i].username)&&password2.equals(password2)) {
					 
				 }
			 }
			 	
		}
//		   login ��������������������׳��쳣��
//		    1�� username ������
//		    2�� username ��password ��ƥ��
		public void login(String username, String password) 
					 throws LoginException {
				// TODO Auto-generated method stub

		}



}
