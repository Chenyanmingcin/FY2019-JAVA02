import java.util.regex.Pattern;

public class work {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		//test2();
		//test3();
		//test4();
		//test5();
		//test6();
		//test7();
		//test8();
		//test9();
	}
	//输出一个字符串中的大写英文字母数，小写英文 字母数以及非英文字母数。 
	//A-Z(65-90) a-z(97-122)     
	public static void test1() {
		  String zifuc=new String("12Na2");
		  int countLow=0,countUp=0,countNo=0;
		  for(int i = 0;i<zifuc.length();i++){
		   if(zifuc.charAt(i)>='a'&&zifuc.charAt(i)<='z')
		    countLow++;
		   else if(zifuc.charAt(i)>='A'&&zifuc.charAt(i)<='Z')
		    countUp++;
		   else if(zifuc.charAt(i)>='0'&&zifuc.charAt(i)<='9')
			   countNo++;
		   else {
			   i++;
		   }
		   
		  }
		  System.out.println("大写英文字母个数为: "+countUp+"\n小写英文字母个数为: "+countLow+"\n数字个数为:"+countNo);
	}
	
	
	//输出在一个字符串中，指定字符串出现的次 数。
	public static void test2() {
		String ss = new String("12sdfg2312");
		System.out.println(ss);
		String s="12";
		int a,len,count=0;
	    len=s.length();
	    a=0; 
	    a=ss.indexOf(s,a);
	    while(a!=-1)
	     {
	          count++;
	          a=a+len;
	          a=ss.indexOf(s,a);
	      }        
	    System.out.println("s1中含"+s+"的次数："+count);   
	
	
	}
	
	//比较字符串内容是否相等.(不能用equals方法实现) 
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
		System.out.println(ss.substring(1));
	}
	
	//编写程序将String类型字符串”test” 变为 “tset” 
	public static void test5() {
		StringBuffer ss = new StringBuffer("test");
		System.out.println(ss);
		ss.setCharAt(1,'s');
		ss.setCharAt(2, 'e');
		System.out.println(ss);
	}
	
	//写一个方法判断一个字符串是否对称  heh      heh
	public static void test6() {
		
		StringBuffer s = new StringBuffer("heh      heh");
		StringBuffer ss = s;
		s.reverse();
		if(ss.equals(s)) {
			System.out.println("对称");
		}else {
			System.out.println("不对称");
		}
	}
	
	//String s = "113@ ere qqq yyui",提取 113 ere qqq yyui
	public static void test7() {
		String s ="113@ ere qqq yyui";
		System.out.println(s.substring(0,3)+s.substring(4));
	}
	
	//将下面的一段文本中的各个单词的字母顺序翻 转， “To be or not to be"，
	//将变成"oT eb ro ton ot eb."。
	//字符串---》字符串数组   split(" ") 
	public static void test8() {
		String ss= "To be or not to be";
		String[] c =ss.split(" ");
		for(int i =0;i<c.length;i++) {
			char[] strings=c[i].toCharArray();
			for (int j = 0,x=c[i].length()-1; j <=x; j++,x--) {
				char temp=strings[j];
				strings[j]=strings[x];
				strings[x]=temp;
				System.out.print(" ");
			} 
			for (int j = 0; j < strings.length; j++) {
				System.out.print(strings[j]);
			}
		}
		
		
	}
	
	//String s=”name=zhangsan age=18 classNo=090728”; 
	//将上面的字符串拆分，结果如下: zhangsan 18 090728
	public static void test9() {
		String s="name=zhangsan age=18 classNo=090728";
		String[] ss =s.split(" ");
		int temp=0;
		for(int i=0;i<ss.length;i++) {
			temp=ss[i].indexOf("=");
			System.out.println(ss[i].substring(temp+1));
		}
	}
}
