package test;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double pi= 3.14; // constante
		//pi=3.133; impossible avec le mot final
		
		String z="123";
		int y=8;
		double x=7.23;
		//int y=x; faux
		x=y;
		y= (int) x; // cast
		y=Integer.parseInt(z);
		x=Double.parseDouble(z); // parsing (conversion)
		char c='h'; // c="h" faux
		String ch="hello"; // '' est correcte aussi
int a=7;
int b=3;
double rs=a/b;
int za= (int) (a / b);
za= a % b; // modulo a,b
		
		
		
	}

}
