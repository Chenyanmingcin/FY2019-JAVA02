package billingSystem;

import java.util.Scanner;

public class UserViewClass implements UserView {

	public void login() {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.print("�������û�����");
		String username=s.nextLine();
		System.out.print("���������룺");
		String password=s.nextLine();
	   
	    //����UserBiz �е�login ����
	   
	}

	 public void register() {
		// TODO Auto-generated method stub
		 User user1 = new User();
		System.out.println("��ע���û���");
		Scanner s = new Scanner(System.in);
		System.out.print("�������û�����");
		String username=s.nextLine();
		
		System.out.print("���������룺");
		String password=s.nextLine();
		System.out.print("���ٴ��������룺");
		String password2=s.nextLine();
		//�����û�ע��ͼ�����������쳣
		UserBizClass.register(username,password,password2);
		System.out.print("��������ʵ������");
		String name=s.nextLine();
		System.out.print("����������ʼ���");
		String email=s.nextLine();
		user1.setUser(username,password,name,email);
		
		
		
		
	}


}
