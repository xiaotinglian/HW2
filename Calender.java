import java.util.*;

class Calender {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter year: ");
		int year = input.nextInt();

		System.out.print("Enter first day of the year: ");
		int day = input.nextInt();

		String month; 
		for (int mon = 1; mon <= 12; mon++) {
			month = "";
			switch (mon) { 
				case 1: month = "January "; break;
				case 2: month = "February "; break;
				case 3: month = "March "; break;
				case 4: month = "April "; break;
				case 5: month = "May "; break;
				case 6: month = "June "; break;
				case 7: month = "July "; break;
				case 8: month = "August "; break;
				case 9: month = "September "; break;
				case 10: month = "October "; break;
				case 11: month = "November "; break;
				case 12: month = "December "; break;
			}
			month += year;

			for (int b = 0; b < 23 - (month.length() / 2); b++) {
				System.out.print(" ");
			}

			System.out.println(month);
			System.out.println("Sun    Mon    Tue    Wed    Thu    Fri    Sat");

			day %= 7;
			for (int b = 0; b <= day * 7; b++) {
				System.out.print(" ");
			}

			int LDOM = 0;
			if ( mon == 1 || mon == 3  || mon == 5 || mon == 7 ||
				  mon == 8 || mon == 10 ||mon == 12)
				LDOM = 31;
			else if (mon == 4 || mon == 6 || mon == 9 || mon == 11)
				LDOM= 30;
			else { // Test for leap year
				if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
					LDOM= 29;
				else
					LDOM= 28;
			}

			for (int d = 1; d <= LDOM; d++) {
				if (d < 10) 
					System.out.print(" ");
				if (day % 7 == 6)
					System.out.print(d + "\n ");
				else {
					System.out.print(d + "     ");
					if (d == LDOM) 
						System.out.println();
				}
				day++;

			}
			System.out.println();
		}
	}
}  