package billingSystem;

import java.util.Scanner;

public class UserViewClass implements UserView {

	public void login() {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.print("请输入用户名：");
		String username=s.nextLine();
		System.out.print("请输入密码：");
		String password=s.nextLine();
	   
	    //调用UserBiz 中的login 方法
	   
	}

	 public void register() {
		// TODO Auto-generated method stub
		 User user1 = new User();
		System.out.println("请注册用户：");
		Scanner s = new Scanner(System.in);
		System.out.print("请输入用户名：");
		String username=s.nextLine();
		
		System.out.print("请输入密码：");
		String password=s.nextLine();
		System.out.print("请再次输入密码：");
		String password2=s.nextLine();
		//调用用户注册和检验密码错误异常
		UserBizClass.register(username,password,password2);
		System.out.print("请输入真实姓名：");
		String name=s.nextLine();
		System.out.print("请输入电子邮件：");
		String email=s.nextLine();
		user1.setUser(username,password,name,email);
		
		
		
		
	}


}
