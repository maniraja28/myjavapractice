package collectionspractice;

public class Array {
	public static void main(String[] args) {
		//arrays are homogenous
		//arrays are fixed in size
		//arrays are not growable or dynamic
		//order is preserved duplicates are allowed
		
		
		int arr[]=new int[4];
		arr[0]=1;
		arr[1]=5;
		arr[3]=10;
		arr[2]=5;
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		String str[]=new String[3];
		str[0]="raja";
		str[1]="ravi";
		str[2]="prasad";
	
		
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		
		
	}

}
