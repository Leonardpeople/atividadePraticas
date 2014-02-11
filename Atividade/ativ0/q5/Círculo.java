package q5;

public class Círculo implements FormaGeométrica{
    
	int raio;
	
	
	public int getRaio() {
		return raio;
	}

	public void setRaio(int raio) {
		this.raio = raio;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return 3.14*(this.raio*this.raio);
	}

	@Override
	public double getPerimetro() {
		// TODO Auto-generated method stub
		return (2*3.14*this.raio);
	}

	@Override
	public int desenhar() {
		// TODO Auto-generated method stub
		System.out.println(" desenho de um circulo");
		return 0;
	}

	
	
	
}
