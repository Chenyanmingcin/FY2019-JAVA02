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
	//���һ���ַ����еĴ�дӢ����ĸ����СдӢ�� ��ĸ���Լ���Ӣ����ĸ���� 
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
		  System.out.println("��дӢ����ĸ����Ϊ: "+countUp+"\nСдӢ����ĸ����Ϊ: "+countLow+"\n���ָ���Ϊ:"+countNo);
	}
	
	
	//�����һ���ַ����У�ָ���ַ������ֵĴ� ����
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
	    System.out.println("s1�к�"+s+"�Ĵ�����"+count);   
	
	
	}
	
	//�Ƚ��ַ��������Ƿ����.(������equals����ʵ��) 
	public static void test3() {
		String s1 ="asd";
		String s2 ="asd";
		if(s1.compareTo(s2)==0) {
			System.out.println("���");
		}else {
			System.out.println("�����");
		}
	}
	
	//��д���� ��jdk�� ȫ����Ϊ��д,���������Ļ,��ȡ�� ����DK�� ���������Ļ
	public static void test4() {
		String ss ="jdk";
		ss=ss.toUpperCase();
		System.out.println(ss);
		System.out.println(ss.substring(1));
	}
	
	//��д����String�����ַ�����test�� ��Ϊ ��tset�� 
	public static void test5() {
		StringBuffer ss = new StringBuffer("test");
		System.out.println(ss);
		ss.setCharAt(1,'s');
		ss.setCharAt(2, 'e');
		System.out.println(ss);
	}
	
	//дһ�������ж�һ���ַ����Ƿ�Գ�  heh      heh
	public static void test6() {
		
		StringBuffer s = new StringBuffer("heh      heh");
		StringBuffer ss = s;
		s.reverse();
		if(ss.equals(s)) {
			System.out.println("�Գ�");
		}else {
			System.out.println("���Գ�");
		}
	}
	
	//String s = "113@ ere qqq yyui",��ȡ 113 ere qqq yyui
	public static void test7() {
		String s ="113@ ere qqq yyui";
		System.out.println(s.substring(0,3)+s.substring(4));
	}
	
	//�������һ���ı��еĸ������ʵ���ĸ˳�� ת�� ��To be or not to be"��
	//�����"oT eb ro ton ot eb."��
	//�ַ���---���ַ�������   split(" ") 
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
	
	//String s=��name=zhangsan age=18 classNo=090728��; 
	//��������ַ�����֣��������: zhangsan 18 090728
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
