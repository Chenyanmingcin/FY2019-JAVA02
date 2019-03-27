import java.util.regex.Pattern;

public class work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		//test3();
		test4();
	}
	public static void test1() {
		  String zifuc=new String("1Na#2");
		  int countLow=0,countUp=0,countNum=0;
		  for(int i = 0;i<zifuc.length();i++){
		   if(zifuc.charAt(i)>='a'&&zifuc.charAt(i)<='z')
		    countLow++;
		   else if(zifuc.charAt(i)>='A'&&zifuc.charAt(i)<='Z')
		    countUp++;
		   else if(zifuc.charAt(i)>='0'&&zifuc.charAt(i)<='9')
			   countNum++;
		   else {
		   i++;
		   }
		   
		  }
		  System.out.println("大写英文字母个数为: "+countUp+"\n小写英文字母个数为: "+countLow+"\n数字个数为:"+countNum);
	}
	
	public static void test2() {
		String ss = new String("12sdfg2312");
		System.out.println(ss);
		String s="1";
		
		int count=0;
		for(int i = 0;i<ss.length();i++){
			   if(ss.charAt(i)=='1') {
				    count++;
			   }
		}
		System.out.println("出现过"+count+"次");
	
	}
	public static void test3() {
		String s1 ="asd";
		String s2 ="asd";
		if(s1.compareTo(s2)==0) {
			System.out.println("相等");
		}else {
			System.out.println("不相等");
		}
	}
	//编写程序将 “jdk” 全部变为大写,并输出到屏幕,截取子 串”DK” 并输出到屏幕
	public static void test4() {
		String ss ="jdk";
		ss=ss.toUpperCase();
		System.out.println(ss);
		System.out.println(ss.valueOf("DK"));
	}
}
