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

	// Hjelpemetode
	public static void baklengs(String tekst) {
		baklengs(tekst, tekst.length());
	}

	// Rekursive metode
	public static void baklengs(String tekst, int siste) {
		// int stringLength = tekst.length();

		if (siste > 0) {
			antallTegn.add(siste);
			System.out.print(tekst.charAt(siste - 1));
			baklengs(tekst, siste - 1);
		} else if (siste == 0) {
			System.out.printf("\nAntall tegn ved hver utskrift: %s\n",
					getAntallTegn().toString());
			antallTegn = new ArrayList<Integer>();
		}
	}

}
