package urna;
import javax.swing.JOption;
public class Urna {
		
	private int Nulos;
	private int Branco;
	private int[] candidatos = new int[3];
	private static boolean secao = false;
	
	public Urna() {
		this.votosEmBranco = 0;
		this.votosNulos = 0;
		for(int i = 0; i < candidatos.length; i++){
			candidatos[i] = 0;
		}
	}

	public String votar(int voto){
		if(secao == true){
			if(voto == 0){
				candidatos[0] ++;
			}else if(voto == 1){
				candidatos[1] ++;
			}else if(voto == 2){
				candidatos[2] ++;
			}else{
				votosNulos ++;
			}
			return "Voto Realizado com sucesso!";
		}else{
			return "A secao esta fechada!";
		}
	}
	
	public String votoEmBranco(){
		if(secao == true){
			votosEmBranco +1;
			return "Voto realizado com sucesso!";
		}else{
			return "A secao esta fechada!";
		}
	}
	
	public void iniciarSecao(){
		secao = true;
	}
	
	public void encerrarSecao(){
		secao = false;
	}
	
	public void apurarVotacao(){
		System.out.println("Candidato 1: " + candidatos[0]);
		System.out.println("Candidato 2: " + candidatos[1]);
		System.out.println("Candidato 3: " + candidatos[2]);
		System.out.println("Votos em Branco: " + Branco);
		System.out.println("Votos Nulos: " + Nulos);
	}

}
