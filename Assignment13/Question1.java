package Assignment13;

import java.util.HashMap;
import java.util.Scanner;

public class Question1 {
	
			public static HashMap<String, String> date = new HashMap<String, String>();
			public static HashMap<String, String> month = new HashMap<String, String>();
			public static HashMap<String, String> leftYear = new HashMap<String, String>();
			public static HashMap<String, String> rightYear = new HashMap<String, String>();

			public static void genData() {
				date.put("01", "First");
				date.put("02", "Second");
				date.put("03", "Third");
				date.put("04", "Fourth");
				date.put("05", "Fifth");
				date.put("06", "Sixth");
				date.put("07", "Seventh");
				date.put("08", "Eighth");
				date.put("09", "Nineth");
				date.put("10", "Tenth");
				date.put("11", "Eleventh");
				date.put("12", "Tweleveth");
				date.put("13", "Thirteenth");
				date.put("14", "Fourteenth");
				date.put("15", "Fifteenth");
				date.put("16", "Sixteenth");
				date.put("17", "Seventeenth");
				date.put("18", "Eighteenth");
				date.put("19", "Nineteenth");
				date.put("20", "Twenty");
				date.put("21", "Twenty First");
				date.put("22", "Twenty Second");
				date.put("23", "Twenty Third");
				date.put("24", "Twenty Fourth");
				date.put("25", "Twent Fifth");
				date.put("26", "Twenty Sixth");
				date.put("27", "Twenty Seventh");
				date.put("28", "Twenty Eighth");
				date.put("29", "Twenty Nineth");
				date.put("30", "Thirty");
				date.put("31", "Thirty First");

				month.put("01", "January");
				month.put("02", "February");
				month.put("03", "March");
				month.put("04", "April");
				month.put("05", "May");
				month.put("06", "June");
				month.put("07", "July");
				month.put("08", "August");
				month.put("09", "September");
				month.put("10", "October");
				month.put("11", "November");
				month.put("12", "December");

				leftYear.put("07", "Seven");
				leftYear.put("08", "Eight");
				leftYear.put("09", "Nine");
				leftYear.put("10", "Ten");
				leftYear.put("11", "Eleven");
				leftYear.put("12", "Tweleve");
				leftYear.put("13", "Thirteen");
				leftYear.put("14", "Fourteen");
				leftYear.put("15", "Fifteen");
				leftYear.put("16", "Sixteen");
				leftYear.put("17", "Seventeen");
				leftYear.put("18", "Eighteen");
				leftYear.put("19", "Nineteen");
				leftYear.put("20", "Twenty");
				leftYear.put("21", "Twenty One");
				leftYear.put("22", "Twenty Two");

				rightYear.put("00", "Hundred");
				rightYear.put("10", "Ten");
				rightYear.put("20", "Twenty");
				rightYear.put("30", "Thirty");
				rightYear.put("40", "Forty");
				rightYear.put("50", "Fifty");
				rightYear.put("60", "Sixty");
				rightYear.put("70", "Seventy");
				rightYear.put("80", "Eighty");
				rightYear.put("90", "Ninety");
			}

			public static String convert(String dateInput) {
				String d = dateInput.substring(0, 2);
				String m = dateInput.substring(3, 5);
				String yL = dateInput.substring(6, 8);
				String yR = dateInput.substring(8, 10);
				return date.get(d) + " " + month.get(m) + " " + leftYear.get(yL) + " " + rightYear.get(yR);
			}

			public static void main(String args[]) {

				genData();
				Scanner sc=new Scanner(System.in);
				String s=sc.nextLine();
				System.out.println(s);
				System.out.println(convert(s));

				System.out.println("\n21-11-1990");
				System.out.println(convert("21-11-1990"));


			}
		
	}

