package billingSystem;

import java.util.Scanner;

public class UserViewClass implements UserView {
	
	
	UserBiz userBiz = new UserBizClass();
	



	public void login() throws LoginException{
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		
		System.out.print("请输入用户名:");
		String username=s.next();
		
		boolean usernameexists=userBiz.isusernameexists(username);
		if(usernameexists) {
			System.out.print("请输入密码:");
			String password=s.next();
			userBiz.login(username, password);
		}
	   
	}

	 public void register() throws RegisterException {
		// TODO Auto-generated method stub
		User user = new User();
		UserBizClass userBizClass = new UserBizClass();
		System.out.println("请注册用户：");
		Scanner s = new Scanner(System.in);
		
		System.out.print("请输入用户名：");
		String username=s.nextLine();
		
		System.out.print("请输入密码：");
		String password=s.nextLine();
		
		System.out.print("请再次输入密码：");
		String password2=s.nextLine();
		
		
		//调用用户注册和检验密码错误异常
		userBizClass.register(username,password,password2);
		System.out.print("请输入真实姓名：");
		String name=s.nextLine();
		
		System.out.print("请输入电子邮件：");
		String email=s.nextLine();
//		user.setUser(username,password,name,email);
//		for(int i =0;;i++) {
//			if(UserBizClass.user[i]==null) {
//				UserBizClass.user[i]=user;
//				break;
//			}
//		}
		
		
		
	}

	

	


}
