package zadaca;

public class kvadratKrugValjak {
		public static void main(String[] args) {
			double r=7, h, obimk, obimkr, povrsinak, povrsinakr, zapremina;
			int brojk;
			h=(0.5)*Math.random()*(37.2);
			obimkr=2*r*Math.PI;
			obimk=4*r;
			povrsinak=r*r;
			povrsinakr=r*r*Math.PI;
			zapremina=povrsinakr*h;
			brojk=(int)(povrsinakr/povrsinak);
			System.out.println("Obim kruga je " + obimkr + "; Obim kvadrata je " + obimk +"; Povrsina kruga je " + povrsinakr + "; Povrsina kvadrata je " + povrsinak + "; Zapremina valjka je " + zapremina + "; U krug stane " + brojk + " kvadrata." );
		}
	

}
