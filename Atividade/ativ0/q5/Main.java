package q5;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		C�rculo cir = new C�rculo(); 
		Ret�ngulo ret = new Ret�ngulo();
		
		cir.setRaio(2);
		ret.setAltura(2);
		ret.setBase(2);
		
		System.out.println(ret.getArea());
		System.out.println(ret.getPerimetro());
		
		System.out.println(cir.getArea());
		System.out.println(cir.getPerimetro());
		
		ret.desenhar();
		cir.desenhar();
		
		
	}

}
