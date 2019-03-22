public class demo1{
	public static void main(String[]args){
		int[]a;
		a = new int []{1,2,3,4};
		sort(a);
		for(int k = 0;k<a.length;k++){
			System.out.println(a[k]);
		}
	}
	public static void test1(){
		
	}
	
	public static void  sort(int[] a){
		
		int temp=0;
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length-1-i;j++){
				
				if(a[j]<a[j+1]){//交换a[j] - a[j+1]
						
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
				
			}	
		}	
	}
	
}