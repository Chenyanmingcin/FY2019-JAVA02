public class demo2{
	public static void expand(int[] a){
		int [] newArray = new int [a.length*2];
		System.arraycopy(a,0,newArray,0,a.length);
		a= newArray;
	}
	public static void changeArray(int[] a){
		a[0]= 10;
	
	}
	public static void printArray(int[] a){
		for(int j=0;j<a.length;j++){
			System.out.print(a[j]+"\t");
		}
		System.out.println();
	}
	public static void main(String[] args){
		int[] a = {1,2,3,4,5};
		expand(a);
		changeArray(a);
		printArray(a);
	}
}