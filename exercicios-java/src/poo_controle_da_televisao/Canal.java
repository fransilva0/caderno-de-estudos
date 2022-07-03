package poo_controle_da_televisao;

public class Canal {
	private int canal;
	
	public Canal() {
		canal = 1;
	}
	
	public Canal(int canal) {
		this.canal = canal;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	public boolean proxCanal(){
	    if(canal < 10){
	      canal++;
	      return true;
	      }
	    else{
	      return false;
	    }
	  }
	
	public boolean voltarCanal(){
	    if(canal > 1){
	      canal--;
	      return true;
	      }
	    else{
	      return false;
	    }
	}
	
	
	
	public String toString() {
		return "Canal: " + canal;
	}
	
}
