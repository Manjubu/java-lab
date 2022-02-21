package lambdaassignment;


public class Exercise2 {
  

public static void main(String[] args) {

	StringBuilder sb = new StringBuilder("MANJU");
	for (int i=1; i<sb.length(); i+=2)
	    sb.insert(i, ' ');
	System.out.println(sb.toString());
}
}
