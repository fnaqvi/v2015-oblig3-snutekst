import java.util.Scanner;


public class SnuTekst {

	public static void main(String[] args) {
		Scanner scanner;
		boolean nyttForsøk = true;
		do {
			scanner = new Scanner(System.in);
			String tekst = "";

			System.out.print("Tast inn en tekst: ");
			tekst = scanner.nextLine();

			if (tekst == "") {
				System.out.println("Tast inn teksten igjen!");
				continue;
			} else {
				System.out.print("Baklengstekst: ");
				baklengs(tekst);				
			}

			System.out.print("Vil du snu en tekst til: (J/N) ");
			String input = scanner.nextLine();
			nyttForsøk = (input.trim().toLowerCase().equals("j"));

		} while (nyttForsøk == true);

		scanner.close();
	}
	
	public static void baklengs(String tekst){
		int stringLength = tekst.length();
		if (stringLength > 0) {
			System.out.print(tekst.charAt(stringLength - 1));
			baklengs(tekst.substring(0, stringLength - 1));
			if(stringLength == 1)
				System.out.println();
		}
	}

}
