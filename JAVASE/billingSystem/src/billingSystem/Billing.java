package billingSystem;

import java.util.Scanner;


public class Billing  {

	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserViewClass userViewClass1 = new UserViewClass();
		welcome();
		operation();
			
	}
	public static void welcome() {
		System.out.println("====ª∂”≠µ«¬Ω====");
		System.out.println("1°¢µ«¬Ω      2°¢◊¢≤·");
		
	}

	public static void operation(){
		UserViewClass userViewClass = new UserViewClass();
		Scanner s = new Scanner(System.in);
		int operation = s.nextInt();
		if(operation==1){
			try {
				userViewClass.login();
			} catch (LoginException e) {
				// TODO Auto-generated catch block
				String msg = e.getMessage();
				System.out.println(msg);
			}
		}else if(operation==2){
			try {
				userViewClass.register();
			} catch (RegisterException e) {
				// TODO Auto-generated catch block
				String msg = e.getMessage();
			}
		}else{
			System.out.println(" ‰»Î”–ŒÛ£¨«Î÷ÿ–¬ ‰»Î");
			operation();//µ›πÈµ˜”√
		}
	}
	
	
	
	
	
	
	
	
	


}
