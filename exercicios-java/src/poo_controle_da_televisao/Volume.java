package poo_controle_da_televisao;

public class Volume {
	private int volume;
	
	public Volume() {
		volume = 0;
	}
	
	public Volume(int volume, int volumeTotal) {
		this.volume = volume;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	public boolean aumentarVolume(){
	    if(volume < 100){
	      volume++;
	      return true;
	      }
	    else{
	      return false;
	    }
	  }
	
	public boolean diminuirVolume(){
	    if(volume > 0){
	      volume--;
	      return true;
	      }
	    else{
	      return false;
	    }
	  }
	
	public String toString() {
		return "Volume: " + volume;
	}

}

