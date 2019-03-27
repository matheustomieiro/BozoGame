public class Bozo {
	public static void main(String[] args)throws Exception {
		RolaDados dados = new RolaDados(5);
		Placar placar = new Placar();
		String escolha = new String();
		int posicao;
		int[] valores = new int[5];
		System.out.println("Bem vindo à partida...");
		for(int i=0; i<10; i++) {
			System.out.println("Pressione ENTER para começar essa rodada!");
			EntradaTeclado.leString();
			dados.rolar();
			System.out.println(dados.toString());
			System.out.println("Digite os dados que deseja trocar (separados por espaço:)");
			escolha = EntradaTeclado.leString();
			dados.rolar(escolha);
			System.out.println(dados.toString());
			System.out.println("Digite os dados que deseja trocar (separados por espaço:)");
			escolha = EntradaTeclado.leString();
			valores = dados.rolar(escolha);
			System.out.println(dados.toString());
			System.out.println(placar.toString());
			System.out.println("Digite a posição que se deseja ocupar:");
			posicao = EntradaTeclado.leInt();
			while(placar.ocupada[posicao-1]) {
				System.out.println("Posicao ocupada! Digite outra posição:");
				posicao = EntradaTeclado.leInt();
			}
			placar.add(posicao, valores);
			System.out.println(placar.toString());
		}
		System.out.println("SEU SCORE FOI DE: " + placar.getScore() + ". Parabéns!");
	}

}
