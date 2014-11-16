package zadaca;

public class sferaPiramida {
	public static void main(String[] args) {
	

				double a, r = 5, h, H, povrsinap, povrsinas, zapreminap, zapreminas;
				H = Math.random() * 50;
				a = (r / 2) * (r / 2) + H * H;
				h = Math.sqrt(a);
				povrsinap = r * r + 2 * r * h;
				zapreminap = r * r * H / 3;
				povrsinas = 4 * r * r * Math.PI;
				zapreminas = r * r * r * Math.PI;
				System.out.println("Povrsina piramide je " + povrsinap
						+ "; Zapremina piramide je " + zapreminap
						+ "; Povrsina sfere je " + povrsinas + "; Zapremina sfere je "
						+ zapreminas);
			}


	

}
