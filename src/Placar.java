	public class Placar {
	private String[] placar = {"(1)","(2)","(3)","(4)","(5)","(6)","(7)","(8)","(9)","(10)"};
	public boolean[] ocupada = {false,false,false,false,false,false,false,false,false,false};
	public Placar() {
	}
	
	/**
	 * 
	 * @param posicao Posicao de insercao
	 * @param dados Vetor de inteiros que contem o valor de cada dado
	 */
	public void add(int posicao, int[] dados){
		posicao = posicao-1;
		int count = 0;
		if(posicao<6) {
			for(int i=0; i<5; i++) {
				if(dados[i] == (posicao+1)) {
					count++;
				}
			}
			placar[posicao] = (count*(posicao+1)) + "";
		}
		/*Se for um Full*/
		else if(posicao == 6){
			int[] vet = new int[6];
			int maior = 0, menor = 7;
			for(int i=0; i<5;i++) {
				switch(dados[i]) {
					case 1: vet[0]++;
						break;
					case 2: vet[1]++;
						break;
					case 3: vet[2]++;
						break;
					case 4: vet[3]++;
						break;
					case 5: vet[4]++;
						break;
					case 6: vet[5]++;
						break;
				}
			}
			for(int j=0; j<6; j++) {
				if(vet[j] > maior) maior = vet[j];
				if(vet[j] < menor && vet[j] != 0) menor = vet[j];
			}
			if((maior + menor) == 5) placar[posicao] = 15 + "";
			else placar[posicao] = 0 + "";
			
		}
		
		/*Se for uma Seq*/
		else if(posicao == 7){
			int[] vet = new int[6];
			int maior = 0;
			for(int i=0; i<5;i++) {
				switch(dados[i]) {
					case 1: vet[0]++;
						break;
					case 2: vet[1]++;
						break;
					case 3: vet[2]++;
						break;
					case 4: vet[3]++;
						break;
					case 5: vet[4]++;
						break;
					case 6: vet[5]++;
						break;
				}
			}
			for(int j=0; j<6; j++) {
				if(vet[j] > maior) maior = vet[j];
			}
			if((maior) == 1) placar[posicao] = 20 + "";
			else placar[posicao] = 0 + "";
			
		}
		
		/*Se for uma Quadra*/
		else if(posicao == 8){
			int[] vet = new int[6];
			int maior = 0;
			for(int i=0; i<5;i++) {
				switch(dados[i]) {
					case 1: vet[0]++;
						break;
					case 2: vet[1]++;
						break;
					case 3: vet[2]++;
						break;
					case 4: vet[3]++;
						break;
					case 5: vet[4]++;
						break;
					case 6: vet[5]++;
						break;
				}
			}
			for(int j=0; j<6; j++) {
				if(vet[j] > maior) maior = vet[j];
			}
			if(maior == 4) placar[posicao] = 30 + "";
			else placar[posicao] = 0 + "";
			
		}
	
		/*Se for uma Quina*/
		else if(posicao == 9){
			for(int i=0; i<4; i++) {
				if(dados[i] == dados[i+1]) {
					placar[posicao] = 40 + "";
				}
				else placar[posicao] = 0 + "";
			}
			if(placar[posicao] != "40") {
				placar[posicao] = 0 + "";
			}
		}
		
		ocupada[posicao] = true;
	}
	
	/**
	 * 
	 * @return Retorna um inteiro que representa a pontuacao
	 */
	public int getScore(){
		int value = 0;
		for(int i=0; i<10; i++) {
			if(ocupada[i]) {
				value += Integer.parseInt(placar[i]);
			}
		}
		return value;
	}
	
	@Override
	public String toString() {
		String aux = new String();
		aux += (placar[0] + "\t|\t" + placar[6] + "\t|\t" + placar[3] + "\n");
		aux += ("---------------------------------------" + "\n");
		aux += (placar[1] + "\t|\t" + placar[7] + "\t|\t" + placar[4] + "\n");
		aux += ("---------------------------------------" + "\n");
		aux += (placar[2] + "\t|\t" + placar[8] + "\t|\t" + placar[5] + "\n");
		aux += ("---------------------------------------" + "\n");
		aux += ("\t|\t" + placar[9] + "\t|\t" + "\n");
		aux += ("        +---------------+ " + "\n");
		return aux;
	}
}
