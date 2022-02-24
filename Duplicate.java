package week1.day1.Assignments;

public class Duplicate {

	public static void main(String[] args) {
		
		int []arr= {12,14,13,14,15,17,16,18,20,12,19,19};

		System.out.println("print duplicate numbers");
		for(int i=0;i<arr.length;i++) {
			for(int j=1+i;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]+":"+arr[j]);
				}

			}
		}
	}

}