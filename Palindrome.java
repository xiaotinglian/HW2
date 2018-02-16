import java.util.*;
import java.io.*;

class Palindrome{
	public static void main(String[] args){
	
		Scanner input= new Scanner(System.in);
	
		System.out.print("type your string: ");
	
		String str= input.nextLine();

		String temp="";


		for(int i = str.length()-1; i >=0; i--){
			temp+=str.charAt(i);
		}


		System.out.print("is this statement a Palindrome? ");
		System.out.println(temp.equals(str));

/*
	i dont want to delete this because its my first try.
	
		if(str.length()%2 == 0){
			for(int i=0; i<=str.length()/2; i++){
				if(str.charAt(i)==str.charAt(str.length()-i-1))
					System.out.println("it is a Palindrome");
				else
					System.out.println("it is not a Palindrome");
			}
		}
		else{
			for(int i=0; i <= (str.length()-1)/2; i++){
				if(str.charAt(i)==str.charAt(str.length()-i-1))
					System.out.println("it is a Palindrome");
				else
					System.out.println("it is not a Palindrome");
			}
		}*/
	}
}