package poo_elevador_do_predio;

public class Elevador {
	private int totalDeAndares;
	  private int totalDePessoas;
	  private int quatAtualPessoas;
	  private int andarAtual;


	  public Elevador(){
	    this.totalDeAndares=0;
	    this.totalDePessoas=0;
	    this.andarAtual=0;
	    this.quatAtualPessoas=0;
	  }
	  
	  public Elevador(int totalDeAndares, int totalDePessoas){
	    this.totalDeAndares=totalDeAndares;
	    this.totalDePessoas=totalDePessoas;
	    this.andarAtual=0;
	    this.quatAtualPessoas=0;
	  }

	  public int getTotalDeAndares(){
	    return totalDeAndares;
	  }
	  
	  public int  getAndarAtual() {
		  return andarAtual;
	  }
	  
	  public void setAndarAtual(int andarAtual) {
		  this.andarAtual = andarAtual;
	  }
	  
	  public int getQuatAtualPessoas(){
		    return quatAtualPessoas;
		  }

	  public boolean entrar(){
	    if(quatAtualPessoas<totalDePessoas){
	      quatAtualPessoas++;
	      return true;
	      }
	    else{
	      return false;
	    }
	    //...
	  }

	  public boolean sair(){
	    if(quatAtualPessoas==0){
	      return false;
	      }
	    else{
	      quatAtualPessoas--;
	      return true;
	    }
	  }
	    public void sobe(int novoAndar){
	      if(novoAndar<=andarAtual){
	        System.out.println("Você já está neste andar!");
	        return;
	      }
	      if(novoAndar>totalDeAndares){
	        System.out.println("O andar " + novoAndar + " não existe");
	        return;
	      }
	      andarAtual=novoAndar;
	    }

	    public void desce(int novoAndar){
	      if(novoAndar>=andarAtual || novoAndar<0){
	        System.out.println("O andar " + novoAndar + " é menor que o andar final (0), logo ele não existe, ou você já está neste andar." );
	      }
	      else
	        andarAtual=novoAndar;
	    }

	    public String toString(){
	      return "Andr Atual: "+andarAtual+"\nQuant. de pessoas: "+quatAtualPessoas+"\nCapacidade total: "+totalDePessoas+"\nQuant.  de andares: "+totalDeAndares; 
	    //...
	  }
}
