import java.util.*;
class Question6Delimiter{
	public static void main(String [] args){

		Scanner input = new Scanner(System.in).useDelimiter("");
		String s;

		while (input.hasNext()){
			s = input.next();
			System.out.println(s);
		}
	}
}