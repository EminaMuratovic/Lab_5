package zadaca;

public class kamata {
	
		public static void main(String[] args) {

			double glavnica = 10;
			double kamata, iznos, ukupno;
			kamata = Math.random() * 16;
			iznos = kamata * glavnica / 100;
			ukupno = glavnica + iznos;
			System.out.println("Iznos je " + iznos + "; Kamata je " + kamata
					+ "; Sve ukupno je " + ukupno);
		
	}

}
