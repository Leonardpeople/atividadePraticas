package q5;

public class Retângulo implements FormaGeométrica{
    
	int base,altura;
	
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.base*this.altura;
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return (2*this.base) + (2*this.altura);
	}

	@Override
	public int desenhar() {
		// TODO Auto-generated method stub
		System.out.println(" DESENHO DE UM RETANGULO");
		return 0;
	}

   
}
