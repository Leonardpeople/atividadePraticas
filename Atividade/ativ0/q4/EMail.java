package q4;

import q3.Anexo;

public class EMail {

	
	private String EndOri,EndDes,Mensagem,Data;
	private Anexo anexo1,anexo2,anexo3;
	public String getEndOri() {
		return EndOri;
	}
	public void setEndOri(String endOri) {
		EndOri = endOri;
	}
	public String getEndDes() {
		return EndDes;
	}
	public void setEndDes(String endDes) {
		EndDes = endDes;
	}
	public String getMensagem() {
		return Mensagem;
	}
	public void setMensagem(String mensagem) {
		Mensagem = mensagem;
	}
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
	public Anexo getAnexo1() {
		return anexo1;
	}
	public void setAnexo1(Anexo anexo1) {
		if ((this.anexo1 == this.anexo2) || ( this.anexo1 == this.anexo3))
		{
			System.out.println(" Já tem um anexo igual a este");
		}
		else{
			this.anexo1 = anexo1; 
		}
	
	}
	public Anexo getAnexo2() {
		return anexo2;
	}
	public void setAnexo2(Anexo anexo2) {
		if ((this.anexo2 == this.anexo1) || ( this.anexo2 == this.anexo3))
		{
			System.out.println(" Já tem um anexo igual a este");
		}
		else{
			this.anexo2 = anexo2; 
		}
	}
	public Anexo getAnexo3() {
		return anexo3;
	}
	public void setAnexo3(Anexo anexo3) {
		if ((this.anexo3 == this.anexo2) || ( this.anexo3 == this.anexo1))
		{
			System.out.println(" Já tem um anexo igual a este");
		}
		else{
			this.anexo3 = anexo3; 
		}
	}
	
	
}
