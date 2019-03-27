public class Dado {
	private Random rand = new Random();
	private int r;
	private int sides;
	
	public Dado() {
		this.sides = 6;
		this.r = 6;
	}
	
	public Dado(int n) {
		this.sides = n;
	}
	
	/**
	 * 
	 * @return Valor do dado
	 */
	public int getLado() {
		return r;
	}
	
	/**
	 * 
	 * @return Valor do dado
	 */
	public int rolar() {
		this.r = rand.getIntRand(1,this.sides);
		return r;
	}
	@Override
	public String toString() {
		switch(r) {
			case 1: return ("+-----+\n|     |\n|  *  |\n|     |\n+-----+");
			case 2: return ("+-----+\n|*    |\n|     |\n|    *|\n+-----+");
			case 3: return ("+-----+\n|*    |\n|  *  |\n|    *|\n+-----+");
			case 4: return ("+-----+\n|*   *|\n|     |\n|*   *|\n+-----+");
			case 5: return ("+-----+\n|*   *|\n|  *  |\n|*   *|\n+-----+");
			case 6: return ("+-----+\n|* * *|\n|     |\n|* * *|\n+-----+");
		}
		return " ";
	}
}
