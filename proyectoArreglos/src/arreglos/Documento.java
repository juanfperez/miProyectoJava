package arreglos;

/**
 * Esta clase define un documento gen�rico
 * @author JuanFernando
 *
 */
public class Documento {
	
	private String t�tulo;
	
	private String autor;
	
	private int a�o;  
	
	public Documento(String t�tulo, String autor, int a�o){
		this.t�tulo = t�tulo;
		this.autor = autor;
		this.a�o = a�o;
	}
	
	public Documento(String t�tulo, String autor){
		this.t�tulo = t�tulo;
		this.autor = autor;
		this.a�o = 0;
	}
	
	public Documento(){
		this.t�tulo = "";
		this.autor = "";
		this.a�o = 0;
	}
}
