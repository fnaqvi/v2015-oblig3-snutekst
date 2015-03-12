import java.util.*;

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

	private static ArrayList<Integer> antallTegn = new ArrayList<Integer>();;

	public static ArrayList<Integer> getAntallTegn() {
		return antallTegn;
	}

	public static void baklengs(String tekst) {
		int stringLength = tekst.length();
		
		if (stringLength > 0) {
			antallTegn.add(stringLength);
			System.out.print(tekst.charAt(stringLength - 1));
			baklengs(tekst.substring(0, stringLength - 1));
		}
		else if(stringLength == 0){
			System.out.printf("\nAntall tegn ved hver utskrift: %s\n",
					getAntallTegn().toString());
			antallTegn = new ArrayList<Integer>();
		}
	}

}
