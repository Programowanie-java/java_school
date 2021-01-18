
class FunkcjeTworzenie{
	public static void main(String [] arg){
		
		double a = 4;
		double b = 9;
		double c = 12;
		
		double delta = obliczDelte(a,b,c);
			System.out.println("Delta = "+delta);
			if(delta<0){
				System.out.println("Delta ujemna brak miejsc zerowych");
			} else if(delta == 0){
				double x1 = miejsceZerowe(delta,a,b,0);
				System.out.println("x1=x2 = "+x1);
			} else {
				double x1 = miejsceZerowe(delta,a,b,1);
				double x2 = miejsceZerowe(delta,a,b,-1);
				System.out.println("x1 = "+x1);
				System.out.println("x2 = "+x2);
			}
	}
	
	private static double obliczDelte(double a,double b, double c){
		return b*b-4*a*c;
	}
	
	private static double miejsceZerowe(double delta, double a, double b,int znak){ //"znak" jest dlatego że we wzorze raz jest + a raz -
		return (-b - znak*Math.sqrt(delta))/(2*a);
	}
}
