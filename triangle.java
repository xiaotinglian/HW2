import java.util.Scanner;
class Triangle{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("how many lines: ");
		int lines = input.nextInt();
		int Count = 1;
		for (int i = lines; i > 0; i--){
			for (int j = 1; j <= i*2; j++)
			{
				System.out.print(" ");
			}
			for (int j = 1; j <= Count; j++) 			
			{
				System.out.print(j+" ");
			}
			for (int j =Count-1; j >= 1; j--)
			{ 				
				System.out.print(j+" "); 			
			} 			 			
			
			System.out.println();
			Count++;
		}
	}
}