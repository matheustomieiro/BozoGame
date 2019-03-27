public class RolaDados {
	private int qt_dados = 0;
	Dado[] dados;
	int[] valores;
	
	public RolaDados(int n) {	
		this.qt_dados = n;
		this.dados = new Dado[n];
		int i;
		for(i=0; i<this.qt_dados; i++) {
			dados[i] = new Dado();
		}
		this.valores = new int[this.qt_dados];
	}
	
	/**
	 * 
	 * @return Retorna um vetor de inteiros, com o valor dos dados.
	 */
	public int[] rolar() {
		int i;
		for(i=0; i<this.qt_dados; i++) {
			this.valores[i] = this.dados[i].rolar();
		}
		return this.valores;
	}
	
	/**
	 * 
	 * @param quais Vetor de booleanos que representa troca em respectivas posicoes
	 * @return Retorna um vetor de inteiros com os valores de cada dado.
	 */
	public int[] rolar(boolean[] quais) {
		int i;
		for(i=0; i<this.qt_dados; i++) {
			if(quais[i]) {
				this.valores[i] = this.dados[i].rolar();
			}
		
		}
		
		return this.valores;
	}
	
	/**
	 * 
	 * @param str String que contem os dados a serem rolados novamente
	 * @return Retorna um vetor de inteiros com o valor de cada dado;
	 */
	public int[] rolar(String str) {
		boolean[] quais = new boolean[this.qt_dados];
		char verify;
		for(int i=0; i<str.length(); i++) {
			verify = str.charAt(i);
			try{
				if(verify != ' ') {
					quais[Character.getNumericValue(verify)-1] = true;
				}
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("Valor incorreto! Você perdeu uma chance!");
				System.out.println("Digite um valor adquado:");
			}
			
		}
		return rolar(quais);
	}
	
	@Override
	public String toString() {
		String[] vetstr = new String[this.qt_dados];
		for(int i=0; i<this.qt_dados; i++) {
			vetstr[i] = dados[i].toString();
		}
		String aux = new String();
		for(int i=0; i<this.qt_dados; i++) {
			aux += (i+1) + "\t\t";
		}
		aux += "\n";
		for(int i=0; i<5; i++) {
			for(int j=0; j<this.qt_dados; j++) {
				for(int k=0; k<vetstr[j].length(); k++) {
					if(vetstr[j].charAt(k) == '\n') {
						vetstr[j] = vetstr[j].substring(k+1,vetstr[j].length());
						break;
					}
					aux += vetstr[j].charAt(k);
				}
				aux += "\t\t";
			}
			aux += "\n";
		}
		return aux;
	}
}
