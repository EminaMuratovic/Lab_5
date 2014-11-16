package zadaca;

public class ObrnutaVrijednost {
	public static void main(String[] args) {
		
		int n,cifra=0;
		n=(int)(10+Math.random()*99990);
		System.out.println(n);
		while(n!=0)
		{
			cifra=cifra*10+n%10;
			n/=10;
		}
		System.out.println(cifra);
		}

}
