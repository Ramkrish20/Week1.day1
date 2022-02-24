package week1.day1.Assignments;

public class Calculator {

	public static void main(String[] args) {
		Calculator obj1 = new Calculator();
		obj1.add();
		obj1.sub();
		obj1.mul();
		obj1.div();
		
		

	}
	
	public int add() {
		int a = 4 ;
		int b = 5 ;
		int c = 6 ;
			int sum = a + b + c ;
  
   return sum;
   	}
	
	public int sub() {
		int a = 6 ;
		int b = 5 ;
					int subt = a - b  ;
					
     return subt;
   	}

	public double mul() {
		double a = 3.0092809;
		double b = 1.0000004;
		double mult = a *b;
				return mult;

	}
	
	public float div() {
		float a = 20.0002f;
		float b = 2.0002f;
		float divd = a/b;
			return divd;
	}
}
	

