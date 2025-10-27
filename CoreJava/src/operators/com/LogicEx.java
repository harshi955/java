package operators.com;

public class LogicEx {

	public static void main(String[] args) {
		int a=5,b=3;
		System.out.println("a<b && b>15 :"+(a<b && b<15));
		System.out.println("a<b || b>15 :"+(a<b || b<15));
		System.out.println(" !a<b :"+(a<b));//logical operators
		
		
		
		String results=(a>b) ? "a is greater" : "b is greater";
		System.out.println(results);// tenary operators
		
		
		System.out.println("a & b :"+(a&b));

		System.out.println("a | b :"+(a|b));

		System.out.println("a ^ b :"+(a^b));

		System.out.println("~a  :"+(~a)); // Bitwise operators
		
		
		System.out.println("a << 1 :"+(a<<1) );
		System.out.println("a >> 1 :"+(a>>1) );
		System.out.println("a >>> 1 :"+(a>>>1) );//shift operators
		
		
		String str="12345";
		System.out.println(" text instanceof String :"+(str instanceof String));// instance of operators
		
		
		

	}

}
