public class Main {
	static char[] romanSymbols = {'I','V','X','L','C','D','M'};
	static int[] romanEquivs = {1,5,10,50,100,500,1000};	
	public static void main(String[] args) {
	}
	static public int romToDec(String romanInput) {
		int decimalOutput = 0;
		int lastEquiv = 0;
		romanInput=romanInput.toUpperCase();
		for (int inputi=romanInput.length()-1;inputi>=0;inputi-=1) {
			for (int symbolsi=0;symbolsi<romanSymbols.length;symbolsi+=1) {
				if (romanSymbols[symbolsi]==romanInput.charAt(inputi)) {
					if (romanEquivs[symbolsi]<lastEquiv) {
						decimalOutput-=romanEquivs[symbolsi];
					}
					else {
						decimalOutput+=romanEquivs[symbolsi];
					}
					lastEquiv=romanEquivs[symbolsi];
					break;
				}
			}
		}
		return decimalOutput;
	}
	static public String decToRom(int decimalInput) {
		String romanOutput="";
		return romanOutput;
	}
}