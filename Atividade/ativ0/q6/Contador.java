package q6;

public class Contador {

	int valor;
	boolean verifica=false;

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public void incrementar()
	{
		this.valor=this.valor+1;
		this.verifica=true;
	}
	
	public void desfazer(){
		if (this.verifica){
			this.valor=this.valor-1;
			this.verifica=false;
		}
		else{
			System.out.println(" Voce nao pode usar esse metodo agora!");
		}
		
		
	}

	public Contador(int valor) {
		super();
		if (valor==0){
			this.valor = valor;	
		}
		else{
			System.out.println(" o contador deve ser iniciado com 0");
		}
		
		
	}
	
	
}
